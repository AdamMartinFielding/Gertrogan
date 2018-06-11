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
  


    public AbstractCharacter(int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.maxHealth = health;
        this.health = health;

    }

    
    public AbstractCharacter(ImageIcon imageTile, ImageIcon image, int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.health = health;
        this.maxHealth = health;
        this.imageTile = imageTile;
        this.image = image;

    }
    

   public ImageIcon getTile(){
        return imageTile;

    }
   
   public ImageIcon getBattleImage(){
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
    
    public void setMaxHealth(int health){
        this.maxHealth = health;
    }



}
