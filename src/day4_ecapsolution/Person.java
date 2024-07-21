package day4_ecapsolution;

public class Person {

	private String phonenumber;
	public String name;
	
	// vì phonenumber là biến private nên cần tạo method get để lấy thông titn 
	// và set để nhập thông tin phonenumber
	public String getphonenumber()
	{
		return phonenumber;
	}
	
	public void setphonenumber(String value)
	{
		this.phonenumber= value;
		
	}
}
