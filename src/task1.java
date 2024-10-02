

public class task1
{
    public static void main(String[] args) {

        final int n = 10 ; // размер массива
        final int znach = 72; // Заданное число
        int[] mas = new int[n];
        System.out.println("Нач массив");
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * (198)) - 99;
            System.out.println(mas[i]);
        }
        System.out.println("Обратный массив");
        CreateReciprocalFraction(mas,n);
        System.out.println("Массив с номерами эл = " + znach);
        int k = 0;
        int[] mas1 = new int[n];
        for(int i = 0; i<n;i++)
        {
            if(mas[i] == znach)
            {
                k++;
                mas1[i] = i+1;
                System.out.println(mas1[i]);
            }
        }
        if (k == 0)
            System.out.println("Эл удол условию нет");

    }

    public static void CreateReciprocalFraction(int[] mas,final int n)
    {
        double[] mas1 = new double[n];
        try {
            for (int i = 0; i < n; i++) {
                if (mas[i] == 0)
                {
                    throw new ArithmeticException("Error деление на 0");
                }
                mas1[i] = 1 / (double) mas[i];
                System.out.println(mas1[i]);
            }
       }
           catch(Exception e) {
               System.out.println("Error деление на 0");
           }
        //for (int i = 0; i < n; i++)
          //
    }
}