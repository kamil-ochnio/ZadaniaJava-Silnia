package javahive.silnia.impl;


import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    //metoda licząca silnie w sposób rekurencyjny
    public BigDecimal liczBigDecimal(long podstawa){
    	if(podstawa<0) throw new ArithmeticException();
        if(podstawa>0) {
            return liczBigDecimal(podstawa-1).multiply(BigDecimal.valueOf(podstawa));
        } else {
            return BigDecimal.ONE;
        }
    }
    
    public String licz(int arg) {
        //wynik działania rekrurencyjnej metody rzutowany jest na String,
        //Bo string przechowa bez problemu duże liczby
        return ""+liczBigDecimal(arg);
    }
}
