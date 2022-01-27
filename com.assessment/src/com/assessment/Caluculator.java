/**
 * 
 */
package com.assessment;

import java.util.Scanner;
public class Caluculator {
   public static void main(String[] args)
   {
	   int num1, num2;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   num1= sc.nextInt();
	   num2= sc.nextInt();
	   System.out.println("enter the operator");
	   char op=sc.next().charAt(0);
	   int n=0;
	   switch(op)
	   {
	   case '+':
	   n = num1 + num2;
	   break;
	   case '-':
	   n = num1 - num2;
	   break;
	   case '*':
	   n = num1 * num2;
	   break;
	   case '/':
	   n = num1 / num2;
	   break;
	   default:
		   System.out.println("you entered wrong number");
		   break;
	   }
			   System.out.println("result:");
			   System.out.println();
			   System.out.println(num1+" "+ op +" "+num2+"="+n);
	   }
	   }
