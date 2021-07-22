package school.solution.dbservices.dto;

public class CourseDto {
	private String title;
	private String courseCode;

	public CourseDto(String title, String courseCode) {
		this.title = title;
		this.courseCode = courseCode;
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
