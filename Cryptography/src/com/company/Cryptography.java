//Robert Marsh
//Sept 14, 2020
//Program encrypts and deciphers a four digit number

package com.company;

import java.util.Scanner;

public class Cryptography {

    public static void main(String[] args) {
        int option, number, digit1, digit2, digit3, digit4, temp, temp2, enumber, dnumber;//declare variables
        Scanner input = new Scanner(System.in);//start scanner

        //start up user prompt
        System.out.println("            Encryption/Decryption Program");
        System.out.println("-----------------------------------------------------");
        System.out.println("               Choose an option below: ");
        System.out.println();
        System.out.println("        1. Encrypt");
        System.out.println("        2. Decrypt");
        System.out.println();

        //get user input
        System.out.print("Please enter option 1 or 2: ");
        option = input.nextInt();

        //loop for valid input
        while (option < 1 || option > 2){
            System.out.print("Invalid option, please enter option 1 or 2: ");
            option = input.nextInt();
        }
        //option one
        if (option == 1){
            System.out.print("Please enter a 4 digit number to encrypt: ");
            number = input.nextInt();
            //loop for number over 4 digits
            while (number > 9999){
                System.out.print("Number is too high, please enter a 4 digit number: ");
                number = input.nextInt();
            }
            //math for dissecting number
            digit1 = (number / 1000 + 7) % 10;
            digit2 = (number % 1000 / 100 + 7) % 10;
            digit3 = (number % 100 / 10 + 7) % 10;
            digit4 = (number % 10 + 7) % 10;
            //swap digits around
            temp = digit1;
            temp2 = digit2;
            digit1 = digit3;
            digit2 = digit4;
            digit3 = temp;
            digit4 = temp2;
            //create final number
            enumber = (digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4;
            //print encrypted number
            System.out.printf("Encrypted number is %d", enumber);

        }
        //option 2
        else{
            System.out.print("Please enter a 4 digit number to decrypt: ");//get user number
            number = input.nextInt();

            //loop for too high
            while (number > 9999){
                System.out.print("Number is too high, please enter a 4 digit number: ");
                number = input.nextInt();
            }
            //reverse math
            /*digit1 = number / 1000;
            if (digit1 < 7){
                digit1 = digit1 + 10 - 7;
            }
            else{
                digit1 = digit1 - 7;
            }
            digit2 = number % 1000 / 100;
            if (digit2 < 7){
                digit2 = digit2 + 10 - 7;
            }
            else{
                digit2 = digit2 - 7;
            }
            digit3 = number % 100 / 10;
            if (digit3 < 7){
                digit3 = digit3 + 10 - 7;
            }
            else{
                digit3 = digit3 - 7;
            }
            digit4 = number % 10;
            if (digit4 < 7){
                digit4 = digit4 + 10 - 7;
            }
            else{
                digit4 = digit4 - 7;
            }*/
            //reverse math
            digit1 = number / 1000;
            if (digit1 < 7){
                digit1 = digit1 + 3;
            }
            else{
                digit1 = digit1 - 7;
            }
            digit2 = number % 1000 / 100;
            if (digit2 < 7){
                digit2 = digit2 + 3;
            }
            else{
                digit2 = digit2 - 7;
            }
            digit3 = number % 100 / 10;
            if (digit3 < 7){
                digit3 = digit3 + 3;
            }
            else{
                digit3 = digit3 - 7;
            }
            digit4 = number % 10;
            if (digit4 < 7){
                digit4 = digit4 + 3;
            }
            else{
                digit4 = digit4 - 7;
            }

            //swapping digits
            temp = digit1;
            temp2 = digit2;
            digit1 = digit3;
            digit2 = digit4;
            digit3 = temp;
            digit4 = temp2;

            //adding up final number
            dnumber = (digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4;
            //printing decrypted number
            System.out.printf("Decrypted number is %d", dnumber);

        }
    }
}
