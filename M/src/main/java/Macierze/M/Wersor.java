package Macierze.M;

public class Wersor extends Vector3D implements Dzialaj <Vector3D>, Wypisywalny {

    
    Wersor(int x, int y, int z)
    {   
        super(x,y,z);
    }
    
    @Override
    public void wypisz()
    {
        Vector3D czyWersor = this;
        if(czyWersor.punkt[0]==0 && czyWersor.punkt[1]==0 && czyWersor.punkt[2]!=0)
            System.out.println("to jest wersor osi z o długości " + czyWersor.dlugosc()); 
        else if(czyWersor.punkt[0]==0 && czyWersor.punkt[1]!=0 && czyWersor.punkt[2]==0)
            System.out.println("to jest wersor osi y o długości " + czyWersor.dlugosc());
        else if(czyWersor.punkt[0]!=0 && czyWersor.punkt[1]==0 && czyWersor.punkt[2]==0)
            System.out.println("to jest wersor osi x o długości " + czyWersor.dlugosc());
        else
        {
            super.wypisz();
        }
    }
}
