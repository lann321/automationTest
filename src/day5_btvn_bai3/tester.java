package day5_btvn_bai3;

import java.util.Scanner;

public class tester extends emloyee {
	private String level;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public void nhapmang()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int n =scanner.nextInt();
		scanner.nextLine();
		// khởi tạo mảng 
		tester[] arr = new tester[n];
		for(int i=0 ; i<n ; i++)
		{
			System.out.println("Nhập tester thứ: "+ (i+1));
			tester TS1 = new tester();
			System.out.println("Họ và tên: ");
			TS1.setHoten(scanner.nextLine());
			System.out.println("MaNV: ");
			TS1.setMaNV(scanner.nextLine());
			System.out.println("Số điện thoại: ");
			TS1.setSDT(scanner.nextLine());
			System.out.println("Số điện thoại: ");
			TS1.setSDT(scanner.nextLine());
			
		}
	}
	public void inmang(tester[] arr)
	{
		System.out.println("Thông tin phòng ban tester: ");
		for(int i=0; i< arr.length; i++)
		{
			System.out.println("Họ tên: "+ getHoten()+ "Số điện thoại: " +getSDT());
		}
	}
}
