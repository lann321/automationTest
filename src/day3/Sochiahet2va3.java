package day3;

import java.util.Scanner;

public class Sochiahet2va3 {
	public static void nhapmang(int dodaimang)
	{
		Scanner scanner = new Scanner(System.in);
		int []mangsonguyen = new int [dodaimang];
		for ( int i=0 ; i< dodaimang; i++)
		{
			System.out.println("Nhập giá trị của mảng tại vị trí thứ: "+i);
			mangsonguyen[i]= scanner.nextInt();
				if (mangsonguyen[i]%2==0 && mangsonguyen[i]%3==0)
				{
					System.out.println("Điều kiện thoát xảy ra");
					return;
				}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapmang(10);
	}
	
}
