package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import entitites.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Added instructor via jdbc! " + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

	@Override
	public void delete(Instructor instructor) {
		
		System.out.println("Deleted instructor via jdbc! " + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

	@Override
	public void update(Instructor instructor) {
		
		System.out.println("Updated instructor via jdbc! " + instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());

	}

}
