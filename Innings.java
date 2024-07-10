package com.capgemini.assignment_2.Project_18;

public class Innings {

	private Long inningsNumber;
	private String battingTeam;
	
	public Innings() {
		super();
	}


	public Innings(Long inningsNumber, String battingTeam) {
		super();
		this.inningsNumber = inningsNumber;
		this.battingTeam = battingTeam;
	}


	public Long getInningsNumber() {
		return inningsNumber;
	}


	public void setInningsNumber(Long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}


	public String getBattingTeam() {
		return battingTeam;
	}


	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
}
