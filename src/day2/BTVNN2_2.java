package day2;

import java.util.Scanner;

public class BTVNN2_2 {
	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
		double n1;
		Double n2;
		System.out.println("Nhập vào hai số thực cách nhau bởi dấu cách:");
		n1= scanner.nextDouble();
		n2= scanner.nextDouble();
		if (n1>n2)
		{
			System.out.println("số lớn nhất là:"+n1);
		}
		else 
			{
			System.out.println("số lớn nhất là:"+n2);
			}
	}

}
