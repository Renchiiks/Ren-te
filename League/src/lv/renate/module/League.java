package lv.renate.module;

import java.util.ArrayList;

public class League {
	private String leagueName = "";
	private ArrayList<Team> nameOfTeams;

	public League(String leagueName) {
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
	public Team teamWithName(String nameTooLookFor) {
		Team teamCreated = null;
		for (Team team : this.nameOfTeams) {
			if (team.teamName.equals(nameTooLookFor)) {
				teamCreated = team;
			}
		}

		return teamCreated;
	}

	public void recordWinAndLoss(String winnerName, String loserName) {
		Team winner;
		Team loser;

		winner = this.teamWithName(winnerName);
		loser = this.teamWithName(loserName);

		loser.loses++;
		winner.wins++;

	}

	public void recordTies(Team TeamA, Team TeamB) {

		TeamA.ties++;
		TeamB.ties++;
	}

	@Override
	public String toString() {
		return "League [leagueName=" + leagueName + ", nameOfTeams="
				+ nameOfTeams + "]";
	}

	

}
