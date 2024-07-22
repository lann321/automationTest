package Day7_nhapmang;

import java.util.Scanner;

public class ThongtinNV {
	private String hoten;
	private String maNV;
	private String ngaysinh;
	private String sdt;
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
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	};
	
	
	public int[] nhapmang(int soluong)
	{
		Scanner scanner = new Scanner(System.in);
		int[]Danhsach  = new int[soluong];
		for (int i =0 ; i < soluong ; i++)
		{
			System.out.println("Nhập thông tin nhân viên thứ: " + (i+1));
			System.out.println("Họ và Tên: ");
			hoten = scanner.nextLine();
			System.out.println("Mã nhân viên: ");
			maNV = scanner.nextLine();
			System.out.println("ngày sinh : ");
			ngaysinh = scanner.nextLine();
			System.out.println("số điện thoại: ");
			sdt = scanner.nextLine();
		}
		return Danhsach;
	}
	public void inmang(int []Danhsach)
	{
		System.out.println("Số lượng nhân viên: "+ Danhsach.length);
		System.out.println("Họ và tên: "+ getHoten());
		System.out.println("Mã nhân viên: "+ getMaNV());
		System.out.println("Ngày Sinh: "+getNgaysinh());
		System.out.println("Số điện thoại: "+ getSdt());
	}
}
