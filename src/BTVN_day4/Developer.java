package BTVN_day4;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee dev1= new employee();
		dev1.setEmplouee_salary(20000);
		dev1.setEmployee_id(11109);
		dev1.setEmployee_name("Lan Phạm");
		System.out.println("dev1 name:" + dev1.getEmployee_name() + ", dev1 lương :"
		+ dev1.getEmplouee_salary() +", dev1 id: "+dev1.getEmployee_id());
		
		employee dev2= new employee();
		dev2.setEmplouee_salary(297830);
		dev2.setEmployee_id(189479);
		dev2.setEmployee_name("Nguyễn Văn B");
		System.out.println("dev2 name: " + dev2.getEmployee_name()+ ", dev2 lương: "
		+ dev2.getEmplouee_salary() +", dev2 id: "+dev2.getEmployee_id());
		
	}

}
