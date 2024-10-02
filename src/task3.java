public class task3 {
    public static void main(String[] args){

        final int rows = 3;// кол строк
        final int cols = 3;// кол колон
        int[][] matrix = new int[rows][cols];
        int[] b = new int [cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols;j++)
            {
                matrix[i][j] = (int) (Math.random() * (198)) - 99;
                if (matrix[i][j]>=0)
                    b[i]++;
            }
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
        for (int i = 0; i < rows; i++)
        {
            System.out.println(b[i]);

        }
    }
}
