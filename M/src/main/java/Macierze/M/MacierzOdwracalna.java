package Macierze.M;

public class MacierzOdwracalna extends Macierz implements Dzialaj <Macierz>, Wypisywalny {
    
    MacierzOdwracalna(int x, int y)
    {
        super(x,y);
    }
       
 @Override
    public void wypisz()
    {
        MacierzOdwracalna A=this;
        for(int i = 0; i < A.macierz.length; i++) 
        {
            for(int j = 0; j < A.macierz[i].length; j++)   
            {
                System.out.printf("%-4.2g", A.macierz[i][j]);
            }
            System.out.println("");
        }
     }
   
}

