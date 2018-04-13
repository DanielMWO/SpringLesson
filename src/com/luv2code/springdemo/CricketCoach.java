package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	

	public CricketCoach() {
		System.out.println("CC inside no argument constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CC inside no FortuneService Setter");

		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("inside emailAdress Setter");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		//System.out.println("inside team Setter");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Do Cricket";
	}

		
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
