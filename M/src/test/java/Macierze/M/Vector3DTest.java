package Macierze.M;

import junit.framework.TestCase;

public class Vector3DTest extends TestCase {

	public void testDodawanie() {
		for(int a=-10; a<10; a++){
			for(int b=-10; b<10; b++){
				for(int c=-10; c<10; c++){
					Vector3D x = new Vector3D(c,b,a);
					Vector3D y = new Vector3D(b,a,a);
					Vector3D z = new Vector3D();
					x.dodawanie(y);
					z.punkt[0] = c+b;
					z.punkt[1] = b+a;
					z.punkt[2] = a+a;
					
					assertEquals("błąd w dodawaniu wektora", x.punkt[0],z.punkt[0]);
					assertEquals("błąd w dodawaniu wektora", x.punkt[1],z.punkt[1]);
					assertEquals("błąd w dodawaniu wektora", x.punkt[2],z.punkt[2]);
				}
				
			}
			
		}
	}

	public void testOdejmowanie() {
		for(int a=-10; a<10; a++){
			for(int b=-10; b<10; b++){
				for(int c=-10; c<10; c++){
					Vector3D x = new Vector3D(a,b,c);
					Vector3D y = new Vector3D(c,a,a);
					Vector3D z = new Vector3D();
					x.odejmowanie(y);
					z.punkt[0] = a-c;
					z.punkt[1] = b-a;
					z.punkt[2] = c-a;
					
					assertEquals("błąd w odejmowaniu wektora", x.punkt[0],z.punkt[0]);
					assertEquals("błąd w odejmowaniu wektora", x.punkt[1],z.punkt[1]);
					assertEquals("błąd w odejmowaniu wektora", x.punkt[2],z.punkt[2]);
				}
				
			}
			
		}
	}

	public void testMnozenie() {
		for(int a=-10; a<10; a++){
			for(int b=-10; b<10; b++){
				for(int c=-10; c<10; c++){	
					Vector3D x = new Vector3D(a,b,c); 
					Vector3D y = new Vector3D(c,a,c); 
					Vector3D z = new Vector3D();
					x.mnozenie(y);
					
					z.punkt[0] = b*c - c*a;
					z.punkt[1] = c*c - a*c;
					z.punkt[2] = a*a - b*c;

					assertEquals("błąd w mnozeniu wektora", x.punkt[0],x.punkt[0]);
					assertEquals("błąd w mnozeniu wektora", x.punkt[1],x.punkt[1]);
					assertEquals("błąd w mnozeniu wektora", x.punkt[2],x.punkt[2]);


					
				}
				
			}
			
		}
	}

	public void testDlugosc() {
		for(int a=-10; a<10; a++){
			for(int b=-10; b<10; b++){
				for(int c=-10; c<10; c++){
					Vector3D v = new Vector3D(a,b,c);
					double wynik = v.dlugosc();
					assertEquals("błąd w dlugosc wektora", wynik, Math.sqrt((a*a+b*b+c*c)));
					
				}
				
			}
			
		}
	}

}
