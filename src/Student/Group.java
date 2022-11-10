package Student;

public class Group {

    public String lesson;
    public int data;
    public Student1[] student1s;

    public Group() {

    }

    public Group(String lesson, int data, Student1[] student1s) {
        this.lesson = lesson;
        this.data = data;
        this.student1s = student1s;
    }

    public void getLesson() {
        System.out.println(lesson);
    }

    public void getData() {
        System.out.println(data);
    }

    public void getget(Student1[] student1s) {
        for (Student1 student : student1s) {
            student.year = 2022 - student.year;
            student.getInfo();


        }
    }

    public void getIn() {
        System.out.printf("""
                Lesson: %s
                Data: %s
                """, lesson, data);
    }


}
