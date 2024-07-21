package day5_bai3;

import java.util.Scanner;

public class Thongtin {
	private String hoten;
	private String maNV;
	private String SDT;
	public int length;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String SDT) {
		this.SDT = SDT;
	}
	
	public int[] nhapDStester(int SLtester)
	{
		Scanner scanner = new Scanner(System.in);
		int[]Danhsachtester = new int [SLtester];
		for (int i=0; i < SLtester; i++)
		{
		
			System.out.println("nhập thông tin tester:"+ i);
			System.out.println("Họ và tên");
			hoten = scanner.nextLine();
			 System.out.println("Mã nhân viên ");
			 maNV = scanner.nextLine();
			 System.out.println("Số điện thoại  ");
			 SDT = scanner.nextLine();
			
		
			}
		return Danhsachtester;
		
	}
	public void inmang(int []Danhsachtester)
	{ 
		System.out.println("Số lượng danh sách tester :"+ Danhsachtester.length);
		System.out.println("Các giá trị vừa nhập là:");
		for (int i=0 ; i<Danhsachtester.length; i++)
		{
		
			System.out.println(Danhsachtester[i]+" ");
			System.out.println("nhân viên thứ "+ i +":");
			System.out.println("Họ và tên: "+ getHoten());
			System.out.println("Mã Nhân viên: "+ getMaNV());
			System.out.println(" Số điện thoại: "+ getSDT());
			
		}
	}
	
}
