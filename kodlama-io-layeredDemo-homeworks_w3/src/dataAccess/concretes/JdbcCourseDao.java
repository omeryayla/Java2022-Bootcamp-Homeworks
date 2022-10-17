package dataAccess.concretes;



import dataAccess.abstracts.CourseDao;
import entitites.concretes.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println("Added course via jdbc! " + course.getCourseName());

	}

	@Override
	public void delete(Course course) {
		
		System.out.println("Deleted course via jdbc! " + course.getCourseName());

	}

	@Override
	public void update(Course course) {
		
		System.out.println("Updated course via jdbc! " + course.getCourseName());

	}

}
