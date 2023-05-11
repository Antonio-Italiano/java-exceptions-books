package org.exceptions.java;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		
	
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti Libri vuoi inserire?");
		int valLng = sc.nextInt();
		
		
		Libro[] libri = new Libro[valLng];
		
		for(int x = 0; x < libri.length; x++) {
			
			System.out.println("------------------------------------");
			
			System.out.println("Inserire Titolo");
			String titles = sc.next();
			sc.nextLine();
			
			System.out.println("Inserire numero pagine");
			int numberPages = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Inserire Autore");
			String author = sc.next();
			
			System.out.println("Inserire Editore");
			String publisher = sc.next();
			
			//New Book
			try {
				Libro l1 = new Libro(titles, numberPages, author, publisher);	
				libri[x]= l1;				
			} catch (Exception e) {
				
				System.err.println("errore 1" + e.getMessage());
			}
		}
		sc.close();
		
		try {
            FileWriter myWriter = new FileWriter("C:\\Obsidian.java\\Nuova cartella\\Libri.txt");
            myWriter.write("");
    
            myWriter.close();
        } catch (IOException e) {
        	System.err.println("Errore nella lettura di Libri.txt\n" + e.getMessage());
        }	
		
		System.out.println("------------------------------------");
		for(int x = 0; x < libri.length; x++) {
			try {
	            FileWriter myWriter = new FileWriter("C:\\Obsidian.java\\Nuova cartella\\Libri.txt", true);
	            myWriter.write(libri[x].toString() + "\n\n");
	    
	            myWriter.close();
	        } catch (IOException e) {
	        	System.err.println("Errore nella lettura di Libri.txt\n" + e.getMessage());
	        }
		}
		
		 try {
	            FileReader reader = new FileReader("C:\\Obsidian.java\\Nuova cartella\\Libri.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	        	System.err.println("Errore nella lettura di Libri.txt\n" + e.getMessage());
	        }
	}
	
}
