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
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.*;
public class Battle extends JPanel implements KeyListener {
    
    boolean pressed = false;
    int xPos = 100;
    int xSpeed = 15;
    boolean first = true;
    int rand = 0;
    int damage = 0;
    String message = "";
    Protagonist player = new Protagonist("ger",5,5,5,5);
    public Battle() {
        ActionListener al = new ActionListener() {
            //when the timer ticks
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (xPos > 724) {
                    xSpeed = -xSpeed;
                }
                if (xPos < 51) {
                    xSpeed = -xSpeed;
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
        setFocusable(true);
        this.addKeyListener(this);
    }
    public void keyTyped(KeyEvent e) {
        //not needed
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
       //will see if space bar is pressed to attack or to continue 
        if (keyCode == KeyEvent.VK_SPACE && xSpeed != 0) {
           xSpeed = 0;
           if(xPos>rand+150 && xPos<rand +250){
               damage = player.getAttack()*2;
               message = "CRITTICAL HITT";
           }else if(xPos>rand && xPos<rand + 400){
               damage = player.getAttack();
               message = "HITT";
           }else{
               damage = 0;
               message = "MISS";
           }
           
        } else if(keyCode == KeyEvent.VK_SPACE && xSpeed == 0){
            first = true;
            xPos = 100;
            xSpeed = 15;
        }
    }

    public void keyReleased(KeyEvent e) {
        //not needed
    }
    //will do the actual drawing
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString(message, 50, 50);
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
