/*
Evan Hansen
05/25/18
An Abstract Character class
 */
package gertrogan;


import javax.swing.ImageIcon;

abstract public class AbstractCharacter implements Character {

    
    ImageIcon imageTile;
    ImageIcon image;
    private int col;
    private int row;
    private int attack;
    private int health;
    private int maxHealth;
  

/**
 * Constructor for abstract character 
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

    }

    /**
     * Secondary constructor for abstract character 
     * @param imageTile
     * @param image
     * @param health
     * @param attack
     * @param col
     * @param row 
     */
    public AbstractCharacter(ImageIcon imageTile, ImageIcon image, int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.health = health;
        this.maxHealth = health;
        this.imageTile = imageTile;
        this.image = image;

    }
    
    /**
     * accessor method for tile
     * @return 
     */
   public ImageIcon getTile(){
        return imageTile;

    }
   /**
    * accessor method for image icon
    * @return 
    */
   public ImageIcon getBattleImage(){
       return image;
   }
   /**
    * Accessor method for max health
    * @return 
    */
    public int getMaxHealth() {
        return maxHealth;
    }
    /**
     * Accessor method for col
     * @return 
     */
    public int getCol() {
        return col;
    }
    /**
     * mutator method for col
     * @param col 
     */
    public void setCol(int col) {
        this.col = col;
    }
    /**
     * Accessor method for row
     * @return 
     */
    public int getRow() {
        return row;
    }
    /**
     * Mutator method for row
     * @param row 
     */
    public void setRow(int row) {
        this.row = row;
    }
    /**
     * Accessor method for attack
     * @return 
     */
    public int getAttack() {
        return attack;
    }
    /**
     * Mutator method for attack
     * @param attack 
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    /**
     * Accessor method for health
     * @return 
     */
    public int getHealth() {
        return health;
    }
    /**
     * Mutator method for health
     * @param health 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * mutator method for max health
     * @param health 
     */
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }



}
