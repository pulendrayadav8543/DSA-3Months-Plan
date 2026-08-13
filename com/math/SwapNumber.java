package com.math;
public class SwapNumber{
	public static void swapNumber(int a,int b){
		int temp=a;//temp=10 
		a=b;//a=15
		b=temp;//b=10
		System.out.println("Value of a: "+a+" "+"Value of b: "+b);
	}
	public static void main(String[] args){
		int a=10;
		int b=15;
		swapNumber(a,b);
	}
}