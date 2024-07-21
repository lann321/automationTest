
package day3;

import java.util.Scanner;

public class BTVN_day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapmang(5);		
	}
	public static void nhapmang(int dodaimang)
	{
		Scanner scanner = new Scanner(System.in);
		int []mangsonguyen = new int [dodaimang];
		for (int i=0; i < dodaimang; i++)
		{
			System.out.println("nhập vị trí của mảng ở vị trí thứ:"+ i);
			mangsonguyen[i]= scanner.nextInt();
			}
		inmang(mangsonguyen);
		sapxeptangdan(mangsonguyen);
		inmang(mangsonguyen);
		
	}
	public static void inmang(int []mangsonguyen)
	{ 
		System.out.println("Độ dài của mảng:"+ mangsonguyen.length);
		System.out.println("Các giá trị vừa nhập là:");
		for (int i=0 ; i<mangsonguyen.length; i++)
		{
			System.out.println(mangsonguyen[i]+" ");
		}
	}
	
	public static void sapxeptangdan(int []mangsonguyen)
	{
		int temp=0;
		for(int i=0; i < mangsonguyen.length;i++)
			for(int j=0;j < mangsonguyen.length-1;j++)
			{
				if( mangsonguyen[j] > mangsonguyen[j+1])
				{
					temp=mangsonguyen[j];
					mangsonguyen[j]=mangsonguyen[j+1];
					mangsonguyen[j+1]= temp;
			}
	}
}
}
