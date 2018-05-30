/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertrogan;

import java.awt.event.*;
public class Overworld extends javax.swing.JFrame implements KeyListener{
    TitleMenu titleMenu;
    private BattleS battles;
    
    
    public Overworld(TitleMenu m) {
        titleMenu = m;
        initComponents();
        setFocusable(true);
        this.addKeyListener(this);
    }
    
    
    public void keyTyped(KeyEvent e){
        //not needed
    }
    
    
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        int x = character.getX();
        int y = character.getY();
        if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D){
            x += 5;
        }else if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
            x -= 5;
        }else if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
            y -= 5;
        }else if(keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
            y += 5;
        }
        
        character.setLocation(x,y);
    }
    
    public void keyReleased(KeyEvent e){
        //not needed
    }
    

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        character = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        character.setText("Character");
        character.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(character, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jButton1)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(character, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void characterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterActionPerformed
        titleMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_characterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (battles == null) {
            battles = new BattleS(this);
        }
        battles.setVisible(true);

        this.setVisible(false);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton character;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
