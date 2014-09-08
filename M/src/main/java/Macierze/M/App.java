package Macierze.M;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HK
 */
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
       Random rnd = new Random();
       int i=0,j=0;
       
       
        ////////////////////////wersory//////////////////////// 
       Wersor[] v = new Wersor[10];
       
       for(j=0; j<10; j++){
            i = rnd.nextInt(9) + 1;
           switch (i%3) {
               
            case 0:  v[j] = new Wersor(i,0,0);
                     break;
            case 1:  v[j] = new Wersor(0,i,0);
                     break;
            case 2:  v[j] = new Wersor(0,0,i);
                     break;
        }
       }
       System.out.println("Wersory");
       for(i=0; i<10; i++){
           System.out.print("v"+i+" ");
           v[i].wypisz();
       }
          
       
        System.out.println("mnozenie v1 i v2 = ");
        v[1].mnozenie(v[2]);
        v[1].wypisz();
        
        System.out.println("\ndodawanie v3 i v4 = ");
        v[3].dodawanie(v[4]);
        v[3].wypisz();
       
        System.out.println("\nodejmowanie v5 i v6 = ");
        v[5].odejmowanie(v[6]);
        v[5].wypisz();
        
        v[7].mnozenie(v[8]);
        v[7].dodawanie(v[9]);
        doPliku("Wykonano mnozenie v[7] i v[8] i dadanie wyniku do v[9]");
       
        
        //////////////////////macierze//////////////////////////
        
        MacierzOdwracalna m = new MacierzOdwracalna(5,5);
        MacierzOdwracalna n = new MacierzOdwracalna(5,5);
        System.out.println("Macierz m");
        m.wypisz();
        
        System.out.println("Macierz N");
        n.wypisz();
        
        System.out.println("\ndodawanie macieryz n i m = ");
        m.dodawanie(n);
        m.wypisz();
        
         System.out.println("ilosc elementw macierzy n*m = " + m.licz());
         //m.odwroc();                                                      //////////////////////*zrobic odwracanie macierzy*///////////////////
  
         
/////////////////////////*macierz i wektor urzykownika*/
         
         int rozmiar = 0;
         double temp =0;
         Scanner odczyt = new Scanner(System.in);
         System.out.println("Podaj rozmiar macierzy");
         
         rozmiar  =  odczyt.nextInt();
         
         Macierz m1 = new Macierz(rozmiar,rozmiar);
         Macierz n1 = new Macierz(rozmiar,rozmiar);
         
         System.out.println("Podaj elementy pierwszej macierzy\n" );
         
         for(i=0;i<rozmiar;i++){
             for(j=0;j<rozmiar;j++){
                 temp = odczyt.nextDouble();
                 m1.macierz[i][j] = temp; 
             }
         }
         
         
         System.out.println("Podaj elementy drugiej macierzy\n" );
         
         for(i=0;i<rozmiar;i++){
             for(j=0;j<rozmiar;j++){
                 temp = odczyt.nextDouble();
                 n1.macierz[i][j] = temp; 
             }
         }
         
         
         
         System.out.println("\nPierwsza macierz\n" );
         m1.wypisz();
         
         System.out.println("\nDruga macierz\n" );
         n1.wypisz();
         
         System.out.println("\nWynik dodawania macierzy\n" );
         m1.dodawanie(n1);
         m1.wypisz();
         
         System.out.println("\nWynik mnozenia macierzy\n" );
         m1.mnozenie(n1);
         m1.wypisz();
         
         System.out.println("\nWynik odejmowania macierzy\n" );
         m1.odejmowanie(n1);
         m1.wypisz();
         
         
         int t1,t2,t3;
         
         System.out.println("Podaj elementy pierwszgo wektora");
         t1 = odczyt.nextInt();
         t2 = odczyt.nextInt();
         t3 = odczyt.nextInt();
         
         Vector3D x = new Vector3D(t1,t2,t3);
         
         System.out.println("Podaj elementy drugiego wektora wektora");
         t1 = odczyt.nextInt();
         t2 = odczyt.nextInt();
         t3 = odczyt.nextInt();
         
         Vector3D y = new Vector3D(t1,t2,t3);
         
         System.out.println("\nPierwszy wektor");
         x.wypisz();
         
         System.out.println("\nDrugi wektor");
         y.wypisz();
         
         System.out.println("\nWynik dodawania wektorów\n" );
         x.dodawanie(y);
         x.wypisz();
         
         System.out.println("\nWynik mnozenia wektorów\n" );
         x.mnozenie(y);
         x.wypisz();
         
         System.out.println("\nWynik odejmowania wektorów\n" );
         x.odejmowanie(y);
         x.wypisz();
         
   }
    
}