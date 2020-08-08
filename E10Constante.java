public class E10Constante{
    /**
     * Vom declara o constanta ca atribut in 3 moduri diferite:
     * 
     * v1. Declaram constanta ca atribut cu initializare in constructor.
     * 
     * v2. Desi am scis atribuirea odata cu declararea, initializarea se face tot in constructor.
     * Dar valoarea este fixa si valabila pentru toate instantele, ceea ce va ocupa cate o zona de memorie 
     * pentru fiecare instanta chiar daca are aceeasi valoare. Deci nu se foloseste in practica.
     * 
     * v3. Este de fapt v2 scris corect prin adaugarea modificatorului static.
     * 
     */
    final int X; // declarare constanta ca atribut cu initializare mai jos in constructor
    final int Y = 10; // nu se foloseste in practica
    static final int Z = 20; // corect daca dorim o constanta statica
    
    E10Constante(){
        X = 5;
    }
    
    // mai jos vin cu valoarea din afara constructorului trimitand-o ca parametru
    E10Constante(int x){
        this.X = x;
    }
    
    // mai jos avem o constanta intr-o metoda - se numeste constanta locala
    void metoda(){
        final int Q = 30;
    }
    
    // mai jos avem o constanta folosita pentru parametri (tot constanta locala)
    void metoda(final int W){
    }
}