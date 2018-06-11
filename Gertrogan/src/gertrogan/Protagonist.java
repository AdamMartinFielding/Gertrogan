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
    int expToNext = 20;
    public Protagonist(String name,int health, int attack, int col, int row){
        super(health, attack, col, row);
        this.name = name;
        
    }
    /**
     * constructor method for protagonist
     * @param imageTile
     * @param image
     * @param name
     * @param health
     * @param attack
     * @param col
     * @param row 
     */
    public Protagonist(ImageIcon imageTile, ImageIcon image, String name,int health, int attack, int col, int row){
        super(imageTile, image, health, attack, col, row);
        this.name = name;
        
    }
    /**
     * accessor method for exp
     * @return 
     */
    public int getExp() {
        return exp;
    }
    /**
     * accessor method for level
     * @return 
     */
    public int getLevel() {
        return level;
    }
    /**
     * accessor method for exp to next level
     * @return 
     */
    public int getExpToNext() {
        return expToNext;
    }
    /**
     * Mutator method for exp
     * @param exp 
     */
    public void setExp(int exp) {
        this.exp = exp;
    }
    /**
     * Mutator method for level
     * @param level 
     */
    public void setLevel(int level) {
        this.level = level;
    }
    /**
     * mutator method for exp to next
     * @param expToNext 
     */
    public void setExpToNext(int expToNext) {
        this.expToNext = expToNext;
    }

}
