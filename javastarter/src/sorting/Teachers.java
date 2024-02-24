//package sorting;
//
//record Teachers(Integer teacher_id, String teacher_name, String teacher_dept, String teacher_location)  {
//	
//}
//
//
//
package sorting;

public class Teachers implements Comparable{
	private Integer teacher_id;
	private String teacher_name;
	private String teacher_dept;
	private String teacher_location;
	
	public Teachers() {
		
	}
	
	
	public Teachers(Integer teacher_id, String teacher_name, String teacher_dept, String teacher_location) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_dept = teacher_dept;
		this.teacher_location = teacher_location;
	}


	@Override
	public String toString() {
		return "Teachers [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_dept="
				+ teacher_dept + ", teacher_location=" + teacher_location + "]";
	}
	
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_dept() {
		return teacher_dept;
	}
	public void setTeacher_dept(String teacher_dept) {
		this.teacher_dept = teacher_dept;
	}
	public String getTeacher_location() {
		return teacher_location;
	}
	public void setTeacher_location(String teacher_location) {
		this.teacher_location = teacher_location;
	}


	@Override
	public int compareTo(Object teach) {
		
		return this.getTeacher_id().compareTo(((Teachers) teach).getTeacher_id());
	}
	
	
}