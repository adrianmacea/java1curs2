/**
 * getArieCilindru() 2*A.bazei+L.bazei*h
 * getVolum() A*h
 */


public class Cilindru{
    double inaltime;
    Cerc baza;
    
    Cilindru(double inaltime, Cerc baza){
        this.inaltime = inaltime;
        this.baza = baza;
    }
    
    double getArieCilindru(){
        return 2*this.baza.getArie()+
                this.baza.getLungime()*this.inaltime;
    }
    
    double getVolum(){
        return this.baza.getArie()*this.inaltime;
    }
}