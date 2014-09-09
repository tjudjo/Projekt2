package Macierze.M;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class App {

    static public void doPliku(String info)
    {
	try 
        {
		FileWriter z = new FileWriter("plik.txt",true);
		BufferedWriter zapis = new BufferedWriter(z);
		zapis.write(info);
		zapis.newLine();
		zapis.close();
	} catch (IOException e) 
        {
		e.printStackTrace();
	}		
    }

    
   public static void main(String[] args) { 
	   
System.out.println("\n\n");
   Vector3D x = new Vector3D();
   

   Wypisywalny a  = new Vector3D();
   a = new Dekorator(a);
   a.wypisz();
   
   }
    
}