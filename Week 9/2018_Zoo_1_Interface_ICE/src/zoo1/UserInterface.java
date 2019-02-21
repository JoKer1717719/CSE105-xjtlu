
package zoo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class UserInterface {
    private static Scanner kb;
    
    public static void showMenu(){
        kb = new Scanner(System.in);
        System.out.println("Welcome to my Zoo!\n");
        System.out.println("Please select:");
        System.out.println("1.\tAdd animal");
        System.out.println("2.\tRemove animal"); 
        System.out.println("3.\tStop");
        System.out.println("4.\tload image");
        
        int command = getIntInput();
        switch(command){ 
            case 1:
                getImageInput();
                break;
            case 2:
                System.out.println("Removing animal:");
                //now, how are we going to remove an animal
                break;  
            case 3:
                break;
            case 4:
                loadImage();
            default:
                System.out.println("Please input a value from 1 to 4");
        }    
    }
    
    private static int getIntInput(){
        int input = 0;
        try{
            input = Integer.parseInt(kb.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("That is not an int; "
                                + "please try again");
            input = getIntInput();
        }
        finally{
            return input;    
        }
    }
    public static void loadImage(){
        FileUtils.readZooFromFile();//there should have the class of method
    }
    
    private static void getImageInput(){
        System.out.println("Adding animal:");
        //System.out.println("Please input path to animal image:");
        //String path = kb.nextLine();    //NO! NOT LIKE THIS!
        ArrayList <String> fileNames = FileUtils.getFileNames("res");//add all the items in the res
        int counter = 1;
        System.out.println("Please input the number of image you want.");
        
        for(String s : fileNames){
            if(s.endsWith(".png")){
                System.out.println(counter+"."+s);
            }
            counter++;
        }
        
        int input = getIntInput();
        String path = fileNames.get(input-1);
        System.out.println("You selected "+ path);
        
        

            System.out.println("Please input a imageX");
            int imageX = Integer.parseInt(kb.nextLine());

            System.out.println("Please input a imageY");
            int imageY = Integer.parseInt(kb.nextLine());

            System.out.println("Please input a width");
            int width =Integer.parseInt(kb.nextLine());

            System.out.println("Please input a height");
            int height = Integer.parseInt(kb.nextLine());

            Zoo1.addImage(path, imageX, imageY, width, height);
            
        
        // How do you want the user to choose the image? SEE LECTURE PPT
        
        //OK, when the user has chosen the image, you need to get the x,y,width,height,
        //and then call:
        
        
        
    }

}
