package lv.renate.users;

public class Person {
	String name = "vards";
	String adress = "adrese";
	public String getAdress() {
		return adress;
	}
	public Person(String name, String adress){
		this.name = name;
		this.adress = adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	
	public String toString(){
		return this.name+"("+this.adress+")";
	}

}
