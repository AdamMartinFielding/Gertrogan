/*
Evan Hansen
18/05/29
Class for a basic enemy
 */
package gertrogan;

import javax.swing.ImageIcon;

public class BasicEnemy extends AbstractCharacter {

    //To do list
    //



    public BasicEnemy(int health, int attack, int col, int row) {
        super(health, attack, col, row);

    }

    public BasicEnemy(ImageIcon imageTile, ImageIcon image, int health, int attack, int col, int row) {
        super(imageTile, image, health, attack, col, row);

    }

    public int doDamage() {

        int attackRoll = (int) (Math.random() * 100 + 1);
        int multiplier = 0;
        if (attackRoll <= 10) {

             multiplier = 0;
        } else if (attackRoll > 10 && attackRoll < 90){
             multiplier = 1;
        } else if (attackRoll > 90){
             multiplier = 2;
        }
        return multiplier;
        

    }


    public void setTile(ImageIcon image){
        this.imageTile = image;
    }

}
