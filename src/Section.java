public class Section {
    public String name;
    private Teacher teacher;
    private Student[] students = new Student[50];
    private int currentSize = 0;

    public Section(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() { return teacher; }

    public void setTeacher(Teacher t) { this.teacher = t;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students[currentSize] = s;
        currentSize++;
    }

    public Section(String name) {
        this.name = name;
    }

    public Section(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String toString() {
        String o = "";
        for (int i = 0; i < currentSize; i++) {
            o += students[i].getName() + " ";
        }
        return name + " is taught by " + getTeacher() + " and has " + currentSize + " students: " + o;
    }
}
