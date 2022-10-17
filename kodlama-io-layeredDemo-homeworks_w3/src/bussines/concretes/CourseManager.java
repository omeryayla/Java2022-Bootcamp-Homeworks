package bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import bussines.abstracts.CourseService;
import core.logging.abstracts.BaseLogger;
import dataAccess.abstracts.CourseDao;
import entitites.concretes.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private BaseLogger[] baseLoggers;

	List<Course> courses = new ArrayList<Course>();

	public CourseManager(CourseDao courseDao, BaseLogger[] baseLoggers) {
		super();
		this.courseDao = courseDao;
		this.baseLoggers = baseLoggers;
	}

	@Override
	public void add(Course course) throws Exception {

		if (course.getCoursePrice() < 0) {
			throw new Exception("Course price must be greater than zero!");
		}

		for (Course courseInList : courses) {

			if (courseInList.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name must be unique!");
			}
		}
		courses.add(course);
		this.courseDao.add(course);

		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void delete(Course course) {

		this.courseDao.delete(course);
		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void update(Course course) {

		this.courseDao.update(course);
		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

}
