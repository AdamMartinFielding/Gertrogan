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

    int col;
    int row;
    int attack;
    int health;
    boolean alive;

    public AbstractCharacter(int health, int attack, int col, int row) {
        this.col = col;
        this.row = row;
        this.attack = attack;
        this.health = health;
        alive = true;
    }

    public void move(int x, int y) {

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

    public void setAttack(int Attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int Health) {
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
