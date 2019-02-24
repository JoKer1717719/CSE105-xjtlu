/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 */
public class ImageDisplay extends JPanel {

    int myX;
    int myY;
    int myWidth;
    int myHeight;
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

    public String getPath() {
        return myPath;
    }
    
    @Override
    public String toString(){
        return "Flowerbed, myX="+myX+", myY="+myY+", myWidth="+myWidth+
                ", myHeight="+myHeight+", myPath="+myPath+".";
    }
    
    public BufferedImage getImage(){
        return (BufferedImage) myImage;
    }
}
