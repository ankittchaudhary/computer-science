public class Challanges {
    public static void main(String[] args) {
        //1. Finding sum of all elements
        int nums[] = {5, 9, 6, 7, 10, 12};
        //System.out.println(sum(nums));

        //2. Searching an element
        // int target = 9;
        // int foundAt = linearSearch(nums, target);
        // System.out.println("Target " + (foundAt > 0 ? "Found at index " + foundAt : "Not found"));

        //3. find Maximum
        //System.out.println(findMaximum(nums));

        //4. find second largest element
        //System.out.println(findSecondMaximum(nums));

        //5. Rotating an array
        // left rotation -> shift all elements on left by 1 place
        /*
        arr-> {1, 2,5, 7}
        left shift 2 5 7 and at the end 1 which was removed
        */
        //leftRotate(nums);

        // right rotation -> shift all elements on right side by 1 place
        /*
        arr->           {1, 2,5, 7}
        right roate  {7, 1, 2, 5}
        */
        rightRotate(nums);
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

    static void leftRotate(int arr[]){
        System.out.print("Original: ");
        for (int i : arr) {
            System.out.print(i+",");
        }
        int temp = arr[0];
        for(int i =1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println();
        System.out.print("Rotated: ");
        for (int x : arr) {
            System.out.print(x+",");
        }
        System.out.println();
    }

    static void rightRotate(int arr[]){
        System.out.print("Original: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int temp = arr[arr.length-1];
        for(int i =arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0] = temp;

        System.out.println("Right Rotated: ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
