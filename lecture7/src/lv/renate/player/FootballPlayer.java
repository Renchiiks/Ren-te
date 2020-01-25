package lv.renate.player;

public class FootballPlayer {
	String name; 
	String position;
	int shortNumber;
	boolean built;
	long height;
	int weight;
	
	public FootballPlayer(String name,String position,int shortNumber,boolean built,long height,int weight){
		this.name = name;
		this.position = position;
		this.shortNumber = shortNumber;
		this.built = built;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getShortNumber() {
		return shortNumber;
	}
	public void setShortNumber(int shortNumber) {
		this.shortNumber = shortNumber;
	}
	public boolean isBuilt() {
		return built;
	}
	public void setBuilt(boolean built) {
		this.built = built;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
