package com.companyname.tests;

import org.testng.annotations.Test;

public class JavaPractices {

    //@Test
    public void ReverseOrder()
    {
        int [] Num = {1,2,3,4,5,6,7,8};

        for(int i=Num.length-1; i>=0; i--)
        {
            System.out.println(Num[i]);
        }
    }

    public void ReverseString()
    {
        String Name = "Seyed";

    }

    //@Test
    public void printArray()
    {
        int [] num = {5,3,8,2,7};

        for(int i=0; i<num.length; i++)
        {
            System.out.println("*");
//            System.out.println(num[i]+2);
//            //System.out.println("*");
//            for(int j=0; j<num.length; j++)
//            {
//                System.out.println("*");
//            }
        }


    }
    @Test
    public void ArrayPattern() {

            int[] array = {5, 2, 3, 4};
            int starCount = 1; // To keep track of how many stars to print

            // Loop through the array and sum consecutive pairs
            for (int i = 0; i < array.length - 1; i++) {
                // Calculate the sum of consecutive pairs
                int sum = array[i] + array[i + 1];
                System.out.println(sum); // Print the sum

                // Print stars according to the pattern
                for (int j = 0; j < starCount; j++) {
                    System.out.println("*");
                }

                // Increase the number of stars for the next round
                starCount++;
            }

    }
    //@Test
    public void PrintSum()
    {
        int [] num = {3,5,2,7,4};
        int sum = 0;
        for(int i=0; i<num.length; i++)
        {
            //System.out.println(num[i]);
            sum = num[i] + sum;
        }
        System.out.println(sum);
    }

    @Test
    public void PrintLargestNumber()
    {
        int [] num = {3,5,2,7,4};
        int largest = num[0];
        for (int i = 1; i < num.length; i++)
        {
            if(num[i] > largest)
            {
                largest = num[i];
            }
        }
        System.out.println(largest);
    }

}
