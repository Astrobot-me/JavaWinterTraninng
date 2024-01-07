package matrix;
import matrix.Matrix;


class Cross {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] c = new int[3][3];

    public static void main(String[] args) {
        Cross c = new Cross();

        Matrix m = new Matrix();

        System.out.println("Enter first Matrix: ");
        m.matrix_input(c.a);
        System.out.println("Enter Second Matrix: ");
        m.matrix_input(c.b);
        
        for(int i=0;i<c.a.length;i++){
            for(int j=0;j<c.a.length;j++){
                c.c[i][j] = 0;
                for(int k=0;k<c.a.length;k++){
                    c.c[i][j] = c.c[i][j] + c.a[i][k]*c.b[k][j];
                }
            }
            
        }
        
        System.out.println("Matrix Multiplication: ");
        m.matrix_print(c.c);

    }

}
