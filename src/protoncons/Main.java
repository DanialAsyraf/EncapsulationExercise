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
public class Main {
    public static void main(String[] args) {

        ProtonPersona p1 = new ProtonPersona();  
        System.out.println("Proton Persona features: ");
        p1.printMethod1();
        p1.voiceControl();
        p1.autoPark();
        p1.run();
        p1.setRadio("Panasonic");
        System.out.println("Radio brand: "+p1.getRadio());
        p1.setSeat("Bride");
        System.out.println("Car seat brand: "+p1.getSeat());
        
        System.out.println();
        
        ProtonX70 p2 = new ProtonX70();
        System.out.println("Proton X70 features: ");
        p2.printMethod1();
        p2.autoDrive();
        p2.autoPark();
        p2.printSpeed();
        p2.run();
        p2.setRadio("Pioneer");
        System.out.println("Radio brand: "+p2.getRadio());
        p2.setRim("Vossen");
        System.out.println("Rim brand: "+p2.getRim());
        p2.setRimsize(18);
        System.out.println("Rim size: "+p2.getRimsize());
        
        System.out.println();
        
        ProtonX50 p3 = new ProtonX50();
        System.out.println("Proton X50 features: ");
        p3.printMethod3();
        p3.printsafePark();
        p3.printSunroof();
        p3.printSpeed();
        p3.printSaga();
        p3.run(); //call method polymorphism
        p3.sum(79000, 90000, 115000); //call method overload
        p3.setRadio("Clarion");
        System.out.println("Radio brand: "+p3.getRadio());
        p3.setSteering("Sparco");
        System.out.println("Car steering wheel brand: "+p3.getSteering());
        
        System.out.println();
        
        ProtonSaga p4 = new ProtonSaga();
        System.out.println("Proton Saga features: ");
        p4.printMethod4();
        p4.printSaga();
        p4.run();
        p4.sum(30000, 1000); //call method overload
        p4.setYear(2019);
        System.out.println("Year of car brand: "+p4.getYear());
        p4.setRadio("Kenwood"); //setting value in the name member
        System.out.println("Radio brand: "+p4.getRadio()); //getting the value of the name member
                
    }
}
