public class task4
{
    public static void main(String[] args)
    {
        final int n = 5;// размер
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n;j++)
            {
                matrix[i][j] = (int) (Math.random() * (198)) - 99;

            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n;j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int min = 100;
        for(int i =n-1;i>=0;)
        {
            for(int j =0;j<n;j++)
            {
            if(matrix[i][j]<min)
                min=matrix[i][j];
            i--;
            }
        }
        System.out.println(min);
    }
}
