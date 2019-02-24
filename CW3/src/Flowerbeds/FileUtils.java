/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 * A utility class to perform common file read, write, and other I/O
 */

public class FileUtils {
    
    //To load image
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
    
    //To get file's path
    public static ArrayList<String> getFileNames(String dirPath){
        ArrayList<String> names = new ArrayList<String>();
        File dir = new File(dirPath);
        if(dir.isDirectory()){
            for(File f: dir.listFiles()){
                names.add(f.getPath());
            }
        }
        return names;
    }
    
    
    //To load flowerbed from file
    public static void loadImageFlowerbeds() {
        readFlowerbedsFromFile();
    }
    
    //To read flowerbeds and flowers from file
    public static void readFlowerbedsFromFile(){
        
        Path filePath = Paths.get("MyFlowerbeds.txt");
        if(!Files.exists(filePath)){
            System.out.println("There is no file to read from.");
        }
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(line.startsWith("Flowerbed")||line.startsWith("Flowers")||line.startsWith("Striped")){
                    FlowerbedsFromString(line);
                }
                else{
                    System.out.println("Bad line in file: "+line);
                }
            }
            System.out.println("The file is loaded.");
        } catch (IOException e) {
            System.out.println("Error reading file:" + filePath);
            e.printStackTrace();
        }
    }
    
    //save flowerbed and flowers to string
    private static void FlowerbedsFromString(String line){
        String[] data = line.split(",");
        if(line.startsWith("Flowerbed")){
            int x = Integer.parseInt(data[2]);
            int y = Integer.parseInt(data[3]);
            int d = Integer.parseInt(data[4]);
            int h = Integer.parseInt(data[5]);
            int c = Integer.parseInt(data[6]);
            int p = Integer.parseInt(data[7]);
            String path = data[1];
            Garden.addFlowerbed(path,x,y,d,h,c,p);
            
        }else if(line.startsWith("Flowers")){
            int size = Integer.parseInt(data[2]);
            int d = Integer.parseInt(data[3]);
            int h = Integer.parseInt(data[4]);
            int dir = Integer.parseInt(data[5]);
            String path = data[1];
            Garden.addFlowers(path,size,d,h,dir);
        }else{
            String path = data[1];
            int x = Integer.parseInt(data[2]);
            int y = Integer.parseInt(data[3]);
            int d = Integer.parseInt(data[4]);
            int dir = Integer.parseInt(data[5]);
            UserInterface.addStripedFlowers(path,x,y,d,dir);
            Garden.layoutStripedFlowers(dir);
        }

    }
    

}
