import java.util.Scanner;

public class DifferenceLargestAndSmallest {
    public static int differenceLargestAndSmallest(int[] arr) {
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }else if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest-smallest;
    }
    public static void main(String[] args) {
        int[] arr={12,13,56,32};
        System.out.println(differenceLargestAndSmallest(arr));

    }
}
