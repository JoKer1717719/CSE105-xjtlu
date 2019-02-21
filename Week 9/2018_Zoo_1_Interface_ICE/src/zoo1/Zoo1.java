
package zoo1;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author dizhe
 */
public class Zoo1 {
    private static JFrame myWindow;
    private static ArrayList<ImageDisplay> myAnimals = new ArrayList<>();

    
    public static void main(String[] args) {
        myWindow = new JFrame();
        myWindow.setVisible(true);
        myWindow.setSize(400, 400);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FileUtils.readZooFromFile();
        UserInterface.showMenu();
        Zoo1.saveZoo();
        //Zoo1.readZoo();
        
    }
    
    protected static void saveZoo(){
        FileUtils.saveZooToFile(myAnimals);
    }
    
    protected static void readZoo(){
        FileUtils.readZooFromFile();
    }
    
    protected static void addImage(String imagePath){
        BufferedImage image = FileUtils.loadImage(imagePath);
        ImageDisplay myImage;
        myImage = new ImageDisplay(imagePath, 100, 100, 100,100);
        myWindow.add(myImage);
        myAnimals.add(myImage);
        System.out.println("Image added: "+ imagePath);
        myWindow.repaint();
    }
    
    protected static void addImage(String imagePath, int x, int y, int width, int height){
        BufferedImage image = FileUtils.loadImage(imagePath);
        ImageDisplay myImage;
        myImage = new ImageDisplay(imagePath, x, y, width,height);
        myWindow.add(myImage);
        myAnimals.add(myImage);
        System.out.println("Image added: "+ imagePath);
        myWindow.repaint();
    }

    public static JFrame getMyWindow() {
        return myWindow;
    }

    public static ArrayList<ImageDisplay> getMyAnimals() {
        return myAnimals;
    }
    
    
    
}
