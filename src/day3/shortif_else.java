package day3;

import java.util.Scanner;

public class shortif_else {
	public static String result;
	public static void insolonhon(double st1,double st2)
	{
		result=(st1>st2)?"số lớn hơn là:"+st1 : "so lớn hơn là "+st2;
		System.out.println(result);
	}
	public static void kiemtrachanle(int number)
	{
		result=(number%2==0)?"số vừa nhập là số chẵn":"số vừa nhập là số lẻ";
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("số lớn hơn-mời bạn nhập số thứ nhất");
		double st1=scanner.nextDouble();
		System.out.println("số lớn hơn-mời bạn nhập số thứ hai");
		double st2=scanner.nextDouble();
		insolonhon(st1,st2);
		
		System.out.println("kiểm tra chẵn lẻ-mời bạn nhập số kiểm tra");
		int number=scanner.nextInt();
		kiemtrachanle(number);
	}
}


