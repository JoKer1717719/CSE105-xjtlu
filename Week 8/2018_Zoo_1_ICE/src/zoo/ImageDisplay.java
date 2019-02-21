
package zoo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author dizhe
 */
public class ImageDisplay extends JPanel {
    private int myX, myY;
    private int myWidth, myHeight;
    private Image myImage;
    //Constructor
    public ImageDisplay(Image image,
                        int myX, int myY, 
                        int myWidth, int myHeight) {
        super();
        this.myX = myX;
        this.myY = myY;
        this.myWidth = myWidth;
        this.myHeight = myHeight;
        this.setOpaque(false);
        myImage = image;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(myImage, 0, 0, myWidth, myHeight, this);
    }
//override the parent (Component) methods, to return our versions of these variables
    @Override
    public int getX() {
        return myX;
    }

    @Override
    public int getY() {
        return myY;
    }

    @Override
    public int getWidth() {
        return myWidth;
    }

    @Override
    public int getHeight() {
        return myHeight;
    }

    
}
