/*
Evan Hansen
18/05/29
Class for a basic enemy
 */
package gertrogan;

public class BasicEnemy {

    //To do list
    //
    
private int health;
private int attackPow;

    
    public BasicEnemy(int xPos, int yPos){
        health = 100;
        attackPow = 10;
        
        
        
    }
    
    public int takeDamage(int playerHealth, int enemyDamage) {

        playerHealth = playerHealth - enemyDamage;

        if (playerHealth <= 0) {
        //Player death method required
        //death();
            return 0;
        } else {
            return playerHealth;
        }
    }

}
