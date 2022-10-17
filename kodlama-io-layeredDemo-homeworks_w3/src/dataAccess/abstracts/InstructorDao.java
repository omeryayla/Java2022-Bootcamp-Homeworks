package dataAccess.abstracts;

import entitites.concretes.Instructor;

public interface InstructorDao {

	public void add(Instructor instructor);

	public void delete(Instructor instructor);

	public void update(Instructor instructor);

}
