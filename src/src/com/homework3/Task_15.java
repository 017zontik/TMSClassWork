package src.com.homework3;

public class Task_15 {
    public static void main(String[] args) {
        int arr[]= new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println("Значение " + i + "й ячейки массива: " + arr[i]);
        }

        for (int i = 0; i <arr.length- i - 1 ; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length -i-1];
            arr[arr.length -i-1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }



            
        }

    }



