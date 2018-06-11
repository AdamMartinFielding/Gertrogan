/*
 * B Cutten
 * Sept 2014
 * A test of the Graphics 2D in Java, code from http://zetcode.com/gfx/java2d/
 */
package gertrogan;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BattleS extends JFrame {
Overworld overworld;
    //constructor
    public BattleS(Overworld o) {
        overworld = o;
        initUI();
    }

    //create the custom JFrame
    private void initUI() {
        
        //set title of the JFrame
        setTitle("BATTLE");
        //add a custom JPanel to draw on
        add(new Battle(overworld, this));
        //set the size of the window
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
