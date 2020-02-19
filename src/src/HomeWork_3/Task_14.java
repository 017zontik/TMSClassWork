package HomeWork_3;

public class Task_14 {
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 8, 6, 2, 4, 1, 3};
        int max = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            int cell = arr[i];
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("Max значение = " + max + " в индексе " +  indexMax);
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                indexMin = j;
            }
        }
        System.out.println("Min значение = " + min + " в индексе " +  indexMin);

    }
}
