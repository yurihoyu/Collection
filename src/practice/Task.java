package practice;

import java.time.LocalDate;

public class Task {


	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	private String contents;

	public Task(LocalDate date,String contents) {
		this.date = date;
		this.contents = contents;


	}
}
