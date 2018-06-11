/*
Adam Fielding

The class that controls the design and coding of the main naviagtion system and enemy collision system
Implements sound and graphics
 */
package gertrogan;


import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class Overworld extends javax.swing.JFrame implements KeyListener {

    BattleS battles;

    private Clip clip;
    private ImageIcon protagonistTile = new ImageIcon("src\\gertrogan\\tileGertrude.png");;
    private ImageIcon tile = new ImageIcon("src\\gertrogan\\tileDefault.png");
    private ImageIcon gromlinTile = new ImageIcon("src\\gertrogan\\tileGromlin.png");
    private ImageIcon BengurtleTile = new ImageIcon("src\\gertrogan\\tileBengurtle.png");
    private ImageIcon DajingTile = new ImageIcon("src\\gertrogan\\tileDajing.png");
    
    private ImageIcon protagonist = new ImageIcon("src\\gertrogan\\gertrude battle.png");
    private ImageIcon gromlin = new ImageIcon("src\\gertrogan\\gromlin battle.png");
    private ImageIcon Bengurtle = new ImageIcon("src\\gertrogan\\Grogurt big.png");
    private ImageIcon Dajing = new ImageIcon("src\\gertrogan\\Dajing battle.png");
    public Protagonist gertrude = new Protagonist(protagonistTile, protagonist, "gertrude", 100, 10, 1, 5);
    public BasicEnemy enemy1 = new BasicEnemy(gromlinTile, gromlin, 100, 10, 9, 2);
    public BasicEnemy enemy2 = new BasicEnemy(gromlinTile, gromlin, 0, 10, 9, 2);
    public BasicEnemy enemy3 = new BasicEnemy(gromlinTile, gromlin, 0, 10, 9, 2);
    
    public int enemiesKilled;
    
    private boolean enemy1Battle = false;
    private boolean enemy2Battle = false;
    public boolean enemy3Battle = false;
    
    private boolean area1Active;
    private boolean area2Active;
    private boolean area3Active;
    
    public int stage = 0;
    private int area = 1;
    
    
    
 
    public Overworld() {
        initComponents();
        setFocusable(true);
        this.addKeyListener(this);
        setArea1();
        startMusic();
    }
    
    public void setArea1(){
        area1Active = true;
        area3Active = false;
        stage++;
        area = 1;
        lblPath.setText("");
        lblStage.setText("Stage: " + stage);
        lblArea.setText("Area: " + area);
        
        gertrude.setCol(1);
        gertrude.setRow(5);
        
        enemy1 = new BasicEnemy(gromlinTile, gromlin, 100, 10, 9, 2);
        

        
        updateCharacterLocation(gertrude, gertrude.getCol(), gertrude.getRow());
        updateCharacterLocation(enemy1, enemy1.getCol(), enemy1.getRow());
    }
    
    public void setArea2(){
        area1Active = false;
        area2Active = true;
        area = 2;
        gertrude.setCol(1);
        gertrude.setRow(5);
        
        lblPath.setText("");
        
        enemy1 = new BasicEnemy(gromlinTile, gromlin, 100, 10, 9, 2);
        enemy2 = new BasicEnemy(DajingTile, Dajing, 110, 10, 6, 6);
        updateCharacterLocation(enemy1, enemy1.getCol(), enemy1.getRow());
        updateCharacterLocation(enemy2, enemy2.getCol(), enemy2.getRow());
        updateCharacterLocation(gertrude, gertrude.getCol(), gertrude.getRow());
    }
    
    public void setArea3(){
        area2Active = false;
        area3Active = true;
        area = 3;
        gertrude.setCol(1);
        gertrude.setRow(5);
        
        lblPath.setText("");
        
        enemy3 = new BasicEnemy(BengurtleTile, Bengurtle, 200, 15, 10, 5);
        updateCharacterLocation(enemy3, enemy3.getCol(), enemy3.getRow());
        updateCharacterLocation(gertrude, gertrude.getCol(), gertrude.getRow());
    }
    
    

    public void startMusic() {
        try {
         // Open an audio input stream.
            File soundFile = new File("src\\gertrogan\\Overworld Music.wav");
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
    }

    
    public void updateCharacterLocation(AbstractCharacter character, int newCol, int newRow) {
        int col = character.getCol();
        int row = character.getRow();
        if (col == 1) {
            if (row == 1) {
                A1.setIcon(tile);
            } else if (row == 2) {
                A2.setIcon(tile);
            } else if (row == 3) {
                A3.setIcon(tile);
            } else if (row == 4) {
                A4.setIcon(tile);
            } else if (row == 5) {
                A5.setIcon(tile);
            } else if (row == 6) {
                A6.setIcon(tile);
            } else if (row == 7) {
                A7.setIcon(tile);
            } else if (row == 8) {
                A8.setIcon(tile);
            }
        } else if (col == 2) {
            if (row == 1) {
                B1.setIcon(tile);
            } else if (row == 2) {
                B2.setIcon(tile);
            } else if (row == 3) {
                B3.setIcon(tile);
            } else if (row == 4) {
                B4.setIcon(tile);
            } else if (row == 5) {
                B5.setIcon(tile);
            } else if (row == 6) {
                B6.setIcon(tile);
            } else if (row == 7) {
                B7.setIcon(tile);
            } else if (row == 8) {
                B8.setIcon(tile);
            }
        } else if (col == 3) {
            if (row == 1) {
                C1.setIcon(tile);
            } else if (row == 2) {
                C2.setIcon(tile);
            } else if (row == 3) {
                C3.setIcon(tile);
            } else if (row == 4) {
                C4.setIcon(tile);
            } else if (row == 5) {
                C5.setIcon(tile);
            } else if (row == 6) {
                C6.setIcon(tile);
            } else if (row == 7) {
                C7.setIcon(tile);
            } else if (row == 8) {
                C8.setIcon(tile);
            }
        } else if (col == 4) {
            if (row == 1) {
                D1.setIcon(tile);
            } else if (row == 2) {
                D2.setIcon(tile);
            } else if (row == 3) {
                D3.setIcon(tile);
            } else if (row == 4) {
                D4.setIcon(tile);
            } else if (row == 5) {
                D5.setIcon(tile);
            } else if (row == 6) {
                D6.setIcon(tile);
            } else if (row == 7) {
                D7.setIcon(tile);
            } else if (row == 8) {
                D8.setIcon(tile);
            }
        } else if (col == 5) {
            if (row == 1) {
                E1.setIcon(tile);
            } else if (row == 2) {
                E2.setIcon(tile);
            } else if (row == 3) {
                E3.setIcon(tile);
            } else if (row == 4) {
                E4.setIcon(tile);
            } else if (row == 5) {
                E5.setIcon(tile);
            } else if (row == 6) {
                E6.setIcon(tile);
            } else if (row == 7) {
                E7.setIcon(tile);
            } else if (row == 8) {
                E8.setIcon(tile);
            }
        } else if (col == 6) {
            if (row == 1) {
                F1.setIcon(tile);
            } else if (row == 2) {
                F2.setIcon(tile);
            } else if (row == 3) {
                F3.setIcon(tile);
            } else if (row == 4) {
                F4.setIcon(tile);
            } else if (row == 5) {
                F5.setIcon(tile);
            } else if (row == 6) {
                F6.setIcon(tile);
            } else if (row == 7) {
                F7.setIcon(tile);
            } else if (row == 8) {
                F8.setIcon(tile);
            }
        } else if (col == 7) {
            if (row == 1) {
                G1.setIcon(tile);
            } else if (row == 2) {
                G2.setIcon(tile);
            } else if (row == 3) {
                G3.setIcon(tile);
            } else if (row == 4) {
                G4.setIcon(tile);
            } else if (row == 5) {
                G5.setIcon(tile);
            } else if (row == 6) {
                G6.setIcon(tile);
            } else if (row == 7) {
                G7.setIcon(tile);
            } else if (row == 8) {
                G8.setIcon(tile);
            }
        } else if (col == 8) {
            if (row == 1) {
                H1.setIcon(tile);
            } else if (row == 2) {
                H2.setIcon(tile);
            } else if (row == 3) {
                H3.setIcon(tile);
            } else if (row == 4) {
                H4.setIcon(tile);
            } else if (row == 5) {
                H5.setIcon(tile);
            } else if (row == 6) {
                H6.setIcon(tile);
            } else if (row == 7) {
                H7.setIcon(tile);
            } else if (row == 8) {
                H8.setIcon(tile);
            }
        } else if (col == 9) {
            if (row == 1) {
                I1.setIcon(tile);
            } else if (row == 2) {
                I2.setIcon(tile);
            } else if (row == 3) {
                I3.setIcon(tile);
            } else if (row == 4) {
                I4.setIcon(tile);
            } else if (row == 5) {
                I5.setIcon(tile);
            } else if (row == 6) {
                I6.setIcon(tile);
            } else if (row == 7) {
                I7.setIcon(tile);
            } else if (row == 8) {
                I8.setIcon(tile);
            }
        } else if (col == 10) {
            if (row == 1) {
                J1.setIcon(tile);
            } else if (row == 2) {
                J2.setIcon(tile);
            } else if (row == 3) {
                J3.setIcon(tile);
            } else if (row == 4) {
                J4.setIcon(tile);
            } else if (row == 5) {
                J5.setIcon(tile);
            } else if (row == 6) {
                J6.setIcon(tile);
            } else if (row == 7) {
                J7.setIcon(tile);
            } else if (row == 8) {
                J8.setIcon(tile);
            }
        }

        col = newCol;
        row = newRow;
        ImageIcon charTile = character.getTile();
        if (col == 1) {
            if (row == 1) {
                A1.setIcon(charTile);
            } else if (row == 2) {
                A2.setIcon(charTile);
            } else if (row == 3) {
                A3.setIcon(charTile);
            } else if (row == 4) {
                A4.setIcon(charTile);
            } else if (row == 5) {
                A5.setIcon(charTile);
            } else if (row == 6) {
                A6.setIcon(charTile);
            } else if (row == 7) {
                A7.setIcon(charTile);
            } else if (row == 8) {
                A8.setIcon(charTile);
            }
        } else if (col == 2) {
            if (row == 1) {
                B1.setIcon(charTile);
            } else if (row == 2) {
                B2.setIcon(charTile);
            } else if (row == 3) {
                B3.setIcon(charTile);
            } else if (row == 4) {
                B4.setIcon(charTile);
            } else if (row == 5) {
                B5.setIcon(charTile);
            } else if (row == 6) {
                B6.setIcon(charTile);
            } else if (row == 7) {
                B7.setIcon(charTile);
            } else if (row == 8) {
                B8.setIcon(charTile);
            }
        } else if (col == 3) {
            if (row == 1) {
                C1.setIcon(charTile);
            } else if (row == 2) {
                C2.setIcon(charTile);
            } else if (row == 3) {
                C3.setIcon(charTile);
            } else if (row == 4) {
                C4.setIcon(charTile);
            } else if (row == 5) {
                C5.setIcon(charTile);
            } else if (row == 6) {
                C6.setIcon(charTile);
            } else if (row == 7) {
                C7.setIcon(charTile);
            } else if (row == 8) {
                C8.setIcon(charTile);
            }
        } else if (col == 4) {
            if (row == 1) {
                D1.setIcon(charTile);
            } else if (row == 2) {
                D2.setIcon(charTile);
            } else if (row == 3) {
                D3.setIcon(charTile);
            } else if (row == 4) {
                D4.setIcon(charTile);
            } else if (row == 5) {
                D5.setIcon(charTile);
            } else if (row == 6) {
                D6.setIcon(charTile);
            } else if (row == 7) {
                D7.setIcon(charTile);
            } else if (row == 8) {
                D8.setIcon(charTile);
            }
        } else if (col == 5) {
            if (row == 1) {
                E1.setIcon(charTile);
            } else if (row == 2) {
                E2.setIcon(charTile);
            } else if (row == 3) {
                E3.setIcon(charTile);
            } else if (row == 4) {
                E4.setIcon(charTile);
            } else if (row == 5) {
                E5.setIcon(charTile);
            } else if (row == 6) {
                E6.setIcon(charTile);
            } else if (row == 7) {
                E7.setIcon(charTile);
            } else if (row == 8) {
                E8.setIcon(charTile);
            }
        } else if (col == 6) {
            if (row == 1) {
                F1.setIcon(charTile);
            } else if (row == 2) {
                F2.setIcon(charTile);
            } else if (row == 3) {
                F3.setIcon(charTile);
            } else if (row == 4) {
                F4.setIcon(charTile);
            } else if (row == 5) {
                F5.setIcon(charTile);
            } else if (row == 6) {
                F6.setIcon(charTile);
            } else if (row == 7) {
                F7.setIcon(charTile);
            } else if (row == 8) {
                F8.setIcon(charTile);
            }
        } else if (col == 7) {
            if (row == 1) {
                G1.setIcon(charTile);
            } else if (row == 2) {
                G2.setIcon(charTile);
            } else if (row == 3) {
                G3.setIcon(charTile);
            } else if (row == 4) {
                G4.setIcon(charTile);
            } else if (row == 5) {
                G5.setIcon(charTile);
            } else if (row == 6) {
                G6.setIcon(charTile);
            } else if (row == 7) {
                G7.setIcon(charTile);
            } else if (row == 8) {
                G8.setIcon(charTile);
            }
        } else if (col == 8) {
            if (row == 1) {
                H1.setIcon(charTile);
            } else if (row == 2) {
                H2.setIcon(charTile);
            } else if (row == 3) {
                H3.setIcon(charTile);
            } else if (row == 4) {
                H4.setIcon(charTile);
            } else if (row == 5) {
                H5.setIcon(charTile);
            } else if (row == 6) {
                H6.setIcon(charTile);
            } else if (row == 7) {
                H7.setIcon(charTile);
            } else if (row == 8) {
                H8.setIcon(charTile);
            }
        } else if (col == 9) {
            if (row == 1) {
                I1.setIcon(charTile);
            } else if (row == 2) {
                I2.setIcon(charTile);
            } else if (row == 3) {
                I3.setIcon(charTile);
            } else if (row == 4) {
                I4.setIcon(charTile);
            } else if (row == 5) {
                I5.setIcon(charTile);
            } else if (row == 6) {
                I6.setIcon(charTile);
            } else if (row == 7) {
                I7.setIcon(charTile);
            } else if (row == 8) {
                I8.setIcon(charTile);
            }
        } else if (col == 10) {
            if (row == 1) {
                J1.setIcon(charTile);
            } else if (row == 2) {
                J2.setIcon(charTile);
            } else if (row == 3) {
                J3.setIcon(charTile);
            } else if (row == 4) {
                J4.setIcon(charTile);
            } else if (row == 5) {
                J5.setIcon(charTile);
            } else if (row == 6) {
                J6.setIcon(charTile);
            } else if (row == 7) {
                J7.setIcon(charTile);
            } else if (row == 8) {
                J8.setIcon(charTile);
            }
        }
    }

    public void keyTyped(KeyEvent e) {
        //not needed
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int col = gertrude.getCol();
        int row = gertrude.getRow();
        if (keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D) {
            if (col != 10) {
                col++;
            }else if(row == 5 && (enemy1.getHealth() <= 0 && enemy2.getHealth() <= 0 && enemy3.getHealth() <= 0)){
                
                if(area1Active){
                    setArea2();
                }else if(area2Active){
                    setArea3();
                }else if(area3Active){
                    setArea1();
                }
                col = 1;
                row = 5;
                J5.setIcon(tile);
            }

        } else if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
            if (col != 1) {
                col--;
            }

        } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
            if (row != 1) {
                row--;
            }

        } else if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
            if (row != 8) {
                row++;
            }

        }
        updateCharacterLocation(gertrude, col, row);
        gertrude.setCol(col);
        gertrude.setRow(row);
        if(enemy1.getHealth() > 0){
            moveEnemies(enemy1, 1);
            
        }
        
        if(enemy2.getHealth() > 0){
            moveEnemies(enemy2, 2);
            
        }
        
        if(enemy3.getHealth() > 0){
            moveEnemies(enemy3, 3);
            
        }
        
            
        
    }

    public void keyReleased(KeyEvent e) {
        //not needed
    }
    
    public int getEnemyAttack(){
        if(enemy1Battle){
            return enemy1.getAttack();
        }else if(enemy2Battle){
            return enemy2.getAttack();
        }else{
            return enemy3.getAttack();
        }
    }
    
    public int getEnemyHealth(){
        if(enemy1Battle){
            return enemy1.getHealth();
        }else if(enemy2Battle){
            return enemy2.getHealth();
        }else{
            System.out.println("1. " + enemy1Battle);
            System.out.println("2. " + enemy2Battle);
            return enemy3.getHealth();
            
        }
    }
    
    public int getEnemyMaxHealth(){
        if(enemy1Battle){
            return enemy1.getMaxHealth();
        }else if(enemy2Battle){
            return enemy2.getMaxHealth();
        }else{
            return enemy3.getMaxHealth();
        }
    }
    
    public void setEnemyHealth(int health){
        if(enemy1Battle){
            enemy1.setHealth(health);
        }else if(enemy2Battle){
            enemy2.setHealth(health);
            
        }else{
            enemy3.setHealth(health);
        }
    }
    
    public ImageIcon getEnemyImageIcon(){
        if(enemy1Battle){
            return enemy1.getBattleImage();
        }else if(enemy2Battle){
            return enemy2.getBattleImage();
        }else{
            return enemy3.getBattleImage();
        }
    }
    
    
    
    public void endEnemyBattle(){
        if(enemy1Battle){
            enemy1Battle = false;
            updateCharacterLocation(enemy1, 0, 0);
        }else if(enemy2Battle){
            enemy2Battle = false;
            updateCharacterLocation(enemy2, 0, 0);
        }else if(enemy3Battle){
            enemy3Battle = false;
            updateCharacterLocation(enemy3, 0, 0);
        }
        if(enemy1.getHealth() <= 0 && enemy2.getHealth() <= 0 && enemy3.getHealth() <= 0){
            lblPath.setText("----->");
        }
    }
    
    public int enemyAttack(){
        if(enemy1Battle){
            return enemy1.doDamage();
        }else if(enemy2Battle){
            return enemy2.doDamage();
        }else{
            return enemy3.doDamage();
        }
    }
    
    public void startBattle(){
        battles = new BattleS(this);
        battles.setVisible(true);
        this.setVisible(false);
        if (clip.isRunning()) clip.stop();
    }

    public void moveEnemies(AbstractCharacter enemy, int num) {
        int colPlayer = gertrude.getCol();
        int rowPlayer = gertrude.getRow();
        int colEnemy = enemy.getCol();
        int rowEnemy = enemy.getRow();
        int random = (int) (Math.random() * 3) + 1;

        if (colPlayer > colEnemy) {
            if(random == 1){
                colEnemy++;
            }
            
            
        } else if (colPlayer < colEnemy) {
            if(random == 1){
                colEnemy--;
            }
            
        }
        
        random = (int) (Math.random() * 3) + 1;
        
        if (rowPlayer > rowEnemy) {
            if(random == 1){
                rowEnemy++;
            }
            
        } else if (rowPlayer < rowEnemy) {
            if(random == 1){
                rowEnemy--;
            }
            
        }
        if ((colEnemy == colPlayer ) && (rowEnemy == rowPlayer)) {
            if(num == 1){
                enemy1Battle = true;
            }else if(num == 2){
                enemy2Battle = true;
            }else if(num == 3){
                enemy3Battle = true;
            }    
            startBattle();
                
        } else{
            updateCharacterLocation(enemy, colEnemy, rowEnemy);
            enemy.setCol(colEnemy);
            enemy.setRow(rowEnemy);
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPath = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        H4 = new javax.swing.JLabel();
        H3 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        I4 = new javax.swing.JLabel();
        I3 = new javax.swing.JLabel();
        I1 = new javax.swing.JLabel();
        I2 = new javax.swing.JLabel();
        J4 = new javax.swing.JLabel();
        J3 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        G7 = new javax.swing.JLabel();
        G8 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        H7 = new javax.swing.JLabel();
        H8 = new javax.swing.JLabel();
        H5 = new javax.swing.JLabel();
        H6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        I7 = new javax.swing.JLabel();
        I8 = new javax.swing.JLabel();
        I5 = new javax.swing.JLabel();
        I6 = new javax.swing.JLabel();
        J7 = new javax.swing.JLabel();
        J8 = new javax.swing.JLabel();
        J5 = new javax.swing.JLabel();
        J6 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblStage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gertrogan");
        setMaximumSize(new java.awt.Dimension(800, 850));
        setMinimumSize(new java.awt.Dimension(800, 850));
        setName("Gertrogan Overworld"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        lblPath.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPath.setForeground(new java.awt.Color(255, 255, 255));
        lblPath.setFocusCycleRoot(true);
        getContentPane().add(lblPath);
        lblPath.setBounds(720, 540, 70, 40);

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.setIconTextGap(0);
        getContentPane().add(B1);
        B1.setBounds(96, 217, 70, 70);

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A1.setIconTextGap(0);
        getContentPane().add(A1);
        A1.setBounds(19, 217, 70, 70);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.setIconTextGap(0);
        getContentPane().add(B2);
        B2.setBounds(96, 294, 70, 70);

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A2.setIconTextGap(0);
        getContentPane().add(A2);
        A2.setBounds(19, 294, 70, 70);

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D1.setIconTextGap(0);
        getContentPane().add(D1);
        D1.setBounds(250, 217, 70, 70);

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setIconTextGap(0);
        getContentPane().add(C1);
        C1.setBounds(173, 217, 70, 70);

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setIconTextGap(0);
        getContentPane().add(D2);
        D2.setBounds(250, 294, 70, 70);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.setIconTextGap(0);
        getContentPane().add(C2);
        C2.setBounds(173, 294, 70, 70);

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D4.setIconTextGap(0);
        getContentPane().add(D4);
        D4.setBounds(250, 448, 70, 70);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C4.setIconTextGap(0);
        getContentPane().add(C4);
        C4.setBounds(173, 448, 70, 70);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.setIconTextGap(0);
        getContentPane().add(B3);
        B3.setBounds(96, 371, 70, 70);

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A3.setIconTextGap(0);
        getContentPane().add(A3);
        A3.setBounds(19, 371, 70, 70);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.setIconTextGap(0);
        getContentPane().add(B4);
        B4.setBounds(96, 448, 70, 70);

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A4.setIconTextGap(0);
        getContentPane().add(A4);
        A4.setBounds(19, 448, 70, 70);

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D3.setIconTextGap(0);
        getContentPane().add(D3);
        D3.setBounds(250, 371, 70, 70);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.setIconTextGap(0);
        getContentPane().add(C3);
        C3.setBounds(173, 371, 70, 70);

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.setIconTextGap(0);
        getContentPane().add(F2);
        F2.setBounds(404, 294, 70, 70);

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E2.setIconTextGap(0);
        getContentPane().add(E2);
        E2.setBounds(327, 294, 70, 70);

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.setIconTextGap(0);
        getContentPane().add(F4);
        F4.setBounds(404, 448, 70, 70);

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E4.setIconTextGap(0);
        getContentPane().add(E4);
        E4.setBounds(327, 448, 70, 70);

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.setIconTextGap(0);
        getContentPane().add(F3);
        F3.setBounds(404, 371, 70, 70);

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.setIconTextGap(0);
        getContentPane().add(F1);
        F1.setBounds(404, 217, 70, 70);

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E3.setIconTextGap(0);
        getContentPane().add(E3);
        E3.setBounds(327, 371, 70, 70);

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E1.setIconTextGap(0);
        getContentPane().add(E1);
        E1.setBounds(327, 217, 70, 70);

        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G4.setIconTextGap(0);
        getContentPane().add(G4);
        G4.setBounds(481, 448, 70, 70);

        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G3.setIconTextGap(0);
        getContentPane().add(G3);
        G3.setBounds(481, 371, 70, 70);

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G1.setIconTextGap(0);
        getContentPane().add(G1);
        G1.setBounds(481, 217, 70, 70);

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G2.setIconTextGap(0);
        getContentPane().add(G2);
        G2.setBounds(481, 294, 70, 70);

        H4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H4.setIconTextGap(0);
        getContentPane().add(H4);
        H4.setBounds(558, 448, 70, 70);

        H3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H3.setIconTextGap(0);
        getContentPane().add(H3);
        H3.setBounds(558, 371, 70, 70);

        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H1.setIconTextGap(0);
        getContentPane().add(H1);
        H1.setBounds(558, 217, 70, 70);

        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H2.setIconTextGap(0);
        getContentPane().add(H2);
        H2.setBounds(558, 294, 70, 70);

        I4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I4.setIconTextGap(0);
        getContentPane().add(I4);
        I4.setBounds(635, 448, 70, 70);

        I3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I3.setIconTextGap(0);
        getContentPane().add(I3);
        I3.setBounds(635, 371, 70, 70);

        I1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I1.setIconTextGap(0);
        getContentPane().add(I1);
        I1.setBounds(635, 217, 70, 70);

        I2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I2.setIconTextGap(0);
        getContentPane().add(I2);
        I2.setBounds(635, 294, 70, 70);

        J4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J4.setIconTextGap(0);
        getContentPane().add(J4);
        J4.setBounds(712, 448, 70, 70);

        J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J3.setIconTextGap(0);
        getContentPane().add(J3);
        J3.setBounds(712, 371, 70, 70);

        J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J1.setIconTextGap(0);
        getContentPane().add(J1);
        J1.setBounds(712, 217, 70, 70);

        J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J2.setIconTextGap(0);
        getContentPane().add(J2);
        J2.setBounds(712, 294, 70, 70);

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.setIconTextGap(0);
        getContentPane().add(B7);
        B7.setBounds(96, 679, 70, 70);

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A7.setIconTextGap(0);
        getContentPane().add(A7);
        A7.setBounds(19, 679, 70, 70);

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.setIconTextGap(0);
        getContentPane().add(B8);
        B8.setBounds(96, 756, 70, 70);

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A8.setIconTextGap(0);
        getContentPane().add(A8);
        A8.setBounds(19, 756, 70, 70);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.setIconTextGap(0);
        getContentPane().add(B5);
        B5.setBounds(96, 525, 70, 70);

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A5.setIconTextGap(0);
        getContentPane().add(A5);
        A5.setBounds(19, 525, 70, 70);

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.setIconTextGap(0);
        getContentPane().add(B6);
        B6.setBounds(96, 602, 70, 70);

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A6.setIconTextGap(0);
        getContentPane().add(A6);
        A6.setBounds(19, 602, 70, 70);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C7.setIconTextGap(0);
        getContentPane().add(C7);
        C7.setBounds(173, 679, 70, 70);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C8.setIconTextGap(0);
        getContentPane().add(C8);
        C8.setBounds(173, 756, 70, 70);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C5.setIconTextGap(0);
        getContentPane().add(C5);
        C5.setBounds(173, 525, 70, 70);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C6.setIconTextGap(0);
        getContentPane().add(C6);
        C6.setBounds(173, 602, 70, 70);

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D7.setIconTextGap(0);
        getContentPane().add(D7);
        D7.setBounds(250, 679, 70, 70);

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D8.setIconTextGap(0);
        getContentPane().add(D8);
        D8.setBounds(250, 756, 70, 70);

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D5.setIconTextGap(0);
        getContentPane().add(D5);
        D5.setBounds(250, 525, 70, 70);

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D6.setIconTextGap(0);
        getContentPane().add(D6);
        D6.setBounds(250, 602, 70, 70);

        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G7.setIconTextGap(0);
        getContentPane().add(G7);
        G7.setBounds(481, 679, 70, 70);

        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G8.setIconTextGap(0);
        getContentPane().add(G8);
        G8.setBounds(481, 756, 70, 70);

        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G5.setIconTextGap(0);
        getContentPane().add(G5);
        G5.setBounds(481, 525, 70, 70);

        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G6.setIconTextGap(0);
        getContentPane().add(G6);
        G6.setBounds(481, 602, 70, 70);

        H7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H7.setIconTextGap(0);
        getContentPane().add(H7);
        H7.setBounds(558, 679, 70, 70);

        H8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H8.setIconTextGap(0);
        getContentPane().add(H8);
        H8.setBounds(558, 756, 70, 70);

        H5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H5.setIconTextGap(0);
        getContentPane().add(H5);
        H5.setBounds(558, 525, 70, 70);

        H6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H6.setIconTextGap(0);
        getContentPane().add(H6);
        H6.setBounds(558, 602, 70, 70);

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F7.setIconTextGap(0);
        getContentPane().add(F7);
        F7.setBounds(404, 679, 70, 70);

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E7.setIconTextGap(0);
        getContentPane().add(E7);
        E7.setBounds(327, 679, 70, 70);

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F8.setIconTextGap(0);
        getContentPane().add(F8);
        F8.setBounds(404, 756, 70, 70);

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E8.setIconTextGap(0);
        getContentPane().add(E8);
        E8.setBounds(327, 756, 70, 70);

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.setIconTextGap(0);
        getContentPane().add(F5);
        F5.setBounds(404, 525, 70, 70);

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E5.setIconTextGap(0);
        getContentPane().add(E5);
        E5.setBounds(327, 525, 70, 70);

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.setIconTextGap(0);
        getContentPane().add(F6);
        F6.setBounds(404, 602, 70, 70);

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E6.setIconTextGap(0);
        getContentPane().add(E6);
        E6.setBounds(327, 602, 70, 70);

        I7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I7.setIconTextGap(0);
        getContentPane().add(I7);
        I7.setBounds(635, 679, 70, 70);

        I8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I8.setIconTextGap(0);
        getContentPane().add(I8);
        I8.setBounds(635, 756, 70, 70);

        I5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I5.setIconTextGap(0);
        getContentPane().add(I5);
        I5.setBounds(635, 525, 70, 70);

        I6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I6.setIconTextGap(0);
        getContentPane().add(I6);
        I6.setBounds(635, 602, 70, 70);

        J7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J7.setIconTextGap(0);
        getContentPane().add(J7);
        J7.setBounds(712, 679, 70, 70);

        J8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J8.setIconTextGap(0);
        getContentPane().add(J8);
        J8.setBounds(712, 756, 70, 70);

        J5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J5.setIconTextGap(0);
        getContentPane().add(J5);
        J5.setBounds(712, 525, 70, 70);

        J6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J6.setIconTextGap(0);
        getContentPane().add(J6);
        J6.setBounds(712, 602, 70, 70);

        lblArea.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area:");
        getContentPane().add(lblArea);
        lblArea.setBounds(660, 130, 120, 40);

        lblLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblLevel.setForeground(new java.awt.Color(255, 255, 255));
        lblLevel.setText("Level: ");
        getContentPane().add(lblLevel);
        lblLevel.setBounds(660, 30, 120, 40);

        lblStage.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblStage.setForeground(new java.awt.Color(255, 255, 255));
        lblStage.setText("Stage:");
        getContentPane().add(lblStage);
        lblStage.setBounds(660, 80, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/gertrogan UI.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 188);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel G7;
    private javax.swing.JLabel G8;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel H3;
    private javax.swing.JLabel H4;
    private javax.swing.JLabel H5;
    private javax.swing.JLabel H6;
    private javax.swing.JLabel H7;
    private javax.swing.JLabel H8;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I5;
    private javax.swing.JLabel I6;
    private javax.swing.JLabel I7;
    private javax.swing.JLabel I8;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    private javax.swing.JLabel J3;
    private javax.swing.JLabel J4;
    private javax.swing.JLabel J5;
    private javax.swing.JLabel J6;
    private javax.swing.JLabel J7;
    private javax.swing.JLabel J8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblStage;
    // End of variables declaration//GEN-END:variables
}
