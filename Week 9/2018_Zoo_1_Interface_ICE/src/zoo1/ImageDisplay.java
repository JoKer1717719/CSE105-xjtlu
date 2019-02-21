
package zoo1;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author dizhe
 */
public class ImageDisplay extends JPanel {
    private final int myX, myY;
    private final int myWidth, myHeight;
    private final String myPath;
    private final Image myImage;
    
    public ImageDisplay (String imagePath,
                        int myX, 
                        int myY, 
                        int myWidth, 
                        int myHeight){
        this.myX = myX;
        this.myY = myY;
        this.myWidth = myWidth;
        this.myHeight = myHeight;
        this.myPath = imagePath;
        myImage = FileUtils.loadImage(imagePath);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(myImage, 0, 0, myWidth, myHeight, this);
    }

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
    
    @Override
    public String toString(){
        return "ImageDisplay,"+" myX="+myX+", myY="+myY+", myWidth="+myWidth+
                ",myHeight="+myHeight+",myPath="+myPath;
    }

      
    
}
