package javastarter;

public class Employee {
	
	private Integer empId;
	private String empName;
	private String empLocation;
	private String empAddress;
	private String empDomain;
	
	
	
	public Employee(Integer empId, String empName, String empLocation, String empAddress, String empDomain) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empAddress = empAddress;
		this.empDomain = empDomain;
	}

	public Employee() {
		
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpDomain() {
		return empDomain;
	}

	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", empAddress="
				+ empAddress + ", empDomain=" + empDomain + "]";
	}

	

}
