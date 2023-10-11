import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите целое число х размер массива");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double[] arr = new double[x];
        System.out.println(x);

        System.out.println("Вводим массив вещественных чисел " +x+" раз(a)");
        for (int i=0; i< arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        double sum = 0;
        for (int i=0; i< arr.length; i++ ){
            sum = sum + arr[i];
        }
        System.out.println("Сумма элементов массива =" +sum);
        System.out.println("Среднее арифметическое массива =" +sum/x);

        bubbleSort(arr);
        //sortBeMax(arr);
        System.out.println(Arrays.toString(arr));

        double mediana;
        if (arr.length % 2 == 0)
            mediana = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
        else
            mediana = arr[arr.length/2];

        System.out.println("Медиана = " +mediana);
    }
    public static void bubbleSort(double[] arr) {
        for (int i=0; i< arr.length-1; i++ )        {
            for (int k=0; k< arr.length-1-i; k++)            {
                if( arr[k] > arr[k+1])
                {
                    double tmp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = tmp;
                }
            }
        }
    }
    public static void sortBeMax(double[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            if (max != i) {
                double temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
    }
}
