package task2;

import java.util.ArrayList;

public class Course {
	private String title;
	private String description;
	private Student[] students;
	
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
    public ArrayList<Student> filterYear(int year) {
    	ArrayList<Student> filterStudent = new ArrayList<>();
    	
    	for(Student student : students) {
    		if(student.getYear() == year) {
    			filterStudent.add(student);
    		}
    	}
    	return filterStudent;
	}
}
