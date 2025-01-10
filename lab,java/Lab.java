public class Lab {

    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxsize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxsize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxsize = maxsize;
        students = new Student[maxsize];
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void printLabInfo() {
        System.out.println("Teacher's Name : " +getTeacherName()
        +"\nDay Of Week: " + getDayOfWeek()
        +"\nmaxSize: "+getMaxsize());
    }
}
