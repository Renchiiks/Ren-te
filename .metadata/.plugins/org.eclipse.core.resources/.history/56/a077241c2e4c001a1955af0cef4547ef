package lv.renate.module;

import java.util.ArrayList;

public class League {
	private String leagueName = "";
	private ArrayList<Team> nameOfTeams;
	
	public League(String leagueName){
		this.leagueName = leagueName;
		this.nameOfTeams = new ArrayList<>();
	}
	
	
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}
	public void recordWinAndLoss(Team winner, Team loser){
		
		winner.setWins(1);
		loser.setLoses(1);
	}


	@Override
	public String toString() {
		return "League [leagueName=" + leagueName + ", nameOfTeams="
				+ nameOfTeams + "]";
	}


	
	
	
}
