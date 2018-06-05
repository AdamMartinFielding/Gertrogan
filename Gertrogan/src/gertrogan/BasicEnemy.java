/*
Evan Hansen
18/05/29
Class for a basic enemy
 */
package gertrogan;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BasicEnemy extends AbstractCharacter {

    //To do list
    //
    
private int health;
private int attackPow;
private Icon image;

    public BasicEnemy(int health, int attack, int col, int row){
        super(health, attack, col, row);
        this.image = image;

    }
    
    public Icon getImage(){
        return image;
    }
    
    
    public int doDamage(){
        
        int attackRoll = (int) (Math.random() * 100 + 1);
        int returnedAttack = 0;
        if (attackRoll <= 10) {
             returnedAttack = 0;
        } else if (attackRoll > 10 && attackRoll < 90){
             returnedAttack = attack;
        } else if (attackRoll > 90){
             returnedAttack = attack * 2;
        }
        return returnedAttack;
        
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
   
}
