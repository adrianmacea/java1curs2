public class E01AtributeConstructorImplicit{
    public static void main(String [] args){
        Pisica p1; // aici am declarat o zona de memorie de tip referinta care se numeste p1 si care se numeste pisica
        p1 = new Pisica();
        
        Pisica p2 = new Pisica();
        
        p1.nume = "Tom";
        p2.nume = "Leo";
        
        System.out.println(p1.nume);
        System.out.println(p2.nume);
    }
}