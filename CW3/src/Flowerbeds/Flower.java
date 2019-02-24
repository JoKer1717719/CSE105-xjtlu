/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

/**
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 */
public class Flower extends ImageDisplay{
    private String myType; //Path
    private int pattern = 0; //1.horizontal; 2. vertical
    public final int myWidth = 25;//flower images' width
    public final int myHeight = 25;//flower images' height

    public Flower(String imagePath, int myX, int myY, int myWidth, int myHeight) {
        super(imagePath, myX, myY, myWidth, myHeight);
        myType = imagePath;
        
        System.out.println("Flower constructed:"+myType);
        this.setOpaque(false);
    }
    
    public Flower(String imagePath, int myWidth, int myHeight, int pattern){
        super(imagePath,0,0,myWidth,myHeight);
        this.pattern = pattern;
        myType = imagePath;
        //this.directionChoice = directionChoice;
        System.out.println("Flower to xy constructed: "+ myType);
        this.setOpaque(false);
    }


    public String getType(){
        return myType;
    }
    
    @Override
    public int getHeight(){
        return myHeight;
    }
    
    @Override
    public int getWidth(){
        return myWidth;
    }
        
    public int getdir(){
        return pattern;
    }
    
    public void setX(int myX){
        this.myX = myX;
    }
    
    public void setY(int myY){
        this.myY = myY;
    }

    public void setdir(int directionChoice){
        this.pattern = pattern;
    }
    


}



