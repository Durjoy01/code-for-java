public class Employee extends User{
	private int employeeId;
	private String position;
	
	public Employee(String name,String email,int employeeId,String position) {
		super(name,email);
		this.employeeId = employeeId;
		this.position = position;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.getName()+", email=" +this.getEmail()+", employeeId=" + employeeId + ", position=" + position + "]";
	}

	
}