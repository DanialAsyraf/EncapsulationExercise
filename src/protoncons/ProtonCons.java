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
public class ProtonCons {
    String tyreBrand,windows,headlight;
    
    ProtonCons(){
        this.tyreBrand="Dunlop";
        this.windows="Power window";
        this.headlight="LED";
    }
    ProtonCons(String t,String w,String h){
        this.tyreBrand=t;
        this.windows=w;
        this.headlight=h;
    }
    public void printMethod1(){
        ProtonCons obj1=new ProtonCons();
        System.out.println("Tyre Brand: "+obj1.tyreBrand+"\n"+"Windows: "+obj1.windows+"\n"+"Headlights: "+obj1.headlight);

    }
    public void printMethod2(){
        ProtonCons obj2=new ProtonCons("Michellin","Power window","LED");
        System.out.println("Tyre Brand: "+obj2.tyreBrand+"\n"+"Windows: "+obj2.windows+"\n"+"Headlights: "+obj2.headlight);

    }
    public void printMethod3(){
        ProtonCons obj3=new ProtonCons("Bridgestone","Power window","LED");
        System.out.println("Tyre Brand: "+obj3.tyreBrand+"\n"+"Windows: "+obj3.windows+"\n"+"Headlights: "+obj3.headlight);
        
    }
    public void printMethod4(){
        ProtonCons obj4=new ProtonCons("Continental","Power window","Normal");
        System.out.println("Tyre Brand: "+obj4.tyreBrand+"\n"+"Windows: "+obj4.windows+"\n"+"Headlights: "+obj4.headlight);
    }
    //method polymorphism
    void run(){
        System.out.println("Vehicle is running!");
    }
    //method overloading //calculate the price range
    void sum(int carPrice, long service){
        System.out.println("Total price of car including tax: RM"+(carPrice+service));
    }
    void sum(int base,int executive,int premium){
        System.out.println("Total price of base, executive and premium car: RM"+(base+executive+premium));
    }
    
}
