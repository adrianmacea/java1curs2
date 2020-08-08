
public class E05ComportamentCercTnagenta{
    public static void main(String [] args){
        Cerc c1 = new Cerc(5, new Punct(1,0));
        Cerc c2 = new Cerc(1, new Punct(2,4));
        
        double rez1 = c1.getArie();
        double rez2 = c1.getLungime();
        boolean rez3 = c1.isTangent(c2);
        
        
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
    }
}