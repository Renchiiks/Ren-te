package lv.renate;

import lv.renate.geometrcfigures.Circle;
import lv.renate.player.FootballPlayer;

public class Testjava {

	
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 70);

		
		
		
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShortNumber());
		System.out.println(player.isBuilt());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
		player.setShortNumber(10);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShortNumber());
		System.out.println(player.isBuilt());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());

	}

}
