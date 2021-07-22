package school.solution.dbservices.dto;

public class NoticeDto {
	private String createDate;
	private String eventDate;
	private String title;
	private String description;

	public NoticeDto(String createDate, String eventDate, String title, String description) {
		this.createDate = createDate;
		this.eventDate = eventDate;
		this.title = title;
		this.description = description;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
