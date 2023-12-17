package org.example;

public class BubbleSort {

    public static void main(String[] args){

        int nums[] = {6,5,2,8,9,4};
        int size = nums.length-1;
        int temp = 0;

        System.out.println("before sorting:");
        for(int num: nums){
            System.out.print(num + " ");
        }

        for(int i=0;i<size;i++){//O(n^2)
            for(int j=0;j<size;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            for(int num: nums){
                System.out.print(num + " ");
            }
        }

        System.out.println("\nafter sorting:");
        for(int num: nums){
            System.out.print(num + " ");
        }

    }
}
