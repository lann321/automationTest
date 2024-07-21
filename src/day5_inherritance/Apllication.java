package day5_inherritance;

public class Apllication {
	public static void main(String[] args)
	{
		Sinhvien SV1 = new Sinhvien();
		SV1.setSotinchi("20");
		SV1.setMaSV("34");
		SV1.setHoten("nguyen van A");
		SV1.setNgaysinh("13/02/2002");
		System.out.println("SV1: "+SV1.getHoten() +"," +SV1.maSV +"," +SV1.sotinchi + ","+SV1.getNgaysinh());
		SV1.dichoi();
		SV1.dihoc();
		
		
		
		Giaovien gv1 = new Giaovien();
		gv1.setHoten("Giáo viên 1");
		gv1.setNgaysinh("28/8/1998");
		gv1.setMaGV("200");
		gv1.setSonamKN("3");
		System.out.println("gv1: "+gv1.getHoten() +"," + SV1.maSV + "," +SV1.sotinchi + "," +SV1.getNgaysinh());
		gv1.dichoi();
		gv1.diday();
	}

}
