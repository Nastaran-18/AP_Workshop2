public class Student {

    private String firstname;
    private String lastname;
    private String id;
    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;

        grade = 0;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printStudentInfo() {
        System.out.println(firstname + " " +lastname
                          +"\nID: "+ id + "\nGRADE: "+grade);
    }
}
