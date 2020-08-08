/**
 * Suma a doua numere complexe
 * 3+5i
 * 4+3i
 * 
 * 7+8i
 */
public class Complex{
    double a, b; // a si be reprezinta partea reala si partea imaginara a instantei mele de numar complex
    
    Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    Complex getSum (Complex c){
        /**
         * tipul valorii intoarse de care metoda este "Complex", adica un obiect cu doua atribute, 
         * in felul acesta putem intoarce doua valori sub forma celor doua atribute ale instantei
         */
        
        Complex rez = new Complex(0,0);
        rez.a = this.a+c.a;
        rez.b = this.b+c.b;
        
        return rez;
    }
}