class Matrix {
    int a[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int b[][] = {
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };

    int c[][] = new int[3][3];

    void sum() {
        System.out.println("Sum of matrices:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        System.out.println("Multiplication of matrices:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = 0;
                for(int k=0;k<3;k++)
                    c[i][j] += a[i][k] * b[k][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    void rowSum() {
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++)
                sum += a[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }
    }

    void columnSum() {
        for(int j=0;j<3;j++){
            int sum=0;
            for(int i=0;i<3;i++)
                sum += a[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }
    }

    void diagonalSum() {
        int sum=0;
        for(int i=0;i<3;i++)
            sum += a[i][i];
        System.out.println("Diagonal sum = " + sum);
    }
}

public class Main {
    public static void main(String args[]) {

        Matrix obj = new Matrix();   // object creation

        obj.sum();
        obj.multiply();
        obj.transpose();
        obj.rowSum();
        obj.columnSum();
        obj.diagonalSum();
    }
}