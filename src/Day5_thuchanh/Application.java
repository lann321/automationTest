package Day5_thuchanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinhchunhat HCN1 = new Hinhchunhat();;
		HCN1.setTenhhinh(" Hình chữ nhật 1 ");
		HCN1.setChieudai(2);
		HCN1.setChieurong(4);
		System.out.println("HCN1: " + HCN1.getTenhhinh() + HCN1.getChieudai() + HCN1.getChieurong() + " diện tích : "+HCN1.tinhdientich());
		
		
		Hinhtron C1 = new Hinhtron();
		C1.setTenhhinh("hinh tròn 1 ");
		C1.setBankinh(3);
		System.out.println("C1: "+ C1.getBankinh() + C1.getTenhhinh()+"Diện tích : "+ C1.tinhdientich());
	
	}

}
