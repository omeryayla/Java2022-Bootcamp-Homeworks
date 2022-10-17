package core.logging.concretes;

import core.logging.abstracts.BaseLogger;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log() {
		
		System.out.println("Logged to database!");
		
	}

}
