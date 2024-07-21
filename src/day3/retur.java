package day3;

import java.util.Scanner;

public class retur {

	public static int trasolonnhat(int x, int y)
	{
		if(x>y) return x; else return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("số lớn hơn-mời bạn nhập số thứ nhất");
		int x=scanner.nextInt();
		System.out.println("số lớn hơn-mời bạn nhập số thứ hai");
		int y=scanner.nextInt();
		int result =trasolonnhat(x,y);
		System.out.println("số lớn hơn là:"+ result);
	}

}
