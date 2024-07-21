package day4;

public class motbike {
	static String hangxe;
	static String mau;
	static String ngaydangky;
	static String biensoxe;
	public static String getinfor()
	{
		return("hang xe là:" + hangxe +", mau xe la"+mau +", ngay đăng ký là: "+ ngaydangky +", Biển số xe la: "+ biensoxe);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motbike xe1 = new motbike();
				xe1.hangxe ="honda";
				xe1.mau = "Xanh";
				xe1.ngaydangky ="1/3/2023";
				xe1.biensoxe = "35n1-1234";
				System.out.println("thông tin xe 1 là: "+xe1.getinfor());
		motbike xe2 = new motbike();
				xe2.hangxe ="honda";
				xe2.mau = "đen";
				xe2.ngaydangky ="1/5/2020";
				xe2.biensoxe = "34-456";	
				System.out.println("thông tin xe 2 là: "+xe2.getinfor());
	}

}
