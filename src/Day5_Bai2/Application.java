package Day5_Bai2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tinhluong luong1 =new Tinhluong();
		System.out.println("tính luong 2 tham số: "+ luong1.tinhluong2(10000000, 3));
		System.out.println("tính luong 3 tham số: "+ luong1.tinhluong3(10000000, 2, 3));
		System.out.println("Tính lương 4 tham số da khoa: "+ luong1.tinhluong4(10000000, 2, 3, "da khoa"));
		System.out.println("Tính lương 4 tham số chuyen khoa: "+ luong1.tinhluong4(10000000, 2, 3, "chuyen khoa"));
		
	}

}
