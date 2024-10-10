import java.util.*;

public class task3 {
    public static void main(String[] args){

        final int rows = 3;// кол строк
        final int cols = 3;// кол колон
        int[][] matrix = new int[rows][cols];
        Vector b = new Vector() ;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols;j++)
            {
                matrix[i][j] = (int) (Math.random() * (198)) - 99;
            }
        }

        for (int i = 0; i < rows; i++)
        {
            int k = 0;
            for (int j = 0; j < cols;j++)
            {
                if (matrix[i][j]>=0)
                    k++;

            }
            b.addElement(k);

        }
        System.out.println("Матрица");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols;j++)
            {
            System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вектор b");
        Enumeration BN = b.elements();
        while(BN.hasMoreElements())
        {
            System.out.println(BN.nextElement());

        }
    }
}
