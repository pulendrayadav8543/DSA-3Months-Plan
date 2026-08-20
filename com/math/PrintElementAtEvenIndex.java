public class PrintElementAtEvenIndex {
    public static void elementAtEvenIndex(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={12,13,14,16,14,19};
        elementAtEvenIndex(arr);
    }
}
