/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoncons;

/**
 *
 * @author user
 */
public class ProtonX70 extends ProtonX50{
    
    private String rim;
    private int rimSize;
    
    public static void autoDrive(){
        System.out.println("Auto Drive");
    }
    public static void autoPark(){
        System.out.println("Auto Park");
    }
    void run(){
        System.out.println("Proton X70 is running safely!");
    }
    //setter and getter or encapsulation
    public void setRim(String myrim){
        this.rim=myrim;
    }
    public String getRim(){
        return rim;
    }
    public void setRimsize(int newRimsize){
        rimSize=newRimsize;
    }
    public int getRimsize(){
        return rimSize;
    }
}
