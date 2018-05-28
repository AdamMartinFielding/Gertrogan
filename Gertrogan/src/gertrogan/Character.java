/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
