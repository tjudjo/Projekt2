package Macierze.M;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Random rnd = new Random();
		int i = 0, j = 0;

		// //////////////////////wersory////////////////////////
		Wersor[] v = new Wersor[10];

		for (j = 0; j < 10; j++) {
			i = rnd.nextInt(9) + 1;
			switch (i % 3) {

			case 0:
				v[j] = new Wersor(i, 0, 0);
				break;
			case 1:
				v[j] = new Wersor(0, i, 0);
				break;
			case 2:
				v[j] = new Wersor(0, 0, i);
				break;
			}
		}
		System.out.println("Wersory");
		for (i = 0; i < 10; i++) {
			System.out.print("v" + i + " ");
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

		// ////////////////////macierze//////////////////////////

		Macierz m = new Macierz(5, 5);
		Macierz n = new Macierz(5, 5);
		System.out.println("Macierz m");
		m.wypisz();

		System.out.println("Macierz N");
		n.wypisz();

		System.out.println("\ndodawanie macieryz n i m = ");
		m.dodawanie(n);
		m.wypisz();

		System.out.println("\nodejmowanie macieryz n i m = ");
		m.odejmowanie(n);
		m.wypisz();
		
		System.out.println("\nmnozenie macieryz n i m = ");
		m.mnozenie(n);
		m.wypisz();
		
		
		
		System.out.println("ilosc elementw macierzy n*m = " + m.licz());
	}
	
	

}