//Create a Java program that prompts the user for a file name, reads the content of the file, 
//and prints it. Handle FileNotFoundException (if the file does not exist) and 
//IOException (for other input/output related errors) exceptions.


package com.wipro.exeption;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter File Name ");
		String fileName= scanner.nextLine();
		
		File file= new File(fileName);
		try {
			Scanner fileScanner= new Scanner(file);
			while(fileScanner.hasNextLine()) {
				String line =fileScanner.nextLine();
				System.out.println(line);
			}
			fileScanner.close();
		}
		catch (Exception e) { 
            if (e instanceof FileNotFoundException) {
                System.out.println("The file " + fileName + " was not found."); 
            } else { 
                System.out.println("An error occurred while reading the file."); 
                e.printStackTrace(); 
            }
        }finally {
        	System.out.println("Finally block excecuted");
            }
		scanner.close();
        }
        
		
	}


