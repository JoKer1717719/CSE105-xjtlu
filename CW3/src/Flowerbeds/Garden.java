/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

import static Flowerbeds.UserInterface.getIntInputRemove;
import static Flowerbeds.UserInterface.myFlowerbeds;
import java.awt.Color;
import javax.swing.JFrame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 */
public class Garden {

    private static JFrame myWindow;//JFrame

    public static void main(String[] args) {
        Garden garden = new Garden();
        
    }
    
    public Garden(){
        myWindow = new JFrame("Welcome to My Garden.");
        myWindow.setVisible(true);
        myWindow.setSize(800, 800);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.getContentPane().setBackground(new Color(10, 90, 20));
        FileUtils.loadImageFlowerbeds();
        UserInterface.showMenu();
    }
    
        //To add flowebed to JFrame
    public static void addFlowerbed(String imagePath, int x, int y, int width, int height, int color, int patten) {
        Flowerbed myImage;
        myImage = new Flowerbed(imagePath, x, y, width, height, color, patten);
        myWindow.add(myImage);
        myFlowerbeds.add(myImage);
        System.out.println("Flowerbeds added: " + imagePath);
        myWindow.repaint();
    }

    //To add flowers with no pattern to JFrame
    public static void addFlowers(String imagePath, int howMany, int width, int height,int pattern) {
        Flower Flower;
        Flowerbed fb = myFlowerbeds.get(myFlowerbeds.size() - 1);
        for (int i = 0; i < howMany; i++) {
            Flower = new Flower(imagePath, width, height,pattern);
            fb.addFlower(Flower);
        }
        fb.layoutFlowerbeds();
        myWindow.repaint();
    }

    //To layout striped flowers horizontally or verticallylayout striped flowers horizontally or vertically
    public static void layoutStripedFlowers(int pattern) {
        if(pattern == 1) {
                myFlowerbeds.get(myFlowerbeds.size() - 1).layoutFlowerbedsH();
                myWindow.repaint();
        }else{
                myFlowerbeds.get(myFlowerbeds.size() - 1).layoutFlowerbedsV();
                myWindow.repaint();
        }
    }
    
    //To save flowerbeds to file
    public static boolean saveFlowerbedsToFile(ArrayList<Flowerbed> toWrite) {
        try (FileWriter fw = new FileWriter("MyFlowerbeds.txt", false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            for (Flowerbed im : toWrite) {
                if (im.getColors() == 1) {
                    out.println(im.getConstructorArgs());
                    out.println(im.getAddFlowersArgs());
                } else {
                    out.println(im.getConstructorArgs());
                    out.println(im.getAddStripedFlowersArgs());
                }
            }
            myWindow.repaint();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Flowerbeds are saved to file");
        return true;
    }
  
    //To remove the flowerbeds
    protected static void RemoveFlowerbeds() {
        System.out.println("Please choose an flowerbed to remove." + "\n");
        Iterator iterator = myFlowerbeds.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(i + " . " + iterator.next());
            i++;
        }
        int next;
        next = getIntInputRemove();
        myWindow.remove(myFlowerbeds.get(next));
        myFlowerbeds.remove(myFlowerbeds.get(next));
        myWindow.repaint();
    }

}
