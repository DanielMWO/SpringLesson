package com.luv2code.springdemo;


public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Fortune1", "Fortune2", "Fortune3"};
	
	public RandomFortuneService() {
		
	}	
	
	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

	@Override
	public String getFortune() {
		int index = (int)Math.floor((Math.random()*10)/3)-1;
		System.out.println(index);
		return this.fortunes[index].toString();
		
	}
}
	
