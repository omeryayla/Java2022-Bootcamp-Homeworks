package App;

import bussines.abstracts.CategoryService;
import bussines.abstracts.CourseService;
import bussines.abstracts.InstructorService;
import bussines.concretes.CategoryManager;
import bussines.concretes.CourseManager;
import bussines.concretes.InstructorManager;
import core.logging.abstracts.BaseLogger;

import core.logging.concretes.EmailLogger;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.HibernateInstructorDao;
import dataAccess.concretes.JdbcCategoryDao;
import entitites.concretes.Category;
import entitites.concretes.Course;
import entitites.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseLogger[] loggers = { new EmailLogger() };

		Course course1 = new Course(1, 40, "Java", "Not Completed", "Engin Demiroğ");
		Course course2 = new Course(2, 30, "DevOps", "Completed", "Engin Demiroğ");

		CourseService courseService = new CourseManager(new HibernateCourseDao(), loggers);

		courseService.add(course1);
		courseService.add(course2);
		courseService.delete(course1);
		courseService.update(course2);

		Category category1 = new Category(1, "Data Structures");
		Category category2 = new Category(2, "Database Management");

		CategoryService categoryService = new CategoryManager(new JdbcCategoryDao(), loggers);

		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.delete(category1);
		categoryService.update(category2);

		Instructor instructor = new Instructor(1, "Engin", "Demirog");

		InstructorService instructorService = new InstructorManager(new HibernateInstructorDao(), loggers);

		instructorService.add(instructor);
		instructorService.delete(instructor);
		instructorService.update(instructor);

	}

}
