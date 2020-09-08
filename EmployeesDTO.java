package employee_list;

public class EmployeesDTO {
	private int id;
	private String name;
	private String department;
	private String start_date;

	public String toString() {
		return super.toString()
				+ ",id=" + id
				+ ",name=" + name
				+ ",department=" + department
				+ "start_date" + start_date
				;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

}
