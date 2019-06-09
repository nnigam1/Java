package com.personal.javaprgrm;


enum SIGNAL {
	
	RED("stop") , GREEN("go") , YELLOW("ready");
	
	private String action;

	public String getAction() {
		return action;
	}
	
	private SIGNAL(String str)
	{
		this.action = str;
	}
}


public class CustomEnum {
	
	public static void main(String[] args) {
		SIGNAL[] arr = SIGNAL.values();
		
		for( SIGNAL s: arr)
		{
			System.out.println(s.name() + " means " + s.getAction());
		}
		
//		SIGNAL s = SIGNAL.RED;
//		
//		switch(s)
//		{
//		case RED:
//		{
//			System.out.println(s.getAction());
//		}
//		case GREEN:
//		{
//			
//		}
		
		System.out.println(SIGNAL.values().length);
		
	}
	

}
