package org.example;


import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr = {6, 3, 5, 2, 1, 2, 4};
    public static void main(String[] args) {

        ascend();
    }
    //Method gives the minimum value in an array
    private static void min(){
        int min = arr[0];
        System.out.println("The smallest of ");
        for (int i:arr){
            if (i<min){
                min = i;
            }
            System.out.print(i + ", ");
        }
        System.out.println(" is " + min);
    }

    private static void index() {
        System.out.println("Enter Element");
        int ele = scanner.nextInt();
        int i = 0;
        while (i< arr.length){
            if (ele==arr[i]){
                System.out.println(ele + " is at index " + i);
                break;
            }
            i++;
        }
    }
    private static void ascend(){
        if (arr.length<2){
            System.out.println(Arrays.toString(arr));
        }
        int pivot = arr[arr.length-1];
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length/2];
        for(int i=0; i< arr.length-1; i++){
            if (arr[i]<pivot){
                left[i] = arr[i];
            }else{
                right[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + pivot + Arrays.toString(right));
    }
}