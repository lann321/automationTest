package day5_inherritance;

public class Giaovien extends nguoi{
// thuộc tính mở rộng: mã GV, s
	private String maGV;
	private String sonamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSonamKN() {
		return sonamKN;
	}
	public void setSonamKN(String sonamKN) {
		this.sonamKN = sonamKN;
	}
	
	public void diday()
	{
		System.out.print("dạy học trong tuần");
	}
	public void dichoi()
	{
		System.out.print("không có lịch dạy thì đi chơi");
	}
}
