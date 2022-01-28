
public class Student {
	
	
	String name,lastName;
	float grade;
	boolean attendance;
	
	
	public boolean isAttendance() {
		return attendance;
	}
	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public float getGrade() {
		return grade;
	}
	
	public String toString(){
		
 		return name + " " + lastName + " " + grade + " " + attendance;
	}
	public Student(String name, String lastName, float grade) {
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		attendance=false;
	}
	
	
	


	
	
}
