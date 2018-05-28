/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gertrogan;

public class basicEnemies {

    //To do list
    //
    
private int health;
private int attackPow;

    
    public basicEnemies(int xPos, int yPos){
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
