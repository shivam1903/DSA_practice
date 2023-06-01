import java.util.Scanner;
  class Bubble_Sort {
   static int totalBubbleSortSwaps(int[] array, int M) {
       int size = array.length;
       int var = 0;
       int totalSwaps = 0;
       if(M == 0){
           return 0;
       }
       for(int i = 0; i<M; i++){
        //   int locSwaps = 0;
           for(int j = 1; j<size-i; j++){
               if(array[j-1] < array[j]){
                   totalSwaps++;
                   int temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
               }
           }
        //   if(locSwaps == 0){
        //       break;
        //   }
       }
       
       return totalSwaps;
       
       //Write your code here
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int M = sc.nextInt();
       int arr_size = sc.nextInt();
       int inpArray[] = new int[arr_size];
       for(int i =0; i<arr_size; i++){
           inpArray[i] = sc.nextInt();
       }
       
       System.out.println(totalBubbleSortSwaps(inpArray, M));
   }
}
