package com.verizon.practice2;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentConnect {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// get count of students
	Integer getStudentByName() {
		String query = "select count(*) from student";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}

	// get studentnamesbyid

	String getStudentNamesById(Integer id) {
		String query = "select stu_name from student where stu_id=?";
		return jdbcTemplate.queryForObject(query, String.class, new Object[] { id });
	}

	// to print all the details in a row by id
	Student getStudentsById(Integer id) {
		String query = "select * from student where stu_id=?";
		return jdbcTemplate.queryForObject(query, new StudentMapper(), new Object[] { id });
	}

	int registerNewStudent(Student student) {
		String query = "insert into student values(?,?,?,?)";
		return jdbcTemplate.update(query,
				new Object[] { student.id(), student.name(), student.dept(), student.location() });

	}

	int updateStudentById(Student student) {
		String query = "update student set stu_name=?, stu_dept=?, stu_location=? where stu_id=?";
		return jdbcTemplate.update(query,
				new Object[] { student.name(), student.dept(), student.location(), student.id() });

	}

	int deletebyId(Integer id) {
		String query = "delete from student where stu_id=?";
		return jdbcTemplate.update(query, new Object[] { id });
	}

	class StudentMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

			Student student = new Student(rs.getInt("stu_id"), rs.getString("stu_name"), rs.getString("stu_dept"),
					rs.getString("stu_location"));
			return student;
		}

	}

}
