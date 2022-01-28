import javax.swing.JOptionPane;

public class DataBase {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		int currentStudent = 0;
		
		int choice = 0;
		
		do {
			System.out.println("These are your choices:");
			System.out.println("1. Add a student");
			System.out.println("2. Edit student");
			System.out.println("3. Find a student");
			System.out.println("4. Delete student");
			System.out.println("5. Call roll");
			System.out.println("6. Display students");
			System.out.println("7. Exit");
			
			String input = JOptionPane.showInputDialog("Write your choice: ");
			choice = Integer.parseInt(input);
			
			switch(choice) {
			case 1:
				
				String name = JOptionPane.showInputDialog("Write the name:" );
				String lastName = JOptionPane.showInputDialog("Write the last name: ");
				float grade = Float.parseFloat(JOptionPane.showInputDialog("Write the grade:" ));
				
				students[currentStudent]= new Student(name, lastName, grade);
				currentStudent++;
				
				if (currentStudent ==students.length)
					currentStudent = 0;
				
				currentStudent %= students.length;
				
				break;
			case 2:
				int index =Integer.parseInt(JOptionPane.showInputDialog("Give me the student's index"));
				String name1 = JOptionPane.showInputDialog("Write the name:" );
				String lastName1 = JOptionPane.showInputDialog("Write the last name: ");
				float grade1 = Float.parseFloat(JOptionPane.showInputDialog("Write the grade:" ));
				students[index]= new Student(name1, lastName1, grade1);
				
				break;
			case 3:
				String name3 = JOptionPane.showInputDialog("Write the name:");
				for (int i=0; i<currentStudent; i++) {
					if (name3.equals(students[i].getName())) {
						System.out.println(students[i].getGrade());
						break;
					}
				}
				break;
			case 4:
				int index4 =Integer.parseInt(JOptionPane.showInputDialog("Give me the student's index"));
				if(index4==students.length - 1) {
					students[index4]=null;
					currentStudent=index4;
				} else {
					for(int i=index4; i<students.length-1; i++) {
						students[i]=students[i+1];
					}
					students[currentStudent]=null;
					currentStudent--;
					
				}
				break;
			case 5:
				for (int i=0;i<currentStudent; i++) {
					boolean attendance= Boolean.parseBoolean(JOptionPane.showInputDialog("Is "+students[i].getName()+" here?"));
					students[i].setAttendance(attendance);
				}
				break;
			case 6:
				Student s= students[0];
				int i=0;
				
				while(s!=null) {
					System.out.println(s);
					i++;
					s=students[i];
				}
				break;
			}
		}
		
		while (choice != 7);
	}
	

}
