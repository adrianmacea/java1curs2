public class E13ArrayDeArray{
    public static void main(String []args){
        int [][] arr = new int [5][4];
        /**
         * Un array de array-uri de tipul int se mai numeste si matrice sau tablou bidimensional.
         * In acest caz ar trebui sa parcurg mai intai array-ul principal: [5],
         * si pentru fiecare element al aestuia sa mai fac inca o parcurgere a elementelor lui.
         * Vom face asta mai jos.
         */
        
        int c = 1; // am creat un contor c care pleaca de la valoarea 1 pt a-l folosi mai jos
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = c;
                c++;
            }
        }
        
        for(int[] x:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
        /**
         * Array se mai numeste si vector. Aici avem un vector de 5 vectori de cate 4 elemente.
         * 5 este vectorul principal si 4 vectorul secundar.
         * Marticea obtinuta va avea 5 randuri si 4 coloane.
         */
        
        /**
         * Nu este obligatoriu sa avem o matrice simetrica. 
         * Mai jos avem un exemplu in care declaram un numar diferit de elemente 
         * pentru fiecare dintre cei 5 vectori principali:
         */
        
        int [][] arr2 = new int [5][]; 
        //nu am specificat lungimea initiala, am dat mai jos pentru fiecare in parte
        
        arr2[0] = new int [6];
        arr2[1] = new int [10];
        arr2[2] = new int [15];
        arr2[3] = new int [3];
        arr2[4] = new int [9];
    }
}