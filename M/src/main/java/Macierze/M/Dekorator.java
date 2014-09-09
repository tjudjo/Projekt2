package Macierze.M;

public class Dekorator implements Wypisywalny {
    protected Wypisywalny deco;
    
    protected Dekorator(Wypisywalny deco){
        this.deco = deco;
    } 

    public void wypisz(){
    	System.out.println("Wartość poszczególnych składników jest równa: ");
    	deco.wypisz();
    }
 }
