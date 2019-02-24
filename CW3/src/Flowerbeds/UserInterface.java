/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowerbeds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 * @author Di Zhen
 * ID: 1717719
 * 11th, Dec, 2018
 */
public class UserInterface {
//    private static JFrame myWindow;//JFrame
    private static Scanner kb;
    public static int bedwidth;//flowerbed images' weight
    public static int bedheight;//flowerbed images' weight
    public static int flowerHeight = 25;//flower images' height
    public static int flowerWidth = 25;//flower images' weight
    public static int columnGrids;//The number of flowers of one colunm
    public static int rowGrids;//The number of flowers of one row
    public static ArrayList<Flowerbed> myFlowerbeds = new ArrayList<>();// myFlowerbeds arraylist of Flowerbed class
    public static String[] FLOWER_PATHS = {
        "res/Green flower.png",
        "res/Pink flower.png", 
        "res/Red flower.png", 
        "res/Blue flower.png", 
        "res/Yellow flower.png", 
        "res/Purple flower.png",
        "res/Orange flower.png"
    };// A string storing the flower images' paths
    
    //Menu Interface
    public static void showMenu() {
        kb = new Scanner(System.in);
        System.out.println("Welcome to my garden!\n");
        
        boolean exit = false;
        while (!exit) {
            System.out.println("Please select:");
            System.out.println("1.\tAdd flowerbeds.");
            System.out.println("2.\tSave and exit.");
            
            if(myFlowerbeds.isEmpty()){
                int command = getIntInput();
                switch (command) {
                    case 1:
                        addFlowerbeds();
                        break;

                    case 2:
                        saveFlowerbeds();
                        exit = true;
                        break;

                    default:
                        System.out.println("Please input a value from 1 to 2");
                }
            }else{
                System.out.println("3.\tRemove flowerbeds.");
                
                int command = getIntInput();
                switch (command) {
                    case 1:
                        addFlowerbeds();
                        break;

                    case 2:
                        saveFlowerbeds();
                        exit = true;
                        break;

                    case 3:
                        Garden.RemoveFlowerbeds();
                        System.out.println("Removing flowerbeds:");
                        break;

                    default:
                        System.out.println("Please input a value from 1 to 3");
                }
            }
        }
        System.exit(0);
    }

    //To add striped flowers to myFlowers and myFlowerbeds arraylist
    public static void addStripedFlowers(String imagePath, int howMany, int width, int height, int pattern) {
        Flower Flower;
        for (int i = 0; i < howMany; i++) {
            Flower = new Flower(imagePath, width, height, pattern);
            myFlowerbeds.get(myFlowerbeds.size() - 1).addStripedFlower(Flower);
        }
    }

    //To save flowerbeds
    protected static void saveFlowerbeds() {
        Garden.saveFlowerbedsToFile(myFlowerbeds);
    }

    //To add flowerbeds
    private static void addFlowerbeds() {
        System.out.println("Adding flowerbeds:");
        ArrayList<String> fileNames = FileUtils.getFileNames("flowerbed");
        String path = fileNames.get(0);

        System.out.println("Please input a imageX");
        int imageX = getIntInputFlowerbeds();

        System.out.println("Please input a imageY");
        int imageY = getIntInputFlowerbeds();

        System.out.println("Please input a width");
        bedwidth = getIntInputSize();

        System.out.println("Please input a height");
        bedheight = getIntInputSize();

        System.out.println("Please input the number of color in this flowerbed." + "\n"
                + "1.\tOne color." + "\n"
                + "2.\tTwo colors." + "\n"
                + "3.\tThree colors."+ "\n"
                + "4.\tFour colors." + "\n"
                + "5.\tFive colors." + "\n"
                + "6.\tSix colors." + "\n"
                + "7.\tSeven colors." );

        int color = getIntInputList();//1.one color 2.two colors 3.three colors 4. four colors 5. five colors
        int howMany = Flowerbed.calculateHowmany(bedwidth, bedheight);// calculate the number of flowers
        int pattern = 0;//0. no pattern, 1. horizontal stripes, 2. vertical stripes
        
        if(color > 1){
            System.out.println("Please choose: "+"\n"+"1.\tHorizontal"+"\n"+"2.\tVertical ");
            pattern = getIntInputStripes();//1. horizontal; 2.vertical
        }
        
        Garden.addFlowerbed(path, imageX, imageY, bedwidth, bedheight, color, pattern);

        if(color == 1){
            //add no pattern flowerbed.
            System.out.println("Please choose a flower: ");
            for(int i = 0;i < FLOWER_PATHS.length; i++){
                System.out.println(i+1 + ". " + FLOWER_PATHS[i]);
            }
            int colorIndex = getIntInputList();  
            Garden.addFlowers(FLOWER_PATHS[colorIndex-1], howMany, flowerWidth, flowerHeight, pattern);
        }else {
            //choose pattern
            getStripedFlowersInput(pattern);
        }
    }
    
    //To add striped flowers
    private static void getStripedFlowersInput(int pattern) {
        columnGrids = bedwidth / flowerWidth;
        rowGrids = bedheight / flowerHeight;

        System.out.println("How many different colors do you want? ");
        int colors = myFlowerbeds.get(myFlowerbeds.size() - 1).getColors();
        
        int stripeWidth = 1; 
        if(colors<=4){
            System.out.println("What is the width of stripes? ");
            stripeWidth = getIntInputList();
        }

        int repeat;
        int howMany;

        if (pattern == 1) {
            repeat = rowGrids / (stripeWidth * colors) + 1;
            howMany = columnGrids * stripeWidth;
        } else {
            repeat = columnGrids / (stripeWidth * colors) + 1;
            howMany = rowGrids * stripeWidth;
        }

        for (int j = 0; j < repeat; j++) {
            for (int i = 0; i < colors; i++) {
                String path1 = FLOWER_PATHS[i];
                System.out.println("The path is  " + path1);
                addStripedFlowers(path1, howMany, flowerWidth, flowerHeight, pattern);
            }
        }
        Garden.layoutStripedFlowers(pattern);
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInput() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInput();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputList() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input < 1 || input > 7) {
                System.out.println("Please input a number between 1 and 7.");
                input = getIntInputList();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputList();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputStripes() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input < 1 || input > 2) {
                System.out.println("Please input a number 1 or 2.");
                input = getIntInputStripes();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputStripes();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputRemove() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input < 0 || input > myFlowerbeds.size() - 1) {
                System.out.println("Please input a number in the list.");
                input = getIntInputRemove();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputRemove();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputFlowerbeds() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input >= 800) {
                System.out.println("It is out of window bound, you cannot see it.");
                input = getIntInputFlowerbeds();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputFlowerbeds();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputSize() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input > 500) {
                System.out.println("It is too large, please set a smaller number.");
                input = getIntInputSize();
            } else if (input < 50) {
                System.out.println("It is too small, please set a larger number. ");
                input = getIntInputSize();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputSize();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputFlowerWidth() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input >= myFlowerbeds.get(myFlowerbeds.size() - 1).getWidth()) {
                System.out.println("It is out of flowerbed bound, please input a smaller number.");
                input = getIntInputFlowerWidth();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputFlowerWidth();
        } finally {
            return input;
        }
    }

    //To get a numebr from Scanner and transform to an integer
    public static int getIntInputFlowerHeight() {
        int input = 0;
        try {
            input = Integer.parseInt(kb.nextLine());
            if (input >= myFlowerbeds.get(myFlowerbeds.size() - 1).getHeight()) {
                System.out.println("It is out of flowerbed bound, please input a smaller number.");
                input = getIntInputFlowerHeight();
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not an int; "
                    + "please try again");
            input = getIntInputFlowerHeight();
        } finally {
            return input;
        }
    }


}
