### shresth sharma
Photo:https://www.instagram.com/p/CXf0UzgFMkz/
Location:India
github:https://github.com/dextersherry

<!-- calculator.java -->
package com.lecture2;

import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int answer=0;
        // take input from user till user did not press x or X

        while(true){
            System.out.println("FOR EXIT PRESS X");
            System.out.print("Enter the operator:");
            char op= input.next().trim().charAt(0);
            if(op =='+' || op=='*' || op=='/' || op=='%'){
//                input 2 numbers
                System.out.print("Enter two numbers:");
                int num1= input.nextInt();
                int num2= input.nextInt();

                if(op=='+'){
                    answer=num1+num2;
                }
                if(op=='-'){
                    answer=num1-num2;
                }

                if(op=='*'){

                        answer = num1 * num2;

                }
                if(op=='/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
                if(op=='%'){
                    answer=num1%num2;
                }


            } else if (op =='x' || op=='X') {
                break;
            }else{
                System.out.println("INVALID OPERATION");
            }
            System.out.println(answer);
            }
        }


    }


