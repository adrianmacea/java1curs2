public class E02AtributeConstructorDefinit{
    public static void main(String [] args){
        Pisica p1 = new Pisica("Tom","birmanez");
        Pisica p2 = new Pisica("Leo","siamez");
        
        System.out.println(p1.nume);
        System.out.println(p1.rasa);
        
        p1.spuneMiau();
        p2.spuneMiau();
    }
}