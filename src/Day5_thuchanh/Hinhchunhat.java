package Day5_thuchanh;

public class Hinhchunhat extends Hinhhoc{
	public double chieudai;
	public double chieurong;
	
	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	public double tinhdientich()
	{
		return chieudai*chieurong;
	
	}

}
