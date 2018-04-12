package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min ob batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		
		//us my fortuneservice to get fortune
		return this.fortuneService.getFortune();
	}
}
