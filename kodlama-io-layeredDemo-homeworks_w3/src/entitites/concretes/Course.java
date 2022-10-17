package entitites.concretes;

import entitites.abstracts.Entity;

public class Course implements Entity {

	private int courseId;
	private double coursePrice;
	private String courseName;
	private String courseStatus;
	private String instructorName;

	public Course() {
		super();
	}

	public Course(int courseId, double coursePrice, String courseName, String courseStatus, String instructorName) {
		super();
		this.courseId = courseId;
		this.coursePrice = coursePrice;
		this.courseName = courseName;
		this.courseStatus = courseStatus;
		this.instructorName = instructorName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
