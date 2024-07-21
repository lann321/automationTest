package day5_inherritance;

public class nguoi {
	// thuộc tính private: hoten, tuổi , ngày sinh
	// phương thức đi chơi
	private String hoten;
	private String ngaysinh;
	
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public void dichoi()
	{
		System.out.print("trời đẹp");
	}

	
}
