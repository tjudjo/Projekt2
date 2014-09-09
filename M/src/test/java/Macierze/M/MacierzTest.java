package Macierze.M;

import junit.framework.TestCase;

public class MacierzTest extends TestCase {

	public void testLicz() {
		for(int i=1; i<200; i++){
			Macierz m = new Macierz(i,i);
			int wynik = m.licz();
			assertEquals("błąd w obliczaniu ilosci elementów macierzy", wynik,i*i);
		}
	}


}
