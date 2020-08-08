public class E11Arrays{
    public static void main(String [] args){
        int [] arr = new int [10]; // 10 = lungimea array-ului
        /**
         * Am creat o zona de memorie de tipul array-ului: int [] arr
         * in care am pus instanta nou creata a acestuia: new int [10]
         * 
         * [] - indica ca avem o zona de memorie pentru o referinta de tip array 
         * (pe partea stanga nu are valoare niciodata)
         */
        
        for(int i=0; i<arr.length; i++){
                arr[i] = i+1;
        }    
        /**
         * Folosim for pentru a parcurge un array prin indecsi.
         * ... in acest exemplu le atribuim acestora valori incrementale incepand cu val.1
         */
        
        for (int x:arr){
            System.out.println(x);
        }
        /**
         * Folosim for-each pentru a parcurge unui array valoare cu valoare.
         * Se declara in partea stanga o zona de memorie: int x ,
         * iar in partea dreapta este colectia (array-ul) care este parcursa: arr .
         * In zona de memorie din stanga se va pune rand pe rand fiecare valoare a colectiei din dreapta,
         * si executa cu ea un set de instructiuni. (in exemplu acesta le afiseaza in consola)
         */
        
    }
}