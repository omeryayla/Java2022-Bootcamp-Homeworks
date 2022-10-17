package dataAccess.abstracts;


import entitites.concretes.Course;

public interface CourseDao {

	public void add(Course courses);

	public void delete(Course course);

	public void update(Course course);

}
