//Martin Holysh
//May 28
//Using 2d graphics to make battle scene 
package gertrogan;

/**
 *
 * @author mardy347
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Battle extends JPanel {

    boolean pressed = false;
    int xPos = 0;
    int xSpeed = 0;
    boolean first = true;
    int rand = 0;

    public Battle() {
        ActionListener al = new ActionListener() {
            //when the timer ticks
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (xPos > 724) {
                    xSpeed = -15;
                }
                if (xPos < 51) {
                    xSpeed = 15;
                }
                xPos = xPos + xSpeed;
                repaint(); //redraw the panel
            }
        };
        //make a new timer, and attach it to the action listener
        //the timer fires every 30 ms
        Timer timer = new Timer(20, al);
        //start the timer going
        timer.start();
    }

    //will do the actual drawing
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Java 2D", 50, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(50, 600, 700, 100);
        //will only randomize once so when the drawing is redone it is not rerandomized 
        if (first == true) {
            rand = (int) (Math.random() * 300) + 50;
            first = false;
        }
        g2d.setColor(Color.BLUE);
        g2d.fillRect(rand, 600, 400, 100);
        g2d.setColor(Color.CYAN);
        g2d.fillRect(rand + 150, 600, 100, 100);
        g2d.setColor(Color.gray);
        g2d.fillRect(xPos, 600, 25, 100);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);//prepares the panel for drawing
        doDrawing(g);
    }
}
