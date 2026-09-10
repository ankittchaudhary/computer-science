public class Challanges {
    public static void main(String[] args) {
        //1. Finding sum of all elements
        int nums[] = {3, 7, 7, 8, 12, 6, 15, 5, 24, 35, 34, 10};
        //System.out.println(sum(nums));

        //2. Searching an element
        // int target = 9;
        // int foundAt = linearSearch(nums, target);
        // System.out.println("Target " + (foundAt > 0 ? "Found at index " + foundAt : "Not found"));

        //3. find Maximum
        //System.out.println(findMaximum(nums));

        //4. find second largest element
        //System.out.println(findSecondMaximum(nums));
    }

    static int sum(int arr[]){
        int sum =0;
        for (int x : arr) {
            sum=sum+x;
        }
        return sum;
    }
    
    static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }

    static int findMaximum(int arr[]){
        int max = arr[0];
        for (int x : arr) {
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    
    static int findSecondMaximum(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int x : arr) {
            if(x>max1){
                max2=max1;
                max1=x;
            }
            else if(x>max2 && x!=max1){
                max2=x;
            }
        }
        return max2;
    }
}
