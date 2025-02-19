public class Mian2 {
        // Binary Search method (Iterative)
        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                // Check if target is at mid
                if (arr[mid] == target)
                    return mid;
    
                // If target is greater, ignore left half
                if (arr[mid] < target)
                    left = mid + 1;
                // If target is smaller, ignore right half
                else
                    right = mid - 1;
            }
    
            return -1; // Target not found
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
            int target = 56;
    
            int result = binarySearch(arr, target);
            if (result != -1)
                System.out.println("Element found at index: " + result);
            else
                System.out.println("Element not found");
        }
    }
    
    

