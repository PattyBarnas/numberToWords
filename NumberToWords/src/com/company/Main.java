package com.company;

public class Main {

    public static void main(String[] args) {
//        numberToWords(103);
//        System.out.println(getDigitCount(0));
//        numberToWords(0);
//        numberToWords(10);
        numberToWords(133);
        numberToWords(125);
        numberToWords(100);
        numberToWords(1999);

//        numberToWords(0);
//        numberToWords(0);
//
//        numberToWords(1);


//        System.out.println(reverse(12333));
//        System.out.println(reverse(100));
//        System.out.println(getDigitCount(1223));
//        System.out.println(getDigitCount(12255));
//        System.out.println(getDigitCount(122666));


    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = 0;
        int check = getDigitCount(number);
        int reverseNumber = reverse(number);

        for (int i = 1; i <= 10; i++) {
            int remainder = reverseNumber % 10;
            switch (remainder) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
            count = count * 10 + remainder;


          int countCheck =  getDigitCount(count);
            if (countCheck == check){
                break;
            }
        }
    }

    public static int reverse(int numberTest) {

        int reverseNumber = 0;

        while (numberTest != 0) {

            int remainder = numberTest % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            numberTest /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        int digit = 0;
        if (number == 0) {
            digitCount = 1;
        }
            while (number != 0) {
                digit = number % 10; // 323  =     323 % 10 = 32(3) digit = 3
                number /= 10;    // 3.2
                digitCount++;

            }
        return digitCount;
        }

    }





