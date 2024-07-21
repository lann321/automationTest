package day5_inherritance;

public class Sinhvien extends nguoi{
	public String maSV;
	public String sotinchi;

	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getSotinchi() {
		return sotinchi;
	}
	public void setSotinchi(String sotinchi) {
		this.sotinchi = sotinchi;
	}
	
	public void dichoi()
	{
		System.out.print("Được nghỉ thì đi chơi");
	}
	
	public void dihoc()
	{
		System.out.print("Đi học trong tuần");
	}
}
