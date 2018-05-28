/*
Evan Hansen
05/25/18
 */
package gertrogan;

/**
 *
 * @author Evan Hansen
 */
abstract public class AbstractCharacter implements Character {

    int xPos;
    int yPos;
    int attack;
    int health;
    boolean alive;

    public AbstractCharacter(int health, int attack, int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.attack = attack;
        this.health = health;
        alive = true;

    }
    
    public void move(int x, int y){
        
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int Attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int Health) {
        this.health = health;
    }

}
