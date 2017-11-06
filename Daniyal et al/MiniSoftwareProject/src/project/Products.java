package project;

import java.awt.Image;
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class Products {

    public static Scanner wordscan = new Scanner(System.in);

    private double price;
    private String name;
    private String sellerUsername;
    private boolean isSold = false;
    private boolean auctionable = false;
    private double maxBid;
    private int ID;

    public Products(double p, String n, String s, double m, int i) {
        price = p;
        name = n;
        sellerUsername = s;
        maxBid = m;
        ID = i;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean Sold() {
        return isSold;
    }

    public void setSold() {
        isSold = true;
    }
    
    public String getName(){
        return name;
    }
    
    public int getID(){
        return ID;
    }

    //Below method shouldn't be necessary if the upload image function works properly
    //I'll leave this here in case the upload image won't work 
    
//    public void downloadImage() {
//        try {
//            String fileName = "digital_image_processing.jpg";
//
//            System.out.println("Please imput the image url");
//            String website = wordscan.nextLine() + fileName;
//
//            URL url = new URL(website);
//            InputStream inputStream = url.openStream();
//            OutputStream outputStream = new FileOutputStream(fileName);
//            byte[] buffer = new byte[2048];
//
//            int length = 0;
//
//            while ((length = inputStream.read(buffer)) != -1) {
//                System.out.println("Buffer Read of length: " + length);
//                outputStream.write(buffer, 0, length);
//            }
//
//            inputStream.close();
//            outputStream.close();
//
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//    }
    
    public void uploadImage() {
        Image image = null;
        try {
            URL url = new URL(wordscan.nextLine());
            image = ImageIO.read(url);
        } catch (IOException e) {
            //e.printStackTrace();  //I don't know if I really need this or not, I don't even really know what it does 
        }

        JFrame frame = new JFrame();
        frame.setSize(50, 50);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }

}//end products class
