package task2;

import java.util.Objects;

public class Student {
	private String name;
	private Integer year;
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

	@Override
	public String toString() {
		return "["+ name + ", " + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
        Student student = (Student) obj;
        return Objects.equals(name, student.name) &&
                Objects.equals(year, student.year);
	}
	
}
