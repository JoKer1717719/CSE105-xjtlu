/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 */
public class Flowerbed extends ImageDisplay {

    public ArrayList<Flower> myFlowers = new ArrayList<>();
    private String myType;//Path
    private int myMax = 0;//The maximum capacity of a flowerbed
    private int myRows;//flowerbed's height / flower's height
    private int myColumns;//flowerbed's width / flower's width
    private int bedwidth;//flowerbed's width
    private int bedheight;//flowerbed's height
    private int colors = 1;  // 1: one color , 2: two color , 3: three color ......
    private int pattern;//0: plain flowerbed, 1: horizontal striped flowerbed, 2: vertical striped flowerbed
    public static int flowerHeight = 25;//height of flower image
    public static int flowerWidth = 25;//width of flower image
    

    public Flowerbed(String imagePath, int myX, int myY, int myWidth, int myHeight, int colors) {
        super(imagePath, myX, myY, myWidth, myHeight);
        this.colors = colors;

    }

    public Flowerbed(String imagePath, int myX, int myY, int myWidth, int myHeight, int colors, int pattern) {
        super(imagePath, myX, myY, myWidth, myHeight);
        this.colors = colors;
        this.pattern = pattern;
        //TODO: ADD FLOWERS

    }

    public int getPattern(){
        return pattern;
    }
    
    public int getColors() {
        return colors;
    }

    public void setColors(int colors) {
        this.colors = colors;
    }
    
    @Override
    public int getHeight(){
        return myHeight;
    }
    
    @Override
    public int getWidth(){
        return myWidth;
    }

    public int getbedheight() {
        return bedheight;
    }

    public int getbedwidth() {
        return bedwidth;
    }

    //To calculate the maximum number of flowers can be added
    public static int calculateHowmany(int bedwidth, int bedheight) {
        int nColumns = bedwidth / flowerWidth;
        int nRows = bedheight / flowerHeight;
        int howMany = nColumns * nRows;
        return howMany;
    }

    //To calculate the maximum capacity of flowerbed
    public void calculateMax(Flower toAdd) {
        myRows = this.getHeight() / toAdd.getHeight();
        myColumns = this.getWidth() / toAdd.getWidth();
        System.out.println("myRows are: " + myRows + ", myColumns are : " + myColumns);
        myMax = myRows * myColumns;
    }

    //To make sure if the flowerbed is empty and add proper number of flowers with no pattern to it
    public boolean addFlower(Flower toAdd) {
        boolean accepted = false;
        if (myFlowers.isEmpty()) {
            myFlowers.add(toAdd);
            calculateMax(toAdd);
            myType = toAdd.getType();
            this.add(toAdd);
            accepted = true;
            System.out.println("Flower " + toAdd.getType()
                    + " added to empty flowerbed");
        } else if (myFlowers.size() < myMax) {
            if (myType.equals(toAdd.getType())) {
                myFlowers.add(toAdd);
                this.add(toAdd);
                accepted = true;
                System.out.println("Flower" + toAdd.getType()
                        + "added to flowerbed" + this.myType);
            } else {
                System.out.println("Flower rejected for type"
                        + toAdd.getType() + ", Required = " + myType);
            }
        } else {
            System.out.println("Flowerbed full");
        }
        System.out.println("myFlowers size = " + myFlowers.size());
        return accepted;
    }

    //To make sure if the flowerbed is empty and add proper number of flowers with stripe pattern to it
    public boolean addStripedFlower(Flower toAdd) {
        System.out.println("Add to the myFlowers.");
        boolean accepted = false;
        if (myFlowers.isEmpty()) {
            myFlowers.add(toAdd);
            calculateMax(toAdd);
            this.add(toAdd);
            accepted = true;
            System.out.println("Flower " + toAdd.getType()
                    + " added to empty flowerbed");
        } else if (myFlowers.size() < myMax) {
            myFlowers.add(toAdd);
            this.add(toAdd);
            accepted = true;
            System.out.println("Flower" + toAdd.getType()
                    + "added to flowerbed");
        } else {
            System.out.println("Flowerbed full");
        }
        System.out.println("myFlowers size = " + myFlowers.size());
        return accepted;
    }

    public void addFlowers(ArrayList<Flower> toAdd) {
        boolean allEqual = true;
        for (Flower Flower : toAdd) {
            if (!Flower.equals(toAdd.get(0))) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            for (Flower Flower : toAdd) {
                this.addFlower(Flower);
            }
        }
    }
    
    //To transform the flowerbed into string
    public String getConstructorArgs() {
        StringBuffer sb = new StringBuffer();
        sb.append("Flowerbed,");
        sb.append(getPath());
        sb.append(",");
        sb.append(getX());
        sb.append(",");
        sb.append(getY());
        sb.append(",");
        sb.append(getWidth());
        sb.append(",");
        sb.append(getHeight());
        sb.append(",");
        sb.append(getColors());
        sb.append(",");
        sb.append(getPattern());
        sb.append("\n");
        return sb.toString();
    }

    //To transform the flowers with no pattern into string
    public String getAddFlowersArgs() {
        StringBuffer sb = new StringBuffer();
        sb.append("Flowers,");
        sb.append(myFlowers.get(0).getPath());
        sb.append(",");
        sb.append(myFlowers.size());
        sb.append(",");
        sb.append(myFlowers.get(0).getWidth());
        sb.append(",");
        sb.append(myFlowers.get(0).getHeight());
        sb.append(",");
        sb.append(myFlowers.get(0).getdir());
        sb.append("\n");
        return sb.toString();
    }

    //To transform the flowers with sstripe pattern into string
    public String getAddStripedFlowersArgs() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < myFlowers.size(); i++) {
            sb.append("Striped Flower");
            sb.append(",");
            sb.append(myFlowers.get(i).getPath());
            sb.append(",");
            sb.append(1);
            sb.append(",");
            sb.append(myFlowers.get(i).getWidth());
            sb.append(",");
            sb.append(myFlowers.get(i).getHeight());
            sb.append(",");
            sb.append(myFlowers.get(i).getdir());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    //To layout the flowerbed with flowers with no pattern
    public void layoutFlowerbeds() {
        int paintX = 0;
        int paintY = 0;
        if (myFlowers.isEmpty()) {
            System.out.println("It is an empty flowerbed.");
            return;
        }
        Iterator<Flower> it = myFlowers.iterator();
        Flower Flower = myFlowers.get(0);
        for (int y = 0; y < myRows; y++) {
            paintX = 0;
            for (int x = 0; x < myColumns; x++) {
                if (it.hasNext()) {
                    Flower = it.next();
                    Flower.setY(paintY);
                    Flower.setX(paintX);
                    paintX += Flower.getWidth();
                }
            }
            paintY += Flower.getHeight();
        }
    }


    //To layout the flowerbed with horizontally striped flowers 
    public void layoutFlowerbedsH() {
        int paintX;
        int paintY = 0;
        if (myFlowers.isEmpty()) {
            System.out.println("It is an empty flowerbed.");
            return;
        }
        Iterator<Flower> it = myFlowers.iterator();
        Flower Flower = myFlowers.get(0);
        for (int y = 0; y < myRows; y++) {
            paintX = 0;
            for (int x = 0; x < myColumns; x++) {
                if (it.hasNext()) {
                    Flower = it.next();
                    Flower.setY(paintY);
                    Flower.setX(paintX);
                    paintX += Flower.getWidth();
                }
            }
            paintY += Flower.getHeight();
        }
    }

    //To layout the flowerbed with vertically striped flowers 
    public void layoutFlowerbedsV() {
        int paintX = 0;
        int paintY;
        if (myFlowers.isEmpty()) {
            System.out.println("It is an empty flowerbed.");
            return;
        }
        Iterator<Flower> it = myFlowers.iterator();
        Flower Flower = myFlowers.get(0);
        for (int y = 0; y < myColumns; y++) {
            paintY = 0;
            for (int x = 0; x < myRows; x++) {
                if (it.hasNext()) {
                    Flower = it.next();
                    Flower.setY(paintY);
                    Flower.setX(paintX);
                    paintY += Flower.getHeight();
                }
            }
            paintX += Flower.getWidth();
        }
    }

}
