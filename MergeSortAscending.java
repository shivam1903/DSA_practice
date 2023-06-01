import java.util.Arrays;
import java.util.Scanner;

public class MergeSortAscending {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array
        if (first>=last){
            return numbers;
        }
        int mid = first + (last-first)/2;
        mergeSort(numbers, first, mid);
        mergeSort(numbers, mid+1, last);
        return(MergeFunc(numbers, first, mid, last));
        //Complete this function

    }
    
    public static int[] MergeFunc(int[] numbers, int first, int mid, int last){
        int leftL = mid - first + 1;
        int rightL = last - mid;
        
        int[] leftArr = new int[leftL];
        int[] rightArr = new int[rightL];
        
        for(int i =0; i<leftL; i++){
            leftArr[i] = numbers[first+i];
        }
        for(int i = 0; i<rightL; i++){
            rightArr[i] = numbers[mid+i+1];
        }
        
        int pointerL = 0;
        int pointerR = 0;
        int newpoint = 0;
        
        while((pointerR<rightL) && (pointerL<leftL)){
            if(leftArr[pointerL] <= rightArr[pointerR]){
                numbers[first+newpoint] = leftArr[pointerL];
                newpoint++;
                pointerL++;
            }
            else{
                numbers[first+newpoint] = rightArr[pointerR];
                newpoint++;
                pointerR++;
            }
        }
        
        while(pointerR<rightL){
            numbers[first+newpoint] = rightArr[pointerR];
            newpoint++;
            pointerR++;
        }
        
        while(pointerL<leftL){
            numbers[first+newpoint] = leftArr[pointerL];
            newpoint++;
            pointerL++;
        }
        
        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
           randomNumbers[i] = scanner.nextInt();
       }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        int[] newSortedNumbers = new int[size];
        for(int i =0; i<size; i++){
            newSortedNumbers[i] = sortedNumbers[size-1-i];
        }
        System.out.println(Arrays.toString(newSortedNumbers));
    }
}

