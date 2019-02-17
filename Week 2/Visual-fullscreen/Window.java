//change this
package fullscreen;
/**
 *
 * You can ignore all of this. SCROLL DOWN!! VVVVVVVVVV
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Window extends Frame implements MouseMotionListener {
    int screenWidth;
    int screenHeight;
    Graphics graphics;
    
    public static void main(String [] args){
        Window myWindow = new Window();
    }
    
    public Window(){
        init();
    }
 
    //*************** OK, HERE! work in this section. *****************************
    public void mouseMoved(MouseEvent e){
        int mouseX = e.getX();
        int mouseY = e.getY();
        if(mouseX > 600){
            graphics.setColor(Color.RED);
        }
        else{
            graphics.setColor(Color.CYAN);
        }
        graphics.drawOval(mouseX, mouseY, 20,20);
    }
    
    //************************************************************************
    
    public void mouseDragged(MouseEvent e){
        
    }
    
    private void init(){
        setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
        setSize(screenSize.width, screenSize.height);
        screenWidth = screenSize.width;
        screenHeight = screenSize.height;
        setBackground(Color.BLACK);  
        addMouseMotionListener(this);
        graphics = getGraphics();
        addWindowListener(new WindowAdapter() {                
            public void windowClosing(WindowEvent windowEvent){     
               System.exit(0);                                      
            }        
        });
    }
    
}
