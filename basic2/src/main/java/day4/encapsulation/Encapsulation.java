package day4.encapsulation;

public class Encapsulation {
    private String name;
    private int age;
    private String schoolName;
    private int grade;
    // 생성자 단축기 cmd + N
    public Encapsulation(String name,
                         int age,
                         String schoolName,
                         int grade) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return this.name;
    }

}
