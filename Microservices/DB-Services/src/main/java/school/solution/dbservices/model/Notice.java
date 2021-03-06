package school.solution.dbservices.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notice")
public class Notice {
	@Id
	private int id;
	private String createDate;
	private String eventDate;
	private String title;
	private String description;

	public Notice(int id, String createDate, String eventDate, String title, String description) {
		this.id = id;
		this.createDate = createDate;
		this.eventDate = eventDate;
		this.title = title;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Notice{" +
				"id=" + id +
				", createDate='" + createDate + '\'' +
				", eventDate='" + eventDate + '\'' +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
