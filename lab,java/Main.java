public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("James", "Gostling", "0987564");
        Student std2 = new Student("Dennis", "Ritchie", "12345664");

        std1.setGrade(18);;
        std2.setGrade(17.5);

        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab lb = new Lab("Mr.Smith", "Monday", 30);
        lb.printLabInfo();

    }
}