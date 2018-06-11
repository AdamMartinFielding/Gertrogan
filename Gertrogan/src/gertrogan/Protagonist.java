/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertrogan;

import javax.swing.ImageIcon;
public class Protagonist extends AbstractCharacter {
    
    String name;
    int exp = 0;
    int level = 1;
    int expToNext = 100;
    public Protagonist(String name,int health, int attack, int col, int row){
        super(health, attack, col, row);
        this.name = name;
        
    }
    
    public Protagonist(ImageIcon image,String name,int health, int attack, int col, int row){
        super(image,health, attack, col, row);
        this.name = name;
        
    }
    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public int getExpToNext() {
        return expToNext;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExpToNext(int expToNext) {
        this.expToNext = expToNext;
    }

}
