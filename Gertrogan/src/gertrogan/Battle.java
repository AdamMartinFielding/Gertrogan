//Martin Holysh
//May 28
//Using 2D graphics to make battle scene, as well as running calculations for variables regarding health, attack, and running music
package gertrogan;

/**
 *
 * @author mardy347
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;

public class Battle extends JPanel implements KeyListener {

    private Clip clip;
    private boolean pressed = false;
    Overworld overworld;
    BattleS battleS;
    Death death;
    private int xPos = 100;
    private int xSpeed = 20;
    private boolean first = true;
    private int enemyAttack;
    private int rand;
    private int damage;
    private int health;
    private int enemyHealth;
    private int hurt;
    private int hurt2;
    private String message = "";
    private String eMessage = "";
    private boolean pushed;
    private int enemyHitDetector;
    private ImageIcon player;
    private ImageIcon enemy;
    private int playerHealthPer;
    private int enemyHealthPer;

    /**
     *
     * @param o
     * @param battleS
     */
    public Battle(Overworld o, BattleS battleS) {

        //Implements the battle track into the game, looping it as long as the player battles
        try {
            // Open an audio input stream.
            File soundFile = new File("src\\gertrogan\\Fight Music.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        //Creates the background
        this.setBackground(Color.DARK_GRAY);
        //Saving the state of overworld for later use
        overworld = o;
        //Getting image resources of both player and enemy sprites
        player = overworld.gertrude.getBattleImage();
        enemy = overworld.getEnemyImageIcon();
        //Create new battle form
        this.battleS = battleS;
        //Getting health values of both enemy and players
        health = overworld.gertrude.getHealth();
        enemyHealth = overworld.getEnemyHealth();
        //Opens an action listener to wait for player input
        ActionListener al = new ActionListener() {
            //when the timer ticks
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (xPos > 724) {//will move slider 
                    xSpeed = -xSpeed;
                    //will change diretion
                }
                if (xPos < 51) {
                    xSpeed = -xSpeed;
                    //will change diretion
                }
                xPos = xPos + xSpeed;
                //will add to xpos to move slider
                repaint(); //redraw the panel
            }
        };

        //make a new timer, and attach it to the action listener
        //the timer fires every 20 ms
        Timer timer = new Timer(20, al);
        //start the timer going
        timer.start();
        setFocusable(true);
        this.addKeyListener(this);
    }

    /**
     * Required only for import purposes
     *
     * @param e
     */
    public void keyTyped(KeyEvent e) {
        //not needed
    }

    /**
     * Code executed when a key is inputted
     *
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //will see if space bar is pressed to attack or to continue 
        if (keyCode == KeyEvent.VK_SPACE && xSpeed != 0) {
            pushed = true; //used for text
            //stop the slider
            xSpeed = 0;
            if (xPos > rand + 175 && xPos < rand + 225) {//check to see if slider hits
                damage = overworld.gertrude.getAttack() * 3;
                message = "CRIT " + damage + " DAMAGE";
            } else if (xPos > rand && xPos < rand + 400) {
                damage = overworld.gertrude.getAttack();
                message = "HIT " + damage + " DAMAGE";
            } else {
                damage = 0;
                message = "MISS " + damage + " DAMAGE";
            }
            //Animates health for visual effect
            hurt2 = damage;
            //The enemy's turn to attack. Their own calculations play and a value is given where they hit, miss, or crit the player
        } else if (keyCode == KeyEvent.VK_SPACE && xSpeed == 0) {
            pushed = false;
            enemyHitDetector = overworld.enemyAttack();
            enemyAttack = (overworld.getEnemyAttack()) * (enemyHitDetector);
            if (enemyHitDetector == 0) {
                eMessage = "ENEMY MISSED! " + enemyAttack + " DAMAGE";
            } else if (enemyHitDetector == 1) {
                eMessage = "ENEMY HIT " + enemyAttack + " DAMAGE";
            } else {
                eMessage = "ENEMY CRIT " + enemyAttack + " DAMAGE";
            }
            hurt = enemyAttack;
            first = true;
            //Restart the slider
            xPos = 100;
            xSpeed = 15;

        }

    }

    /**
     * Required only for import purposes
     *
     * @param e
     */
    public void keyReleased(KeyEvent e) {
        //not needed
    }

    /**
     * Method to draw the slider, health, and text box shapes
     *
     * @param g
     */
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw coordinates and place images of player and enemy
        g2d.drawImage(player.getImage(), 100, 170, null);
        if (overworld.enemy3Battle) {
            g2d.drawImage(enemy.getImage(), 400, 150, null);
        } else {
            g2d.drawImage(enemy.getImage(), 470, 160, null);
        }

        g2d.setFont(new Font("Courier", Font.BOLD, 18));

        //Draws the slider mechanic
        g2d.setColor(Color.black);
        g2d.fillRect(50, 650, 700, 50);
        g2d.fillRect(500, 400, 300, 200);//will draw text box 
        g2d.setColor(Color.WHITE);
        if (pushed == true) { //if the button is pushed will draw text for player
            g2d.drawString(message, 525, 500);
            g2d.drawString("(press space to continue)", 515, 550);
        }
        if (pushed == false) { //if button is pushed agian enemy text will apear 
            g2d.drawString(eMessage, 525, 500);
        }

        //will only randomize once so when the drawing is redone it is not rerandomized 
        if (first == true) {
            rand = (int) (Math.random() * 300) + 50;
            first = false;
        }
        g2d.setColor(Color.pink);
        g2d.fillRect(rand, 650, 400, 50); //will draw hit section and crit hit sections
        g2d.setColor(Color.red);
        g2d.fillRect(rand + 175, 650, 50, 50);
        g2d.setColor(Color.gray);
        g2d.fillRect(xPos, 650, 25, 50);

        g2d.setColor(Color.black);//draw health bar background(player)
        g2d.fillRoundRect(100, 125, 200, 25, 20, 20);
        g2d.setColor(Color.black);//draw health bar background(enemy)
        g2d.fillRoundRect(500, 125, 200, 25, 20, 20);
        g2d.setColor(Color.red);

        if (overworld.gertrude.getHealth() <= 0) {
            death = new Death(overworld.stage, 10, overworld.enemiesKilled);

            death.setVisible(true);
            battleS.setVisible(false);
            this.setVisible(false);
            if (clip.isRunning()) {
                clip.stop();
            }
        } else {//will make health bar look likes its moving down
            if (hurt2 > 0) {
                enemyHealth -= 1;
                hurt2 -= 1;
            }
        }

        overworld.setEnemyHealth(enemyHealth);//will set enemies health
        enemyHealthPer = (int) (((double) overworld.getEnemyHealth() / (double) overworld.getEnemyMaxHealth()) * 100);
        g2d.fillRoundRect(500, 125, enemyHealthPer * 2, 25, 20, 20);//enemy health
        //if enemy dies will add exp and go back to overworld
        if (overworld.getEnemyHealth() <= 0) {
            overworld.gertrude.setExp(overworld.gertrude.getExp() + 20);
            if (overworld.gertrude.getExp() >= overworld.gertrude.getExpToNext()) {//if level up
                overworld.gertrude.setExpToNext(overworld.gertrude.getExpToNext() + (20 * overworld.gertrude.getLevel())); //will raise exp high
                overworld.gertrude.setLevel(overworld.gertrude.getLevel() + 1);//will add level
                overworld.gertrude.setExp(0);//will reset exp
            }
            //System.out.println(overworld.gertrude.getExp() + "/" + overworld.gertrude.getExpToNext() + " " +  overworld.gertrude.getLevel());
            overworld.endEnemyBattle();

            overworld.updateCharacterLocation(overworld.gertrude, overworld.gertrude.getCol(), overworld.gertrude.getRow());
            overworld.setVisible(true);//will hide battle and bring back overworld
            battleS.setVisible(false);
            this.setVisible(false);
            if (clip.isRunning()) {//will stop music
                clip.stop();
            }
            overworld.startMusic();

        } else {//will make health bar look likes its moving down
            if (hurt > 0) {
                health -= 1;
                hurt -= 1;
            }
            overworld.gertrude.setHealth(health);
        }
        playerHealthPer = (int) (((double) overworld.gertrude.getHealth() / (double) overworld.gertrude.getMaxHealth()) * 100);
        g2d.fillRoundRect(100, 125, playerHealthPer * 2, 25, 20, 20); //Player health

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);//prepares the panel for drawing
        doDrawing(g);
    }
}
