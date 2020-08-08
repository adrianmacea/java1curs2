public class E04ComportamentSumaNumereComplexe{
    public static void main(String [] args){
        Complex c1 = new Complex(4,5); // am creat o instanta
        Complex c2 = new Complex(4,3); // apoi a doua instanta
        
        Complex rez = c1.getSum(c2); // am apelat comportamentul getSum din instanta c1 si am trimis ca parametru c2
        
        System.out.println(rez.a+" "+rez.b); // am afistat cele doua atribute ale obiectului returnat
    }
}