/*
Adam Fielding

The class that controls the design and coding of the main naviagtion system and enemy collision system
Implements sound and graphics
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
    public Protagonist gertrude = new Protagonist(protagonist, "gertrude", 100, 10, 1, 4);
    public BasicEnemy gromlin = new BasicEnemy(gromlinTile, 100, 10, 9, 2);

    public Overworld(TitleMenu m) {
        titleMenu = m;
        initComponents();
        setFocusable(true);
        this.addKeyListener(this);
        updateCharacterLocation(gertrude, gertrude.getCol(), gertrude.getRow());
        updateCharacterLocation(gromlin, gromlin.getCol(), gromlin.getRow());
        InputStream music;
        try {
            music = new FileInputStream(new File("src\\gertrogan\\Overworld Music.wav"));
            audios = new AudioStream(music);
            AudioPlayer.player.start(audios);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void startMusic() {
        InputStream music;
        try {
            music = new FileInputStream(new File("src\\gertrogan\\Overworld Music.wav"));
            audios = new AudioStream(music);
            AudioPlayer.player.start(audios);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * battles = new BattleS(this); battles.setVisible( true);
     *
     * this.setVisible( false);
    *
     */
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

    public void moveEnemies() {
        int colPlayer = gertrude.getCol();
        int rowPlayer = gertrude.getRow();
        int colEnemy = gromlin.getCol();
        int rowEnemy = gromlin.getRow();

        if (colPlayer > colEnemy) {
            colEnemy++;
            if ((colEnemy == colPlayer) && (rowEnemy == rowPlayer)) {
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        } else if (colPlayer < colEnemy) {
            colEnemy--;
            if ((colEnemy == colPlayer) && (rowEnemy == rowPlayer)) {
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }
        if (rowPlayer > rowEnemy) {
            rowEnemy++;
            if ((colEnemy == colPlayer) && (rowEnemy == rowPlayer)) {
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        } else if (rowPlayer < rowEnemy) {
            rowEnemy--;
            if ((colEnemy == colPlayer) && (rowEnemy == rowPlayer)) {
                battles = new BattleS(this);
                battles.setVisible(true);
                this.setVisible(false);
                AudioPlayer.player.stop(audios);
            }
        }
        updateCharacterLocation(gromlin, colEnemy, rowEnemy);
        gromlin.setCol(colEnemy);
        gromlin.setRow(rowEnemy);
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
        setTitle("Gertrogan");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setName("Gertrogan Overworld"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.setIconTextGap(0);
        getContentPane().add(B1);
        B1.setBounds(98, 188, 70, 70);

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A1.setIconTextGap(0);
        getContentPane().add(A1);
        A1.setBounds(21, 188, 70, 70);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.setIconTextGap(0);
        getContentPane().add(B2);
        B2.setBounds(98, 265, 70, 70);

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A2.setIconTextGap(0);
        getContentPane().add(A2);
        A2.setBounds(21, 265, 70, 70);

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D1.setIconTextGap(0);
        getContentPane().add(D1);
        D1.setBounds(252, 188, 70, 70);

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.setIconTextGap(0);
        getContentPane().add(C1);
        C1.setBounds(175, 188, 70, 70);

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D2.setIconTextGap(0);
        getContentPane().add(D2);
        D2.setBounds(252, 265, 70, 70);

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.setIconTextGap(0);
        getContentPane().add(C2);
        C2.setBounds(175, 265, 70, 70);

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D4.setIconTextGap(0);
        getContentPane().add(D4);
        D4.setBounds(252, 419, 70, 70);

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C4.setIconTextGap(0);
        getContentPane().add(C4);
        C4.setBounds(175, 419, 70, 70);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.setIconTextGap(0);
        getContentPane().add(B3);
        B3.setBounds(98, 342, 70, 70);

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A3.setIconTextGap(0);
        getContentPane().add(A3);
        A3.setBounds(21, 342, 70, 70);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.setIconTextGap(0);
        getContentPane().add(B4);
        B4.setBounds(98, 419, 70, 70);

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A4.setIconTextGap(0);
        getContentPane().add(A4);
        A4.setBounds(21, 419, 70, 70);

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D3.setIconTextGap(0);
        getContentPane().add(D3);
        D3.setBounds(252, 342, 70, 70);

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.setIconTextGap(0);
        getContentPane().add(C3);
        C3.setBounds(175, 342, 70, 70);

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.setIconTextGap(0);
        getContentPane().add(F2);
        F2.setBounds(406, 265, 70, 70);

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E2.setIconTextGap(0);
        getContentPane().add(E2);
        E2.setBounds(329, 265, 70, 70);

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.setIconTextGap(0);
        getContentPane().add(F4);
        F4.setBounds(406, 419, 70, 70);

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E4.setIconTextGap(0);
        getContentPane().add(E4);
        E4.setBounds(329, 419, 70, 70);

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.setIconTextGap(0);
        getContentPane().add(F3);
        F3.setBounds(406, 342, 70, 70);

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.setIconTextGap(0);
        getContentPane().add(F1);
        F1.setBounds(406, 188, 70, 70);

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E3.setIconTextGap(0);
        getContentPane().add(E3);
        E3.setBounds(329, 342, 70, 70);

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E1.setIconTextGap(0);
        getContentPane().add(E1);
        E1.setBounds(329, 188, 70, 70);

        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G4.setIconTextGap(0);
        getContentPane().add(G4);
        G4.setBounds(483, 419, 70, 70);

        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G3.setIconTextGap(0);
        getContentPane().add(G3);
        G3.setBounds(483, 342, 70, 70);

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G1.setIconTextGap(0);
        getContentPane().add(G1);
        G1.setBounds(483, 188, 70, 70);

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G2.setIconTextGap(0);
        getContentPane().add(G2);
        G2.setBounds(483, 265, 70, 70);

        H4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H4.setIconTextGap(0);
        getContentPane().add(H4);
        H4.setBounds(560, 419, 70, 70);

        H3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H3.setIconTextGap(0);
        getContentPane().add(H3);
        H3.setBounds(560, 342, 70, 70);

        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H1.setIconTextGap(0);
        getContentPane().add(H1);
        H1.setBounds(560, 188, 70, 70);

        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H2.setIconTextGap(0);
        getContentPane().add(H2);
        H2.setBounds(560, 265, 70, 70);

        I4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I4.setIconTextGap(0);
        getContentPane().add(I4);
        I4.setBounds(637, 419, 70, 70);

        I3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I3.setIconTextGap(0);
        getContentPane().add(I3);
        I3.setBounds(637, 342, 70, 70);

        I1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I1.setIconTextGap(0);
        getContentPane().add(I1);
        I1.setBounds(637, 188, 70, 70);

        I2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I2.setIconTextGap(0);
        getContentPane().add(I2);
        I2.setBounds(637, 265, 70, 70);

        J4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J4.setIconTextGap(0);
        getContentPane().add(J4);
        J4.setBounds(714, 419, 70, 70);

        J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J3.setIconTextGap(0);
        getContentPane().add(J3);
        J3.setBounds(714, 342, 70, 70);

        J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J1.setIconTextGap(0);
        getContentPane().add(J1);
        J1.setBounds(714, 188, 70, 70);

        J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J2.setIconTextGap(0);
        getContentPane().add(J2);
        J2.setBounds(714, 265, 70, 70);

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.setIconTextGap(0);
        getContentPane().add(B7);
        B7.setBounds(98, 650, 70, 70);

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A7.setIconTextGap(0);
        getContentPane().add(A7);
        A7.setBounds(21, 650, 70, 70);

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.setIconTextGap(0);
        getContentPane().add(B8);
        B8.setBounds(98, 727, 70, 70);

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A8.setIconTextGap(0);
        getContentPane().add(A8);
        A8.setBounds(21, 727, 70, 70);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.setIconTextGap(0);
        getContentPane().add(B5);
        B5.setBounds(98, 496, 70, 70);

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A5.setIconTextGap(0);
        getContentPane().add(A5);
        A5.setBounds(21, 496, 70, 70);

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.setIconTextGap(0);
        getContentPane().add(B6);
        B6.setBounds(98, 573, 70, 70);

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        A6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A6.setIconTextGap(0);
        getContentPane().add(A6);
        A6.setBounds(21, 573, 70, 70);

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C7.setIconTextGap(0);
        getContentPane().add(C7);
        C7.setBounds(175, 650, 70, 70);

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C8.setIconTextGap(0);
        getContentPane().add(C8);
        C8.setBounds(175, 727, 70, 70);

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C5.setIconTextGap(0);
        getContentPane().add(C5);
        C5.setBounds(175, 496, 70, 70);

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        C6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C6.setIconTextGap(0);
        getContentPane().add(C6);
        C6.setBounds(175, 573, 70, 70);

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D7.setIconTextGap(0);
        getContentPane().add(D7);
        D7.setBounds(252, 650, 70, 70);

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D8.setIconTextGap(0);
        getContentPane().add(D8);
        D8.setBounds(252, 727, 70, 70);

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D5.setIconTextGap(0);
        getContentPane().add(D5);
        D5.setBounds(252, 496, 70, 70);

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        D6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D6.setIconTextGap(0);
        getContentPane().add(D6);
        D6.setBounds(252, 573, 70, 70);

        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G7.setIconTextGap(0);
        getContentPane().add(G7);
        G7.setBounds(483, 650, 70, 70);

        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G8.setIconTextGap(0);
        getContentPane().add(G8);
        G8.setBounds(483, 727, 70, 70);

        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G5.setIconTextGap(0);
        getContentPane().add(G5);
        G5.setBounds(483, 496, 70, 70);

        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        G6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        G6.setIconTextGap(0);
        getContentPane().add(G6);
        G6.setBounds(483, 573, 70, 70);

        H7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H7.setIconTextGap(0);
        getContentPane().add(H7);
        H7.setBounds(560, 650, 70, 70);

        H8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H8.setIconTextGap(0);
        getContentPane().add(H8);
        H8.setBounds(560, 727, 70, 70);

        H5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H5.setIconTextGap(0);
        getContentPane().add(H5);
        H5.setBounds(560, 496, 70, 70);

        H6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        H6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        H6.setIconTextGap(0);
        getContentPane().add(H6);
        H6.setBounds(560, 573, 70, 70);

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F7.setIconTextGap(0);
        getContentPane().add(F7);
        F7.setBounds(406, 650, 70, 70);

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E7.setIconTextGap(0);
        getContentPane().add(E7);
        E7.setBounds(329, 650, 70, 70);

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F8.setIconTextGap(0);
        getContentPane().add(F8);
        F8.setBounds(406, 727, 70, 70);

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E8.setIconTextGap(0);
        getContentPane().add(E8);
        E8.setBounds(329, 727, 70, 70);

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.setIconTextGap(0);
        getContentPane().add(F5);
        F5.setBounds(406, 496, 70, 70);

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E5.setIconTextGap(0);
        getContentPane().add(E5);
        E5.setBounds(329, 496, 70, 70);

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        F6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.setIconTextGap(0);
        getContentPane().add(F6);
        F6.setBounds(406, 573, 70, 70);

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        E6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E6.setIconTextGap(0);
        getContentPane().add(E6);
        E6.setBounds(329, 573, 70, 70);

        I7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I7.setIconTextGap(0);
        getContentPane().add(I7);
        I7.setBounds(637, 650, 70, 70);

        I8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I8.setIconTextGap(0);
        getContentPane().add(I8);
        I8.setBounds(637, 727, 70, 70);

        I5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I5.setIconTextGap(0);
        getContentPane().add(I5);
        I5.setBounds(637, 496, 70, 70);

        I6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        I6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        I6.setIconTextGap(0);
        getContentPane().add(I6);
        I6.setBounds(637, 573, 70, 70);

        J7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J7.setIconTextGap(0);
        getContentPane().add(J7);
        J7.setBounds(714, 650, 70, 70);

        J8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J8.setIconTextGap(0);
        getContentPane().add(J8);
        J8.setBounds(714, 727, 70, 70);

        J5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J5.setIconTextGap(0);
        getContentPane().add(J5);
        J5.setBounds(714, 496, 70, 70);

        J6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gertrogan/tileDefault.png"))); // NOI18N
        J6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        J6.setIconTextGap(0);
        getContentPane().add(J6);
        J6.setBounds(714, 573, 70, 70);

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
