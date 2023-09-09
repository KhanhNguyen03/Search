
package common;

public class Algorithm {
    
    public int linearSearch(int[] array, int x) {
        
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
  
    
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1; 
       
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { 

              
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
                
            } else {
                right = mid - 1;
               
            }
        }

        return -1;
    }
    
    public int partition(int[] array, int left, int right) {

        int i = left, j = right;
        int pivot = array[(left + right) / 2];
        int tmp;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
public void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

   

  

}
