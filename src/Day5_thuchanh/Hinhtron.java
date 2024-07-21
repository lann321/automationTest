package Day5_thuchanh;

public class Hinhtron extends Hinhhoc {
	public double bankinh;

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	public double tinhdientich()
	{
		return bankinh * 3.14;
	}
}
