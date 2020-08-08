/*
 * Construim obiectul Pisica
 * 
 * (atribute:)
 * greutate
 * rasa
 * nume
 * 
 * (comportamente = verbe:)
 * doarme
 * merge
 * spuneMiau
 * mananca
 * 
 * Instanta unei pisici ar arata asa:
 *  2
 *  birmanez
 *  Tom
 *  
 * 
 * 
 */

public class Pisica{
    double greutate;
    String rasa;
    String nume;
    
    Pisica(){
        this("Cat", "maidanez");
        /**
         * Aceasta este modalitatea de apel a uneia dintre supraincarcarile unui alt constructor din clasa.
         * Ca sa functioneze trebuie neapara sa fie prima instructiune in constructor.
         */
    }
    
    Pisica(String nume, String rasa){
        this.nume = nume;
        this.rasa = rasa;
        
        System.out.println("A fost creata o pisica");
    }
    
    void spuneMiau(){
        System.out.println("Miau! Numele meu este "+this.nume);
    }
}