public class task2
{
    public static void main(String[] args)
    {
        final int n = 10 ; // размер массива
        int[] b = new int[n];
        int[] a = new int[n];
        int k =0;
        System.out.println("Массив b");
        for (int i = 0; i < n; i++)
        {
            b[i] = (int) (Math.random() * (198)) - 99;
            System.out.println(b[i]);
            if (b[i] > 0) {
                a[i] = b[i] * 5;
                k++;
            }
        }
        int[] c = new int[k];
        int counter_a = 0;
        int counter_c = 0;

        while(counter_c < k)
        {
            if(a[counter_a] > 0) {
                c[counter_c] = a[counter_a];
                counter_c++;
            }
            counter_a++;
        }
        System.out.println("Массив c");
        for(int i =0; i<k;i++)
            System.out.println(c[i]);
        for (int i = 0; i < c.length; i++) {
            int pos = i;
            int min = c[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = c[j];
                }
            }
            c[pos] = c[i];
            //меняем местами наименьший с sortArr[i]
            c[i] = min;
        }
        System.out.println("сорт Массив c");
        for(int i =0; i<k;i++)
            System.out.println(c[i]);
    }
}
