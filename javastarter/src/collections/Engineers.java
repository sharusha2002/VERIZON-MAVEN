package collections;

public class Engineers {
	private Integer id;
	private String name;
	private String location;
	private Integer salary;
	
	
	public Engineers(Integer id, String name, String location, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Engineers [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	

}