package com.company;

public class Main {

    public static void main(String[] args) {
	// Task 1
        int[] arr= generateRandomArray();
        int sum =0;
        for (int s = 0; s< arr.length; s++){
            sum += arr[s];
        }
        System.out.println("Сумма трат за месяц составила " + sum +" рублей");
        //Task 2
int maxsum= -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxsum) {
                maxsum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " +maxsum + " рублей");

        int minsum = arr[0]+1;
        for (int i = 0; i < arr.length; i++) {
           if ( arr[i]< minsum){
               minsum = arr[i];
           }
        }
        System.out.println("Минимальная сумма трат за месяц составила "+ minsum + " рублей");

        //Task 3
var avarageAmount =sum/30;
        System.out.println("Средняя сумма трат за месяц составила "+ avarageAmount + " рублей");

        //Task 4
        char[] reverseFullName ={'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int k = reverseFullName.length-1; k>=0; k--){
            System.out.print(reverseFullName[k]);
        }
    }
    int [] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
         arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
