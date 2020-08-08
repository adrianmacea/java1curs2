/**
 * O biblioteca are mai multe carti.
 * O carte are titlu si autor.
 * 
 * Functionalitatile bibliotecii:
 * - ii putem adauga carti
 * - ii putem afisa cartile
 */

public class E14CartiLaBiblioteca{
    public static void main(String [] args){
        Biblioteca b = new Biblioteca ();
        
        b.adaugaCarte(new Carte("Titlu1", "Autor1"));
        b.adaugaCarte(new Carte("Titlu2", "Autor1"));
        b.adaugaCarte(new Carte("Titlu3", "Autor2"));
        
        b.afisareCarti();
        
        int nr = b.getNumarCartiDinBiblioteca();
        System.out.println("Numarul de carti este: "+nr);
    }
}