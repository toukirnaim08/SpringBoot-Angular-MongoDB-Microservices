package school.solution.courseservices.model;

public class Course {
	private int id;
	private String title;
	private String courseCode;

	public Course() {
	}

	public Course(int id, String title, String courseCode) {
		this.id = id;
		this.title = title;
		this.courseCode = courseCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
