/**
 * getArie()
 * getLungime()
 * isTangent() true, false
 */

public class Cerc{
    double raza;
    Punct centru; //interactiune intre instante de tip hasA
    
    Cerc(double raza, Punct centru){
        this.raza = raza;
        this.centru = centru;
    }
    
    double getArie(){
        return 3.14*(this.raza)*(this.raza);
    }
    
    double getLungime(){
        return 2*3.14*(this.raza);
    }
    
    boolean isTangent(Cerc c){
        if (this.raza + c.raza == this.centru.getDistance(c.centru)){
            return true;
        }
        return false;
        /**
         * folosim metoda pe care am creat-o in calasa Punct
         * un obiect se poate folosi de un alt obiect pentru a delega actiuni
         * Cercul a delegat Punctului calculul distantei
         */
    }
}