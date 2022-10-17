package bussines.abstracts;

import entitites.concretes.Instructor;

public interface InstructorService {
	
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update(Instructor instructor);

}
