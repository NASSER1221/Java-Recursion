public class MaxFinder {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        int max = Integer.MIN_VALUE;
        System.out.println("Finding the maximum number with a loop...");
        // --- START OF BLOCK TO REPLACE ---
           max=findMaxRecursive(numbers,0);
        // --- END OF BLOCK TO REPLACE ---
        System.out.println("The maximum number is: " + max);
    }
     public static int findMaxRecursive(int[] nums, int index) {

        if(index>=nums.length) return 0;

        return Math.max(nums[index],findMaxRecursive(nums,index+1));
     }

}
