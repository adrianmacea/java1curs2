public class E12ArrayObiecte{
    public static void main(String [] args){
        Punct [] arr = new Punct [10]; //am declarat un array de tip referinta (obiecte)
        arr[0] = new Punct(0,0); //am instantiat un Punct in zona de memorie identificata prin indexul 0
        arr[0].x = 10; //am dereferentiat un atribut al acestei instante a obiectului Punct
        
        /**
         * Cand declaram un array de tip referinta, nu sunt create si instantele la interior.
         * Acestea au valoarea null pana la instantiere. 
         * Array-ul este doar o colectie de zone de memorie de acelasi tip si atat. Nu creaza si instantele.
         */        
    }
}
