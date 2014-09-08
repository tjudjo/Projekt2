package Macierze.M;

import java.util.Random;

public class Macierz extends Algebra implements Dzialaj <Macierz>, Wypisywalny {
    protected int rozmiar;
    protected double [][] macierz;

    public Macierz(double[][] macierz) {
        this.macierz = macierz;
        this.rozmiar = macierz.length;
    }

    public Macierz(int w, int k) {
        this.rozmiar = w;
        macierz = new double[w][k];
        this.inicjuj(10);
  
    }
    
    Macierz()
    {
        for(int i = 0; i < macierz.length; i++) 
        {
            for(int j = 0; j < macierz[i].length; j++)   
                macierz[i][j] = 0; 
        } 
     }
    
       
    public void inicjuj(int zakres)
    {
        Random rnd = new Random();
        
        for(int i = 0; i < macierz.length; i++) 
        {
            for(int j = 0; j < macierz[i].length; j++) 
                macierz[i][j] = rnd.nextInt(zakres); 
        }
     }
    
 
    public void wypisz()
    {
        Macierz A=this;
        for(int i = 0; i < A.macierz.length; i++) 
        {
            for(int j = 0; j < A.macierz[i].length; j++)   
            {
                System.out.printf(A.macierz[i][j] + " ");
            }
            System.out.println();
        }
     }


    public void dodawanie(Macierz B)   
    {
        Macierz A = this;
        for(int i=0; i<A.macierz.length; i++)
        {
            for(int j = 0; j < A.macierz[i].length; j++)
                A.macierz[i][j]=A.macierz[i][j]+B.macierz[i][j];
        }
    }
    
    
    public void odejmowanie(Macierz B)   
    {
        for(int i=0; i<macierz.length; i++)
        {
            for(int j = 0; j < macierz.length; j++)
                this.macierz[i][j]=this.macierz[i][j]-B.macierz[i][j];
        }
        
    }

    
    public void mnozenie(Macierz B) 
     {
       Macierz A = this;
       Macierz C = new Macierz(A.macierz.length, A.macierz[0].length);
       C=A;
       int rowsInA = A.macierz.length;
       int columnsInA = A.macierz[0].length; // same as rows in B
       int columnsInB = B.macierz.length;
       for (int i = 0; i < rowsInA; i++) {
           for (int j = 0; j < columnsInB; j++) {
               for (int k = 0; k < columnsInA; k++) {
                   A.macierz[i][j] = A.macierz[i][j] + C.macierz[i][k] * B.macierz[k][j];
               }
           }
       }
   }
    
        
    @Override
        public int licz()
        {
            int k = 0;
            for (int i = 0; i < rozmiar; i++) 
            {
			for (int j = 0; j < rozmiar; j++)
                            k++;
            }
            return k;
        }
      
  
    public Macierz transponuj(Macierz M) 
    {
    Macierz transponowana = new Macierz(rozmiar,rozmiar);
    for (int i=0;i<rozmiar;i++) {
        for (int j=0;j<rozmiar;j++) {
            transponowana.macierz[j][i]=M.macierz[i][j];
        }
    }
    return transponowana;
    } 
    
    
     public double wzynacynik() {
        double wyznacznik = 0;
        
            double[][] nTab = new double[macierz.length + (macierz.length - 1)][macierz[0].length];
            for (int i = 0, _i = 0; i < nTab.length; i++, _i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    if (_i < macierz.length && j < macierz[0].length) {
                        nTab[i][j] = macierz[_i][j];
                    } else {
                        _i = 0;
                        nTab[i][j] = macierz[_i][j];
                    }
                }
            }
 
            int iloczyn = 1;
            int _i;
 
            for (int i = 0; i < macierz.length; i++) {
                _i = i;
                for (int j = 0; j < macierz[0].length; j++) {
                    iloczyn *= nTab[_i][j];
                    _i++;
                }
                wyznacznik += iloczyn;
                iloczyn = 1;
            }
 
            iloczyn = 1;
            for (int i = 0; i < macierz.length; i++) {
                _i = i;
                for (int j = macierz[0].length - 1; j >= 0; j--) {
                    iloczyn *= nTab[_i][j];
                    _i++;
                }
                wyznacznik -= iloczyn;
                iloczyn = 1;
            }
        
        return wyznacznik;
    }
    
        
        
        
        
      
        
        
}

