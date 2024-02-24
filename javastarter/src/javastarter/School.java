package javastarter;

public class School {
	private Integer id;
	private String name;
	private String skills;
	

	
	School(Integer id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	
	School() {
		
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
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}

	
	
}
