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
public class ProtonSaga extends ProtonCons{
    
    String fuel;
    private int year;
    private String radio; //private data member
    
    ProtonSaga(){
        this.fuel="Fuel efficient";
    }
    public void printSaga(){
        ProtonSaga obj1=new ProtonSaga();
        System.out.println("Fuel: "+obj1.fuel);
    }
    void run(){
        super.run();
    }
    //setter and getter method or Encapsulation
    public void setYear(int newYear){
        year=newYear;
    }
    public int getYear(){
        return year;
    }
    public void setRadio(String myradio){
        this.radio=myradio;
    }
    public String getRadio(){
        return radio;
    }
    
}
