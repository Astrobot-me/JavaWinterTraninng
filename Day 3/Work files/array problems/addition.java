package matrix;

import java.util.Scanner;

class Matrix{

    Scanner sc = new Scanner(System.in);

    void matrix_print(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }

    void matrix_input(int[][] a){
        for(int i=0;i<a.length;i++){
            System.out.println("Enter " +(i+1)+" Row:");
            for(int j=0;j<a.length;j++){
                
                a[i][j] = sc.nextInt();
            }
            // System.out.print("\n");
        }
    }
}



class Addition {

    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] c = new int[3][3];

    

    public static void main(String[] args) {
        Addition obj = new Addition();
        // Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();

        System.out.println("Enter first Matrix: ");
        m.matrix_input(obj.a);
        System.out.println("Enter Second Matrix: ");
        m.matrix_input(obj.b);
        
        for(int i=0;i<obj.a.length;i++){
            for(int j=0;j<obj.a.length;j++){
                obj.c[i][j] = obj.b[i][j] + obj.a[i][j];
            }
            
        }
        
        System.out.println("Addition of both Matrix: ");
        m.matrix_print(obj.c);

    }
}
