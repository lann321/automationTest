package day4_Quanlyxe;

public class xetaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xe taxi1 =new xe();
		taxi1.setLoaixe("VF4");
		taxi1.setTenxe("vinfast");
		taxi1.setVantocxe(330);
		System.out.println("xe taxi 1:" + taxi1.getLoaixe() + "," + taxi1.getTenxe() + "," + taxi1.getVantocxe());
		
		xe taxi2 =new xe();
		taxi2.setLoaixe("vios");
		taxi2.setTenxe("toyota");
		taxi2.setVantocxe(330);
		System.out.println("xe taxi 2:" + taxi2.getLoaixe() + "," + taxi2.getTenxe() + "," + taxi2.getVantocxe());
	}

}
