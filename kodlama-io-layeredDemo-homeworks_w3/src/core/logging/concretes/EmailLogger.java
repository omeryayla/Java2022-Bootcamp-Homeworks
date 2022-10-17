package core.logging.concretes;

import core.logging.abstracts.BaseLogger;

public class EmailLogger implements BaseLogger{

	@Override
	public void log() {
		
		System.out.println("Logged to Email");
		
	}
	


}
