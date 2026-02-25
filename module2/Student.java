public class Student {
    String name;
    int age;
    public Student() {
        name = "Unknown";
        age = 0;
    }
    public Student(String studName, int studAge) {
        name = studName;
        age = studAge;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
    }
}