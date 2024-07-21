package day4;

public class Dog_objectt {
	 static String breed;
	 static String size;
	 static double age;
	 static String color;
	 
	 
	public static void getinformation() 
	{
		System.out.println("Breed is: "+ breed +", size is:"+size +", age is: " + age +", color is:" +color);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_objectt dog1 = new Dog_objectt();
		dog1.breed ="beggie";
		dog1.size = "big";
		dog1.age =2.5;
		dog1.color ="Black";
		getinformation();
		
		Dog_objectt dog2 = new Dog_objectt();
		dog2.breed ="pud";
		dog2.size = "big";
		dog2.age = 3 ;
		dog2.color ="Black";
		getinformation();

	}

}
