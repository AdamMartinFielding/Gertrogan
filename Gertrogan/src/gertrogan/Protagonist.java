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
public class Protagonist extends AbstractCharacter {
    
    String name;
    
    public Protagonist(String name,int health, int attack, int col, int row){
        super(health, attack, col, row);
        this.name = name;
        
    }
    
}
