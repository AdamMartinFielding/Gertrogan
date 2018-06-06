/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertrogan;

import java.awt.event.*;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;
public class Overworld extends javax.swing.JFrame implements KeyListener {
    AudioStream audios;
    TitleMenu titleMenu;
    BattleS battles;
    
    private ImageIcon protagonist = new ImageIcon("src\\gertrogan\\tileGertrude.png");
    private ImageIcon tile = new ImageIcon("src\\gertrogan\\tileDefault.png");
    private ImageIcon gromlinTile = new ImageIcon("src\\gertrogan\\tileGromlin.png");
    public Protagonist gertrude = new Protagonist(protagonist,"gertrude", 100, 10, 1, 4);
    public BasicEnemy gromlin = new BasicEnemy(gromlinTile, 100,10,9, 2);
    
    public Overworld(TitleMenu m) {
        titleMenu = m;
        initComponents();
        setFocusable(true);
        this.addKeyListener(this);
        updateCharacterLocation(gertrude, gertrude.getCol(),gertrude.getRow());
        updateCharacterLocation(gromlin, gromlin.getCol(),gromlin.getRow());
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\gertrogan\\Overworld Music.wav"));
            audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
            
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
    public void startMusic(){
        InputStream music;
        try{
            music = new FileInputStream(new File("src\\gertrogan\\Overworld Music.wav"));
            audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
            
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
    /**
    battles = new BattleS(this);
                battles.setVisible(
                        true);

                this.setVisible(
                        false);
    **/

    
    public void updateCharacterLocation(AbstractCharacter character,int newCol, int newRow) {
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
        if (col == 1) {
            if (row == 1) {
                A1.setIcon(character.getImage());
            } else if (row == 2) {
                A2.setIcon(character.getImage());
            } else if (row == 3) {
                A3.setIcon(character.getImage());
            } else if (row == 4) {
                A4.setIcon(character.getImage());
            } else if (row == 5) {
                A5.setIcon(character.getImage());
            } else if (row == 6) {
                A6.setIcon(character.getImage());
            } else if (row == 7) {
                A7.setIcon(character.getImage());
            } else if (row == 8) {
                A8.setIcon(character.getImage());
            }
        } else if (col == 2) {
            if (row == 1) {
                B1.setIcon(character.getImage());
            } else if (row == 2) {
                B2.setIcon(character.getImage());
            } else if (row == 3) {
                B3.setIcon(character.getImage());
            } else if (row == 4) {
                B4.setIcon(character.getImage());
            } else if (row == 5) {
                B5.setIcon(character.getImage());
            } else if (row == 6) {
                B6.setIcon(character.getImage());
            } else if (row == 7) {
                B7.setIcon(character.getImage());
            } else if (row == 8) {
                B8.setIcon(character.getImage());
            }
        } else if (col == 3) {
            if (row == 1) {
                C1.setIcon(character.getImage());
            } else if (row == 2) {
                C2.setIcon(character.getImage());
            } else if (row == 3) {
                C3.setIcon(character.getImage());
            } else if (row == 4) {
                C4.setIcon(character.getImage());
            } else if (row == 5) {
                C5.setIcon(character.getImage());
            } else if (row == 6) {
                C6.setIcon(character.getImage());
            } else if (row == 7) {
                C7.setIcon(character.getImage());
            } else if (row == 8) {
                C8.setIcon(character.getImage());
            }
        } else if (col == 4) {
            if (row == 1) {
                D1.setIcon(character.getImage());
            } else if (row == 2) {
                D2.setIcon(character.getImage());
            } else if (row == 3) {
                D3.setIcon(character.getImage());
            } else if (row == 4) {
                D4.setIcon(character.getImage());
            } else if (row == 5) {
                D5.setIcon(character.getImage());
            } else if (row == 6) {
                D6.setIcon(character.getImage());
            } else if (row == 7) {
                D7.setIcon(character.getImage());
            } else if (row == 8) {
                D8.setIcon(character.getImage());
            }
        } else if (col == 5) {
            if (row == 1) {
                E1.setIcon(character.getImage());
            } else if (row == 2) {
                E2.setIcon(character.getImage());
            } else if (row == 3) {
                E3.setIcon(character.getImage());
            } else if (row == 4) {
                E4.setIcon(character.getImage());
            } else if (row == 5) {
                E5.setIcon(character.getImage());
            } else if (row == 6) {
                E6.setIcon(character.getImage());
            } else if (row == 7) {
                E7.setIcon(character.getImage());
            } else if (row == 8) {
                E8.setIcon(character.getImage());
            }
        } else if (col == 6) {
            if (row == 1) {
                F1.setIcon(character.getImage());
            } else if (row == 2) {
                F2.setIcon(character.getImage());
            } else if (row == 3) {
                F3.setIcon(character.getImage());
            } else if (row == 4) {
                F4.setIcon(character.getImage());
            } else if (row == 5) {
                F5.setIcon(character.getImage());
            } else if (row == 6) {
                F6.setIcon(character.getImage());
            } else if (row == 7) {
                F7.setIcon(character.getImage());
            } else if (row == 8) {
                F8.setIcon(character.getImage());
            }
        } else if (col == 7) {
            if (row == 1) {
                G1.setIcon(character.getImage());
            } else if (row == 2) {
                G2.setIcon(character.getImage());
            } else if (row == 3) {
                G3.setIcon(character.getImage());
            } else if (row == 4) {
                G4.setIcon(character.getImage());
            } else if (row == 5) {
                G5.setIcon(character.getImage());
            } else if (row == 6) {
                G6.setIcon(character.getImage());
            } else if (row == 7) {
                G7.setIcon(character.getImage());
            } else if (row == 8) {
                G8.setIcon(character.getImage());
            }
        } else if (col == 8) {
            if (row == 1) {
                H1.setIcon(character.getImage());
            } else if (row == 2) {
                H2.setIcon(character.getImage());
            } else if (row == 3) {
                H3.setIcon(character.getImage());
            } else if (row == 4) {
                H4.setIcon(character.getImage());
            } else if (row == 5) {
                H5.setIcon(character.getImage());
            } else if (row == 6) {
                H6.setIcon(character.getImage());
            } else if (row == 7) {
                H7.setIcon(character.getImage());
            } else if (row == 8) {
                H8.setIcon(character.getImage());
            }
        } else if (col == 9) {
            if (row == 1) {
                I1.setIcon(character.getImage());
            } else if (row == 2) {
                I2.setIcon(character.getImage());
            } else if (row == 3) {
                I3.setIcon(character.getImage());
            } else if (row == 4) {
                I4.setIcon(character.getImage());
            } else if (row == 5) {
                I5.setIcon(character.getImage());
            } else if (row == 6) {
                I6.setIcon(character.getImage());
            } else if (row == 7) {
                I7.setIcon(character.getImage());
            } else if (row == 8) {
                I8.setIcon(character.getImage());
            }
        } else if (col == 10) {
            if (row == 1) {
                J1.setIcon(character.getImage());
            } else if (row == 2) {
                J2.setIcon(character.getImage());
            } else if (row == 3) {
                J3.setIcon(character.getImage());
            } else if (row == 4) {
                J4.setIcon(character.getImage());
            } else if (row == 5) {
                J5.setIcon(character.getImage());
            } else if (row == 6) {
                J6.setIcon(character.getImage());
            } else if (row == 7) {
                J7.setIcon(character.getImage());
            } else if (row == 8) {
                J8.setIcon(character.getImage());
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
        moveEnemies();
    }

    public void keyReleased(KeyEvent e) {
        //not needed
    }
    
    public void moveEnemies(){
        int colG = gertrude.getCol();
        int rowG = gertrude.getRow();
        int col = gromlin.getCol();
        int row = gromlin.getRow();
        
        if(colG > col){
            col++;
            if((col == colG ) && (row  == rowG)){
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }else if(colG < col){
            col--;
            if((col == colG ) && (row  == rowG)){
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }
        if(rowG > row){
            row++;
            if((col == colG ) && (row  == rowG)){
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }else if(rowG < row){
            row --;
            if((col == colG ) && (row  == rowG)){
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }
        updateCharacterLocation(gromlin, col,row);
        gromlin.setCol(col);
        gromlin.setRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.setIconTextGap(0);

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A1.setIconTextGap(0);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.setIconTextGap(0);

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A2.setIconTextGap(0);

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D1.setIconTextGap(0);

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setIconTextGap(0);

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setIconTextGap(0);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.setIconTextGap(0);

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D4.setIconTextGap(0);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C4.setIconTextGap(0);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.setIconTextGap(0);

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A3.setIconTextGap(0);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.setIconTextGap(0);

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A4.setIconTextGap(0);

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D3.setIconTextGap(0);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.setIconTextGap(0);

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.setIconTextGap(0);

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E2.setIconTextGap(0);

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.setIconTextGap(0);

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E4.setIconTextGap(0);

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.setIconTextGap(0);

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.setIconTextGap(0);

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E3.setIconTextGap(0);

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E1.setIconTextGap(0);

        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G4.setIconTextGap(0);

        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G3.setIconTextGap(0);

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G1.setIconTextGap(0);

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G2.setIconTextGap(0);

        H4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H4.setIconTextGap(0);

        H3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H3.setIconTextGap(0);

        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H1.setIconTextGap(0);

        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H2.setIconTextGap(0);

        I4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I4.setIconTextGap(0);

        I3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I3.setIconTextGap(0);

        I1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I1.setIconTextGap(0);

        I2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I2.setIconTextGap(0);

        J4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J4.setIconTextGap(0);

        J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J3.setIconTextGap(0);

        J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J1.setIconTextGap(0);

        J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J2.setIconTextGap(0);

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.setIconTextGap(0);

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A7.setIconTextGap(0);

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.setIconTextGap(0);

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A8.setIconTextGap(0);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.setIconTextGap(0);

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A5.setIconTextGap(0);

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.setIconTextGap(0);

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A6.setIconTextGap(0);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C7.setIconTextGap(0);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C8.setIconTextGap(0);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C5.setIconTextGap(0);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C6.setIconTextGap(0);

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D7.setIconTextGap(0);

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D8.setIconTextGap(0);

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D5.setIconTextGap(0);

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D6.setIconTextGap(0);

        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G7.setIconTextGap(0);

        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G8.setIconTextGap(0);

        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G5.setIconTextGap(0);

        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G6.setIconTextGap(0);

        H7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H7.setIconTextGap(0);

        H8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H8.setIconTextGap(0);

        H5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H5.setIconTextGap(0);

        H6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H6.setIconTextGap(0);

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F7.setIconTextGap(0);

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E7.setIconTextGap(0);

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F8.setIconTextGap(0);

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E8.setIconTextGap(0);

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.setIconTextGap(0);

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E5.setIconTextGap(0);

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.setIconTextGap(0);

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E6.setIconTextGap(0);

        I7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I7.setIconTextGap(0);

        I8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I8.setIconTextGap(0);

        I5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I5.setIconTextGap(0);

        I6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I6.setIconTextGap(0);

        J7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J7.setIconTextGap(0);

        J8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J8.setIconTextGap(0);

        J5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J5.setIconTextGap(0);

        J6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J6.setIconTextGap(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        A1.getAccessibleContext().setAccessibleName("");

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
    // End of variables declaration//GEN-END:variables
}
