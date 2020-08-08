public class E07MetodaStatica{
    public static void main (String [] args){
        Punct p1 = new Punct(1,0);
        Punct p2 = new Punct(0,1);
        
        double rez = Punct.getDistance(p1, p2); 
        //apelam din numele clasei nu din numele instantei
        
        System.out.println(rez);
        /**
         * Din System.out.println deja putem deduce cu notiunile pe care le avem: 
         * - System este o clasa (incepe cu litea mare)
         * - out este o zona de memorie statica in clasa System 
         * (stim asta pentru ca se dereferentiaza din numele clasei)
         * - println este un comportament dereferentiat dintr-o instanta
         * (stim ca este non-static pentru ca altfel ar fi fost dereferentiat din clasa)
         * 
         * rezulta ca out e o zona de memorie statica care contine o instanta a unui obiect
         * (mai precis o instanta de flux high level de iesire - vom vedea ce inseamna si asta...)
         * 
         * se citeste complet:
         * println este un comportament al instantei out declarata static in clasa System
         * 
         */
    }
}