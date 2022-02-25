package Assignment.assignment2;

public class equalMatrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3}, {4,5,6}};
        int b[][]={{1,2,3}, {4,5,6}};

        if (checkMatrix(a, b))
            System.out.println("Equal Matrices");
        else
            System.out.println("Unequal Matrices");

    }

    public static boolean checkMatrix(int[][] a, int[][] b) {
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                if (a[i][j]!=b[i][j])
                    return false;
            }
        }

        return true;
    }
}
