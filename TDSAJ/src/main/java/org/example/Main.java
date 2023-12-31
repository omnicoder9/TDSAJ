package org.example;

public class Main {
    public static void main(String[] args) {

        //Dstack nums = new DStack();

        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);

        q.show();



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