package Student;

public class Course {

    public String courseName;
    public int number;
    public String teacherName;
    public Group[] groups;

    public Course() {

    }

    public Course(String courseName, int number, String teacherName, Group[] groups) {
        this.courseName = courseName;
        this.number = number;
        this.teacherName = teacherName;
        this.groups = groups;
    }

    void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    String getCourseName() {
        return courseName;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    String getTeacherName() {
        return teacherName;
    }

    public void changeIn(Group[] groups) {
        for (Group group : groups) {
            group.getIn();

        }
    }
    public void changeInformation(){
        System.out.printf("""
                Course name: %s
                Number: %s
                Teacher name: %s
               
                """,courseName,number,teacherName);
    }
}
