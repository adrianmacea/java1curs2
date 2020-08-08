public class E08OverloadingMetode{
    void acelasiNume(){
    }
    
    void acelasiNume(int x){
    }
    
    void acelasiNume(int x, int y){
    }
    
    void acelasiNume(double x, int y){
    }
    
    void acelasiNume(int x, double y){
    }
        
    void acelasiNume (Punct p1, Pisica p2){
    }
    
    void acelasiNume (Punct p1, Punct p2){
    }
    
    /**
     * De exemplu: acelasiNume(10,10) ce metoda va apela? 
     * Va apela metoda a 3-a din lista pentru ca se va alege intotdeauna 
     * acea metoda pentru care se fac cele mai putine conversii.
     * 
     * Dar daca metoda 3 nu ar fi existat? 
     * Aunci ar fi convertit una dintre valori la double 
     * si ar fi ales una dintre metodele de mai jos.
     * 
     * Pe care? 
     * Pe a 5-a, pentru ca ia in ordinea parametrilor si primul se potriveste cu int, 
     * iar pe al doilea il converteste la double.
     * 
     * 
     * Alt exemplu: acelasiNume(null, null) ce metoda va apela?
     * Rezultatul este o eroare de ambiguitate venita ca eroare de sintaxa. 
     * Ultimele doua variante sunt ambele potrivite, dar programul nu stie pe care sa o aleaga.
     * In astfel de cazuri trebuie sa specificam explicit care este metoda pe care dorim sa o apelam:
     * acelasiNume(null, (Pisica) null) ,sau
     * acelasiNume(null, (Punct) null)
     * 
     * 
     */ 
}