//Martin Holysh
//May 28
//Using 2d graphics to make battle scene 
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
    private Image player = new ImageIcon("src//gertrogan//gertrude.png").getImage();
    public Battle(Overworld o, BattleS battleS) {

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
        
        this.setBackground(Color.DARK_GRAY);
        overworld = o;
        this.battleS = battleS;
        health = overworld.gertrude.getHealth();
        enemyHealth = overworld.gromlin.getHealth();
        System.out.println(enemyHealth);
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

    public void keyTyped(KeyEvent e) {
        //not needed
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //will see if space bar is pressed to attack or to continue 
        if (keyCode == KeyEvent.VK_SPACE && xSpeed != 0) {
            pushed = true; //used for text
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
            hurt2 = damage;
        } else if (keyCode == KeyEvent.VK_SPACE && xSpeed == 0) {
            pushed = false;
            enemyHitDetector = overworld.gromlin.doDamage();
            enemyAttack = (overworld.gromlin.getAttack())*(enemyHitDetector);
            if (enemyHitDetector == 0) {
                eMessage = "ENEMY MISSED! " + enemyAttack + " DAMAGE";
            }else if(enemyHitDetector == 1){
                eMessage = "ENEMY HIT " + enemyAttack + " DAMAGE";
            }else{
                eMessage = "ENEMY CRIT " + enemyAttack + " DAMAGE";
            }
            hurt = enemyAttack;
            first = true;
            xPos = 100;
            xSpeed = 15;

        }

    }

    public void keyReleased(KeyEvent e) {
        //not needed
    }

    //will do the actual drawing
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(player, 170, 200, null);
        
        g2d.setFont(new Font("Courier", Font.BOLD, 18));
        g2d.setColor(Color.black);
        g2d.fillRect(50, 650, 700, 50);
        g2d.fillRect(500, 400, 300, 200);
         g2d.setColor(Color.WHITE);
        if (pushed == true) {
            g2d.drawString(message, 525, 500);
            g2d.drawString("(press space to continue)", 515, 550);
        }
        if(pushed == false){
        g2d.drawString(eMessage, 525, 500);
        }     
        
        //will only randomize once so when the drawing is redone it is not rerandomized 
        if (first == true) {
            rand = (int) (Math.random() * 300) + 50;
            first = false;
        }
        g2d.setColor(Color.pink);
        g2d.fillRect(rand, 650, 400, 50);
        g2d.setColor(Color.red);
        g2d.fillRect(rand + 175, 650, 50, 50);
        g2d.setColor(Color.gray);
        g2d.fillRect(xPos, 650, 25, 50);

        g2d.setColor(Color.black);//draw health bar background(player)
        g2d.fillRoundRect(100, 125, 200, 25, 20, 20);
        g2d.setColor(Color.black);//draw health bar background(enemy)
        g2d.fillRoundRect(500, 125, 200, 25, 20, 20);
        g2d.setColor(Color.red);
        if (hurt2 > 0) {
            enemyHealth -= 1;
            hurt2 -= 1;
        }
        g2d.fillRoundRect(500, 125, enemyHealth * 2, 25, 20, 20);//enemy health
        overworld.gromlin.setHealth(enemyHealth);
        if (overworld.gromlin.getHealth() <= 0) {
            overworld.updateCharacterLocation(overworld.gromlin, 0, 0);
            overworld.updateCharacterLocation(overworld.gertrude, overworld.gertrude.getCol(), overworld.gertrude.getRow());
            overworld.setVisible(true);
            battleS.setVisible(false);
            this.setVisible(false);
            if (clip.isRunning()) clip.stop();
            overworld.startMusic();

        } else {
            if (hurt > 0) {
                health -= 1;
                hurt -= 1;
            }
            overworld.gertrude.setHealth(health);
        }
        g2d.fillRoundRect(100, 125, health * 2, 25, 20, 20); //Player health
        
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);//prepares the panel for drawing
        doDrawing(g);
    }
}
