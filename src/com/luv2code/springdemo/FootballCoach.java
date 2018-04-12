package com.luv2code.springdemo;

public class FootballCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Train penalties for 20 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
