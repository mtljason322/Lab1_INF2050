/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonjournom;
import aleatoire.*;




/**
 *
 * @author mtlja
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person jordan = new Person (args[0],args[1], 23);
        
        System.out.println("Prenom : " + jordan.getFirstName() );
        System.out.println("Nom : "+ jordan.getLastName() );
        System.out.println("Age : " + jordan.getAge());
        
        
       System.out.println("Hello World");


        
      //System.out.println("Bonjour Jordan Mone");
        
             
    }
    
}
