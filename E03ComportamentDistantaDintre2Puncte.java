public class E03ComportamentDistantaDintre2Puncte{
    public static void main(String [] args){
        Punct p1 = new Punct(1,0);
        Punct p2 = new Punct(0,1);
        
        double rez1 = p1.getDistance(p2);
        
        double rez2 = p2.getDistance(p1);
        double rez3 = p1.getDistance(p1);
        
        double rez4 = new Punct(0,1).getDistance(p1);
        double rez5 = new Punct(0,1).getDistance(new Punct(1,0)); 
        // in ultimele doua cazuri, nu mai pot sa refolosesc punctele care nu au referinta, dar am putut calcula distanta
        
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
        System.out.println(rez4);
        System.out.println(rez5);
        
        /**
         * Din punctul p1 apelam comportamentul getDistance si trimitem ca parametru punctul p2: p1.getDistance(p2)
         * Un comportament intotdeauna se dereferentiem dintr-o instanta, pt ca trebuie sa avem pe acel cineva care se comporta.
         * Deci p1 este cel care in interiorul metodei apelate va deveni "this", iar p2 este cel care va fi valoarea parametrului p.
         * 
         * Distanta se va calcula in interiorul metodei apelate, si va fi ulterior intoarsa la apel.
         * Asta inseamna ca o pot prelua cu operatorul de atribuire "=" 
         * si o pot pune intr-o zona de memorie: double rez1 = p1.getDistance(p2)
         * 
         */
    }
}