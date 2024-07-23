package model;

import java.util.Date;

public class Bug {
	private int bug_id;
	private String description;
	private int category_id;
	private int assigned_to;
	private String status;
	private Date createdDate;
	private Date resolvedDate;
	
	public Bug() {
		super();
	}

	public Bug(int bug_id, String description, int category_id, int assigned_to, String status, Date createdDate,
			Date resolvedDate) {
		super();
		this.bug_id = bug_id;
		this.description = description;
		this.category_id = category_id;
		this.assigned_to = assigned_to;
		this.status = status;
		this.createdDate = createdDate;
		this.resolvedDate = resolvedDate;
	}

	public int getBug_id() {
		return bug_id;
	}

	public void setBug_id(int bug_id) {
		this.bug_id = bug_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(int assigned_to) {
		this.assigned_to = assigned_to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	
	
}
