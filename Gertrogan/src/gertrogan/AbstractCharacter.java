/*
Evan Hansen
05/25/18
An Abstract Character class
 */
package gertrogan;

import javax.swing.ImageIcon;

abstract public class AbstractCharacter implements Character {

    ImageIcon image;
    int col;
    int row;
    int attack;
    int health;
    int maxHealth;
    boolean alive;
    
    /**
     * constructor for abstract character
     * @param health
     * @param attack
     * @param col
     * @param row 
     */
    public AbstractCharacter(int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.maxHealth = health;
        this.health = health;
        alive = true;
    }
    /**
     * Second constructor for abstract character
     * @param image
     * @param health
     * @param attack
     * @param col
     * @param row 
     */
    public AbstractCharacter(ImageIcon image, int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.health = health;
        this.maxHealth = health;
        this.image = image;
        alive = true;
    }
    
    public ImageIcon getImage() {
        return image;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int health, int damage) {

        health = health - damage;

        if (health <= 0) {
            alive = false;
            return 0;
        } else {
            return health;
        }
    }


}
