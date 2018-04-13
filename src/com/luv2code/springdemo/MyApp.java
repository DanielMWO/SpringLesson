package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		/*System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());*/
		
		RandomFortuneService przepowiednia = new RandomFortuneService();
		System.out.println(przepowiednia.getFortune());
	}

}
