package lv.renate;

public class LearnMethods {

	//void nav noteikt tips, ko atgriezt
	//static
	//public, private, protected
	public static void main(String[] args) {
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		System.out.println("++++++++++++++++++++++++++++++++++=");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.doYouHaveCat();
		
		
		
	}
	public static void getMyName(){
		System.out.println("My name is Renate");
	}
	public static void getMyCity(){
		getMyName();
		System.out.println("My city is Rīga");
	}
	public void doYouHaveCat(){
		System.out.println("No");
	
}
}
