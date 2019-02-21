/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author dizhe
 */
public class Zoo1 {
    private JFrame myWindow;
    private int myWidth = 1000;//Change the size of the window to make it a bigger screen
    private int myHeight = 1000;

    public static void main(String[] args) {
        Zoo1 z1 = new Zoo1();
    }
    
    public Zoo1(){
        myWindow = new JFrame("Di Zhen's Zoooooo");
        myWindow.setVisible(true);
        myWindow.setSize(myWidth, myHeight);
        //myWindow.getContentPane().setBackground(new Color(20,100,20));
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //addImage("cow150.png");
        
        addImage("baby.png",300,300,100,100);
        addImage("baby6.png",500,350,100,100);
        addImage("baby1.png",450,300,100,100);
        addImage("baby2.png",200,350,100,100);
        addImage("baby3.png",150,450,100,100);
        addImage("baby4.png",300,400,80,100);
        addImage("baby5.png",400,400,100,100);
        addImage("baby7.png",600,400,100,100);
        addImage("baby28.png",850,400,100,100);
        addImage("baby8.png",600,300,100,100);
        addImage("baby9.png",700,350,100,150);
        addImage("baby10.png",800,300,150,150);
        addImage("baby6.png",500,350,100,100);
        addImage("baby11.png",900,300,100,100);
        addImage("baby12.png",1000,350,100,100);
        addImage("baby19.png",1250,500,100,100);
        addImage("baby13.png",1100,300,100,100);
        addImage("baby15.png",1250,400,100,100);
        addImage("baby14.png",1200,300,100,100);
        addImage("baby16.png",1100,400,100,100);
        addImage("baby17.png",1000,450,100,100);
        addImage("baby18.png",1250,400,100,100);
        addImage("baby20.png",1100,500,100,100);
        addImage("baby21.png",900,500,100,100);
        addImage("baby22.png",800,500,100,100);
        addImage("baby23.png",700,500,100,100);
        addImage("baby24.png",600,500,150,150);
        addImage("baby25.png",500,450,100,100);
        addImage("baby26.png",400,500,100,100);
        addImage("baby27.png",300,530,100,100);
        
        addImage("bird.png",850,100,300,200);
        addImage("bird3.png",400,150,150,150);
        addImage("bird2.png",1300,100,250,250);
        addImage("bird5.png",50,50,300,300);
        addImage("bird4.png",1300,500,200,400);
        
        

        addImage("beijing.png",100,100,1000,1000);
        addImage("beijing.png",100,100,800,800);
        addImage("beijing.png",600,200,800,800);
        addImage("beijing.png",600,100,800,800);
        addImage("sky.png",1,1,2000,2000);
 
       
        
        
    }
    
    private void addImage(String imagePath){
        BufferedImage myImage = FileUtils.loadImage(imagePath);
        //Add a for loop to paint a line of cows across the window
//        for (int i = 0; i<=myWidth;i+=100){
//            ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, i, 1, 100,100);//Change the size
                    //(first two variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//        }       

        //Add a for loop to paint a line of cows vertically down the window
//        for (int i = 0; i<=myWidth;i+=100){
//            ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, 1, i, 100,100);//Change the size(first two 
                    //variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//        }

        //Add a for loop to draw a line of cows diagonally
//        for (int i = 0; i<=myWidth;i+=100){
//            ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, i, i, 100,100);//Change the size(first two 
                    //variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//        }

        //Add a for loop to show a row of images with each image getting larger
//        for (int i = 0; i<=myWidth;i+=200){
//            ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, i, 1, 100+i/10,100+i/10);//Change the size
                    //(first two variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//        }

        //Add a for loop to show a row of images with each image getting smaller
//        for (int i = 0; i<=myWidth;i+=200){
//            ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, i, 1, 200-i/10,200-i/10);//Change the size
                    //(first two variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//        }
        
        //we can used nested for loops to print a grid of cows
//        for (int y = 0; y<=myHeight;y+=100){
//            for (int x = 0; x<=myWidth;x+=100){
//                ImageDisplay myImageDisplay = 
//                    new ImageDisplay(myImage, y, x, 100,100);//Change the size(first two 
                    //variables) and location(last two variables) of the cow
//            myWindow.add(myImageDisplay);
//            myWindow.repaint();
//            }
//        }
            ImageDisplay myImageDisplay = 
                    new ImageDisplay(myImage, 100, 100, 100,100);//Change the size(first two 
                                //variables) and location(last two variables) of the cow
            myWindow.add(myImageDisplay);
            myWindow.repaint();
            

    }
    private void addImage(String imagePath, int x, int y, int width, int height){
    BufferedImage myImage = FileUtils.loadImage(imagePath);
                ImageDisplay myImageDisplay = 
                    new ImageDisplay(myImage, x, y, width,height);//Change the size(first 
                               //two variables) and location(last two variables) of the cow
            myWindow.add(myImageDisplay);
            myWindow.repaint();
}
    
    
    
}
