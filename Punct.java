/**
 * Punct in plan
 * distanta
 * 
 */

public class Punct{
    double x,y; // am declarat doua atribute, coordonatele punctului
    
    Punct (double x, double y){ // am creat constructorul clasei care atribuie valori pentru x si pentru y
        this.x = x;
        this.y = y;
    }
    
    double getDistance (Punct p){ 
        double d = Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
        
        return d;
        /** 
         * Aici am definit comportamentul
         * 
         * Mai intai scriem un nume si parantezele pentru parametrii. 
         * Acestea stim ca sunt obligatorii pentru orice metoda: getDistance(){}
         * 
         * Apoi ne gandim:
         * - ce tip de valoare intoarce metoda: un numar real deci folosim: double getDistance(){}
         * - si ce parametrii primeste aceasta:
         * Avem deja un punct si un comportament. Adica avem acel punct care se comporta. 
         * Mai avem nevoie de un punct pentru a calcula distanta.
         * Acest al doilea punct il definim ca parametru: double getDistance(Punct p){}
         * 
         * Apoi calculam distanta pe care o vom stoca initial in zona de memorie "d" de tipul "double": double d = ...
         * (this.x-p.x) se citeste x-ul primului punct minus x-ul celui de-al doilea punct
         * 
         * Valoarea atribuita in zona de memorie "d" in urma calculului poate sa fie intoarsa la apel: return d
         * 
         */
    }
    
    static double getDistance(Punct p1, Punct p2){
        double d = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
        
        return d;   
    }
}