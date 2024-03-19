package Corejava;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		System.out.println("1 add");
		System.out.println("2 sub");
		System.out.println("3 mul");
		System.out.println("4 div");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("Enter your choice number");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1 :
		System.out.println(a+b);
		break;
		case 2:
		System.out.println(a-b);
		break;
		case 3:
		System.out.println(a*b);
		break;
		case 4:
		System.out.println(a/b);
		break;
		default :
		System.out.println("invalid choice");
		}
		
	}
	}


