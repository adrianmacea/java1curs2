public class Biblioteca{
    Carte [] carti = new Carte[1000];
    int n; //numarul curent de carti
    
    void adaugaCarte(Carte c){
        if(n<1000){
            carti [n] = c;
            n++;
        }
        else{
            System.out.println("Nu mai este spatiu in biblioteca");
        }
    }
    
    void afisareCarti(){
        for (int i=0;i<n;i++){
            System.out.println(carti[i].titlu+" "+carti[i].autor);
        }
    }
    
    int getNumarCartiDinBiblioteca(){
        return n;
    }
}