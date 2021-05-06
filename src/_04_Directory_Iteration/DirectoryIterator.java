package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class DirectoryIterator {
	
	static DirectoryIterator d = new DirectoryIterator();
	public static void main(String[] args) {
		d.Iteration();
	}
	
		/* 
		 * The following is an example of how to list all of the files in a directory.
		 * Once the program is running, the directory is chosen using the JFileChooser.
		 */
		
	void Iteration() {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File directory = jfc.getSelectedFile();
			File[] files = directory.listFiles();
			if(files != null) {
				for(File f : files) {
				  System.out.println(f.getAbsolutePath());
				}
				
				for(int i = 0; i < files.length; i++) {
					if(!files[i].isDirectory()) {
						if(files[i].getAbsolutePath().endsWith(".java")) {
							try {
								FileWriter fw = new FileWriter(files[i].getAbsolutePath(), true);
								fw.write("Copyright © 2021 Jessie Shen");
								fw.close();
							}
							catch(IOException e) {
								e.printStackTrace();
							}
						}
					}
					else if(files[i].isDirectory()) {
						Iteration();
					}
				}
			}
		}

		
		/*
		 * Your task is to write a program that iterates through the src folder of this current Java Project. 
		 * For every .java file it finds, the program will add a (non-legally binding) copyright statement at the bottom.
		 * Be aware of possible directories inside of directories.
		 * (e.g //Copyright © 2019 FirstName LastName)
		 */
	}
}
