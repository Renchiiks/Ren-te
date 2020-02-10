package lv.renate.test;

import java.util.ArrayList;

import lv.renate.module.League;
import lv.renate.module.Team;

public class testTeamAndLeague {

	
	public static void main(String[] args) {
		
		ArrayList<Team> arrTeam = new ArrayList<>();
		
	
		
		
		 Team ska = new Team("SKA");
		 Team cska = new Team ("CSKA");
		 Team dinamo = new Team ("DINAMO");
		 Team jokerit = new Team ("JOKERIT");
		 Team spartak = new Team ("Spartak");
		 Team torpedo = new Team ("Torpedo");
		 
		 arrTeam.add(ska);
		 arrTeam.add(cska);
		 arrTeam.add(dinamo);
		 arrTeam.add(jokerit);
		 arrTeam.add(spartak);
		 arrTeam.add(torpedo);
		 
		for(Team name:arrTeam){
			System.out.println(name.getTeamName());	
			}
			
		 
		 
		 League khl = new League("KHL");
		 
		 
		//khl.nameOfTeams.add(cska);
		 khl.recordWinAndLoss("SKA","CSKA");
//		 khl.recordWinAndLoss(ska,dinamo);
//		 khl.recordWinAndLoss(dinamo,cska);
		 
		 khl.recordTies(cska, dinamo);
		 
		 
		 
		 
		khl.setNameOfTeams(arrTeam);
		
		
		System.out.println("Total SKA point: "+ska.totalPoints());
		System.out.println(khl.toString());
	}
	
	

}