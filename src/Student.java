public class Student extends Person {
    private Section[] section = new Section[50];
    private int grade;
    private int sectionCount = 0;

    public int getGrade() {
        return grade;
    }

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addSection(Section s) {
        section[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections() {
        return section;
    }

    public String toString() {
        String o = "";
        for (int i = 0; i < sectionCount; i++) {
            o += section[i].getName() + " is taught by " + section[i].getTeacher();
        }
        return name + " is in " + grade + " grade and is enrolled in the following sections: " + o;
    }
}
//    public Student(String name, Section[] section) {
//        super(name);
//        this.section = section;
//    }
