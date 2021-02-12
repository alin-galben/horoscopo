/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alin1
 */
public class Utilidades {
    public static ArrayList<String> getMeses() {
        ArrayList<String> meses = new ArrayList<String>();
        for(int i=1; i<=12; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    
    public static ArrayList<String> getDias(){
        ArrayList<String> dias = new ArrayList<String>();
        for(int i=1;i<=31;i++){
            dias.add(String.valueOf(i));
        }
        return dias;
    }
    
    public static String getSigno(int mes) {
       String signo="";   
       switch(mes){
           case 1: signo="Signo 1";
           case 2: signo="Signo 2";
           case 3: signo="Signo 3";
           case 4: signo="Signo 4";
           case 5: signo="Signo 5";
           case 6: signo="Signo 6";
           case 7: signo="Signo 7";
           case 8: signo="Signo 8";
           case 9: signo="Signo 9";
           case 10: signo="Signo 10";
           case 11: signo="Signo 11";
           case 12: signo="Signo 12";
       }     
       return signo;
    }
    
    
}
