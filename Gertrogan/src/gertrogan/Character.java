/*
Evan Hansen
18/05/29
Interface for the Character class
 */
package gertrogan;

/**
 *
 * @author Evan
 */
public interface Character {
    
    public void move(int x, int y);
    
    public int getXPos();

    public int getYPos();
    
    public int getAttack();
    
    public int getHealth();

}
