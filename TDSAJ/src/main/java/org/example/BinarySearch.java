package org.example;

public class BinarySearch {

    public static void main(String[] args) {


        System.out.println("Hello world!");

        int nums[] = {5,7,9,11,13};
        int nums2[] = new int[1000];
        int target = 11;
        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        int left = 0;
        int right = nums.length - 1;
        int result3 = recursiveBinarySearch(nums, target, left, right);
        if(result!=-1){
            System.out.println("element found at index " + result);
            System.out.println("element found at index " + result2);
            System.out.println("element found at index " + result3);

        }else {
            System.out.println("element not found");
        }

    }
    private static int recursiveBinarySearch(int[] nums, int target, int left, int right){


        while(left <= right){

            int mid = (left + right) /2;
            if(nums[mid]==target){

                return mid;
            }else if (nums[mid]< target){
                return recursiveBinarySearch(nums, target, mid+1, right);
            }else{
                return recursiveBinarySearch(nums, target, left, mid-1);
            }
        }

        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            steps++;
            int mid = (left + right) /2;
            if(nums[mid]==target){
                System.out.println("steps taken in binary search: " + steps);
                return mid;
            }else if (nums[mid]< target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println("steps taken in binary search: " + steps);
        return -1;
    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i]==target){
                System.out.println("steps taken in linear search: " + steps);
                return i;
            }
        }
        System.out.println("steps taken in linear search: " + steps);

        return -1;
    }
}
