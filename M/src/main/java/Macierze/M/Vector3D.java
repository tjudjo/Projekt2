package Macierze.M;

import java.util.Iterator;
import java.util.Random;


public class Vector3D implements Iterable, Dzialaj <Vector3D>, Wypisywalny{
    int [] punkt = new int[3];
    
   Vector3D()
   {
       Random rnd = new Random();
       for(int i=0; i<3; i++)
           punkt[i]=rnd.nextInt(10);
   }
   
   public Vector3D(int a, int b, int c)
   {
           punkt[0]=a;
           punkt[1]=b;
           punkt[2]=c;
   }
   
   public void wypisz()
   {
       Vector3D A = this;
       for(int i=0; i<3; i++)
           System.out.print(A.punkt[i] + " ");
        System.out.println();
   }
   
 
   public void dodawanie(Vector3D B)
   {
       Vector3D A = this;
       Vector3D C = A;
       for(int i=0; i<3; i++)
           A.punkt[i] = C.punkt[i]+B.punkt[i];
   }    
   
 
   public void odejmowanie(Vector3D B)
   {
       Vector3D A = this;
       Vector3D C = A;
       for(int i=0; i<3; i++)
           A.punkt[i] = C.punkt[i]-B.punkt[i];
   }
   

   public void mnozenie (Vector3D B)
   {
       Vector3D A = this;
       Vector3D C = A;
       A.punkt[0] = C.punkt[1]*B.punkt[2]-C.punkt[2]*B.punkt[1];
       A.punkt[1] = C.punkt[2]*B.punkt[0]-C.punkt[0]*B.punkt[2];
       A.punkt[2] = C.punkt[0]*B.punkt[1]-C.punkt[1]*B.punkt[0];
   }
//   
//   @Override
//   public int licz()
//   {   
//       return 3;
//       
//   }
       
   public double dlugosc()
   {
       double dlugosc = 0;
       for(int i=0; i<3; i++)
           dlugosc += punkt[i]*punkt[i];
       dlugosc = Math.sqrt(dlugosc);
       return dlugosc;
   }
   

private class Vector3DIt implements Iterator{

    private int pozycja;
    

    public boolean hasNext() {
        if(pozycja<punkt.length)
            {
                return true;
            }
        else{
             return false;
        }
               
    }


    public Object next() {
        if(this.hasNext())
                return punkt[pozycja++];
            else
                return null;
   
    }
}

    public Iterator iterator() {
        Vector3DIt cos = new Vector3DIt();
        return cos;
    }
   
}


