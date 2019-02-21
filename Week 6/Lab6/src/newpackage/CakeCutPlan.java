
package newpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


/**
 *
 * @author joelewis
 */
public class CakeCutPlan extends JFrame {      
    //for drawing
    //you need to set these in the constructor
    int cakeX, cakeY, cakeWidth, cakeHeight;
    //and calculate these
    double sliceWidth, sliceHeight, slicesPerSide;
    //a picture of a wedding cake - top view!
    BufferedImage image; 
    
    public CakeCutPlan(Week6Cake cake){
        super();
        this.setSize(800, 800); //try changing this
        //initialise instance variables here
        //In the constructor, initialise the variables cakeX, cakeY, cakeWidth, cakeHeight. Suggested values: 40, 40, 720, 720.
        cakeX = 40;
        cakeY = 40;
        cakeWidth = 720;
        cakeHeight = 720;
        
        //calculations
        int numSlices = cake.getSlices();
        //you need to calculate sliceWidth and sliceHeight here
        //square number is 16
//        sliceWidth = 180;
//        sliceHeight = 180;
//        slicesPerSide = 4;
        //square number is 36
//        sliceWidth = 120;
//        sliceHeight = 120;
        //square number is 64;
        sliceWidth = 90;
        sliceHeight = 90;
        System.out.println("Slice width = "+sliceWidth+" slice height = "+sliceHeight+" slicesPerSide = "+slicesPerSide);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make sure you have an image file in your project folder
        image = loadImage("cake.jpg");  //this must be the name of your image file EXACTLY
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        System.out.println("Paint called in my frame");
        g.drawImage(image, cakeX, cakeY, cakeWidth, cakeHeight, rootPane);
        g.setColor(Color.BLACK);
        g.drawRect(cakeX, cakeY, cakeWidth, cakeHeight);
        // you will see that the cake is cut into 2 slices, using a single line of code in the paint method:
        g.drawLine(cakeX+cakeWidth/2, cakeY, cakeX+cakeWidth/2, cakeY+cakeHeight);
        //here you will need to create two for loops, one to draw the vertical lines,
        //one to draw the horizontal lines
        
        //cut 64 squares
        for(int i = 0;i<=cakeWidth;i+=sliceWidth){
              g.drawLine(cakeX+i, cakeY, cakeX+i, cakeY+cakeHeight);
        }
        for(int i = 0;i<=cakeHeight;i+=sliceHeight){
              g.drawLine(cakeX, cakeY+i, cakeX+cakeHeight, cakeY+i);
        }

        
        //g.drawLine(x1, y1, x2, y2);
    }
    
    
    //Don't worry about this method, we will look at it next week
    public static BufferedImage loadImage(String imagePath){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(imagePath));
            System.out.println("Image loaded: "+imagePath);
        } catch (IOException e) {
            System.out.println("Problem loading image: "+imagePath);
            e.printStackTrace();
        }
        return image;
    }
}
