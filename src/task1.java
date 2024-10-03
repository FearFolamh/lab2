import java.util.Arrays;

public class task1
{
    public static void main(String[] args) {

        final int n = 1000; // размер массива
        final int znach = 72; // Заданное число
        int[] mas = new int[n];
        System.out.println("Нач массив");
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * (198)) - 99;

        }
        System.out.println("Оригинальный массив: " + Arrays.toString(mas));
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

            }
        }
        int[] c = new int[k];
        int counter_a = 0;
        int counter_c = 0;
        while(counter_c < k) {
            if (mas1[counter_a] > 0) {
                c[counter_c] = mas1[counter_a];
                counter_c++;
            }
            counter_a++;
        }
            if (k == 0)
                System.out.println("Эл удол условию нет");
            else System.out.println(Arrays.toString(c));


    }

    public static void CreateReciprocalFraction(int[] mas,final int n)
    {
        double[] mas1 = new double[n];
        try {for (int i = 0; i < n; i++) {
            if (mas[i] == 0)
            {
                throw new ArithmeticException();//("Error деление на 0");
            }
        }
            for (int i = 0; i < n; i++) {

                mas1[i] = 1 / (double) mas[i];

            }
            System.out.println(Arrays.toString(mas1));
       }
           catch(Exception e) {
               System.out.println("Error (деление на 0)");
           }


    }
}