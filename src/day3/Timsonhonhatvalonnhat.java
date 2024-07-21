package day3;

import java.util.Scanner;

public class Timsonhonhatvalonnhat {
	
	public static void nhapmang(int dodaimang)
	{
		Scanner scanner = new Scanner(System.in);
		int []mangsonguyen= new int [dodaimang];
		for(int i = 0 ; i < dodaimang; i++)
		{
			System.out.println("Nhập giá trị mảng tại vị trí thứ :" + i);
			mangsonguyen[i] = scanner.nextInt();
		}
		sonhonhat(mangsonguyen);
		solonnhat(mangsonguyen);
	}
	public static void sonhonhat(int []mangsonguyen)
	{
		int sonhonhat = mangsonguyen[0];
		for (int i=0 ; i< mangsonguyen.length; i++)
		{
			if (sonhonhat > mangsonguyen[i]) 
				sonhonhat = mangsonguyen[i];
		}
		System.out.println("Số nhỏ nhất là: "+ sonhonhat);
	}
	public static void solonnhat(int []mangsonguyen)
	{
		int solonnhat = mangsonguyen[0];
		for (int i = 0; i> mangsonguyen.length; i++)
		{ 
			if (solonnhat > mangsonguyen[i])
				solonnhat=mangsonguyen[i];
		}
		System.out.println("Số lớn nhất là:" +  solonnhat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapmang(4);

	}

}
