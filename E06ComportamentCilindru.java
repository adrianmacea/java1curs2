
public class E06ComportamentCilindru{
    public static void main(String [] args){
        Cilindru c3 = new Cilindru(1, new Cerc(2, new Punct(0,0)));
        
        double rez1 = c3.getArieCilindru();
        double rez2 = c3.getVolum();
        
        System.out.println(rez1);
        System.out.println(rez2);
    }
}
