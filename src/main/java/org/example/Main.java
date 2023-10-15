package org.example;


import java.time.temporal.ValueRange;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int[] arr = {6, 3, 5, 2, 1, 2, 4};
    public static void main(String[] args) {

       // List streets = Arrays.asList("Okon", "Effiong", "Etim");
        cgpa();
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
        System.out.println();
    }
    private static List<Address> aList() {

        Address address1 = new Address(12, "Akpabio Street");
        Address address2 = new Address(39, "Lawanson Road");
        Address address3 = new Address(6, "Nepa Line");
        List<Address> num = new ArrayList<>();

        num.add(address1);
        num.add(address2);
        num.add(address3);
        return num;

    }
    private static void letterCount(){
        //initialize counter
        int count = 0;

        //Take a word input
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        //Take a letter input
        System.out.println("Enter a letter");
        char letter = scanner.nextLine().charAt(0);

        //Iterate through the word
        for (int i =0;i<word.length();i++){
            //check if the letter is in the word
            if(word.charAt(i)==letter){
                //increment the count of letter in the word
                count++;
            }
        }
        System.out.println("There are " + count +" "+ letter + " in " + word);
    }
    private static void reverseWord(){
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        for (int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
    private static void cgpa(){
        System.out.println("Enter number of subjects");
        int numberOfSubject = Integer.parseInt(scanner.nextLine());

        String[] subjects = new String[numberOfSubject];
        Character[] grades = new Character[numberOfSubject];
        Integer[] units = new Integer[numberOfSubject];


        for(int i=0; i<numberOfSubject;i++){
            System.out.println("Enter subject name");
            subjects[i]= scanner.nextLine();

            System.out.println("Enter grades(A,B,C,D,E,F)");
            grades[i] = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Enter credit unit");
            units[i] =Integer.parseInt(scanner.nextLine());
        }

        int score = 0;
        for (int i = 0; i< grades.length;i++){
            if(grades[i]=='A') score = 5;
            else if (grades[i]=='B') score = 4;
            else if (grades[i]=='C') score = 3;
            else if (grades[i]=='D') score = 2;
            else if (grades[i]=='E') score = 1;
            else if (grades[i]=='F') score = 0;

        }

        int unitsTotal = 0;
        float gpa = 0;
        System.out.println("#############################");
        System.out.printf("%-8s%10s%10s%n", "SUBJECT", "GRADE", "UNIT");
        for (int i=0; i<numberOfSubject; i++){
            unitsTotal += units[i];
            gpa += (score * units[i]);
            System.out.printf("%-10s%4c%10d%n", subjects[i], grades[i], units[i]);
        }
        System.out.println("#############################");
        double cgpa = gpa/unitsTotal;
        System.out.println("GPA is " + cgpa );
    }
}