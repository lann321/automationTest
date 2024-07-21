package Day5_Bai2;

public class Tinhluong {
	public double tinhluong2(double luongcoban, double hesoluong)
	{
		return luongcoban*hesoluong;
	}
	public double tinhluong3(double luongcoban, double hesoluong, double sonamkinhnghiem)
	{
		return luongcoban*hesoluong*sonamkinhnghiem;
	}
	public double tinhluong4(double luongcoban, double hesoluong, double sonamkinhnghiem, String loai)
	{
		if (loai =="da khoa")
		{
		return luongcoban*hesoluong*sonamkinhnghiem*0.45;
	}
		else 
			return luongcoban*hesoluong*sonamkinhnghiem*0.2;
	
}
}
