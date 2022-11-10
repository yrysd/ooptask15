package Student;

public class Student1 {
    public String name1;
    public String sureName;
    public int year;
    public String email1;


    public Student1() {

    }

    public Student1(String name1, String sureName, int year, String email1) {
        this.name1 = name1;
        this.sureName = sureName;
        this.year = year;
        this.email1 = email1;
    }

    void setName1(String name1) {
        this.name1 = name1;
    }

    String getName1() {
        return name1;
    }

    void setSureName1(String sureName1) {
        this.name1 = name1;
    }

    String getSureName1() {
        return sureName;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    void setEmail1(String email1) {
        this.email1 = email1;
    }

    String getEmail1() {
        return email1;
    }

    public void getInfo() {
        System.out.printf("""
                Name: %s
                Sure name: %s
                age: %s
                Email: %s
                """, getName1(), getSureName1(), getYear(), getEmail1());
    }
}
