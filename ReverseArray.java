import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] firstArray = new int[5];
        int len = firstArray.length;

        for (int i = 0; i < len; i++){

            System.out.println("Enter " + i + ". index: ");

            firstArray[i] = Integer.parseInt(s.nextLine());
        }

        System.out.println("-".repeat(30));
        System.out.println("Reverse of array is:");
        int[] secondArray = reverse(firstArray);
        System.out.println(Arrays.toString(firstArray));

    }

    public static int[] reverse(int[] array){

        int temp = 0;
        int len = array.length;
        for(int i = 0; i < len / 2; i++){
            temp = array[i];
            array[i] = array[len - 1 -i];
            array[len - 1 - i] = temp;
        }
        return array;
    }
}
