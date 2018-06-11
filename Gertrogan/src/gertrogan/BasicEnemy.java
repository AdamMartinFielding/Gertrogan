/*
Evan Hansen
18/05/29
Class for a basic enemy
 */
package gertrogan;

import javax.swing.ImageIcon;

public class BasicEnemy extends AbstractCharacter {

    //Every basic enemy extends these basic prinicples from AbstractCharacter
    public BasicEnemy(int health, int attack, int col, int row) {
        super(health, attack, col, row);

    }

    public BasicEnemy(ImageIcon imageTile, ImageIcon image, int health, int attack, int col, int row) {
        super(imageTile, image, health, attack, col, row);

    }

    /**
     * The enemy will attack for a certain damage value, the calculations for
     * measuring how much damage is done to the player is done here
     *
     * @return
     */
    public int doDamage() {

        int attackRoll = (int) (Math.random() * 100 + 1); //Generate random number from 1 to 100
        int multiplier = 0; //the variable for measuring critical hits
        if (attackRoll <= 10) { //Miss
            multiplier = 0;
        } else if (attackRoll > 10 && attackRoll < 90) { //Hit the player
            multiplier = 1;
        } else if (attackRoll > 90) { //Critically hit the player
            multiplier = 2;
        }
        return multiplier;

    }

    /**
     *
     * @param image
     */
    public void setTile(ImageIcon image) {
        this.imageTile = image;
    }

}
