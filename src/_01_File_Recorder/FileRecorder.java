package _01_File_Recorder;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
    public static void main(String[] args) {
        try{
         FileWriter file = new FileWriter("src/_01_File_Recorder/message");
         String message= JOptionPane.showInputDialog("Write something!");
         file.write("\n" + message);
         file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
