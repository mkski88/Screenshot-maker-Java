package com.company;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        String path = "Your Path";
        //Print coordinates, width and height og screenshot
        int     x=0,
                y=0,
                w=0,
                h=0;
        try {
            Thread.sleep(12000);
            Robot robotObj = new Robot();
            Rectangle rectObj = new Rectangle(x, y, w, h);
            BufferedImage img = robotObj.createScreenCapture(rectObj);
            ImageIO.write(img, "jpg", new File(path));
            System.out.println("Screenshot Saved.");
            BufferedImage image = robotObj.createScreenCapture(rectObj);
            int height = image.getHeight();
            int width = image.getWidth();
            System.out.println("Height : "+ height);
            System.out.println("Width : "+ width);

        } catch (AWTException | IOException | InterruptedException ioe) {
            System.out.println(ioe);
        }

    }
}