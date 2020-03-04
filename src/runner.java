public class runner {

    public static void main(String[] args) {

        School berkeleyHigh = new School("Berkeley High");
        Section math = new Section("Math");
        Section compSci = new Section("Computer Science");
        Section biology = new Section("Biology");

        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher mueller = new Teacher("Mueller", "Biology");
        Teacher albrecht = new Teacher("Albrecht", "Math");

        Student humble = new Student("Humble", 11);
        Student afraz = new Student("Afraz", 9);
        Student finn = new Student("Finn", 10);
        Student anna = new Student("Anna", 12);
        Student lyndon = new Student("Lyndon", 9);
        Student zephyr = new Student("Zephyr", 10);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(compSci);
        berkeleyHigh.addSection(biology);

        math.setTeacher(albrecht);
        compSci.setTeacher(albinson);
        biology.setTeacher(mueller);

        humble.addSection(math);
        afraz.addSection(math);
        finn.addSection(compSci);
        anna.addSection(compSci);
        lyndon.addSection(biology);
        zephyr.addSection(biology);

        albrecht.addSection(math);
        albinson.addSection(compSci);
        mueller.addSection(biology);

        math.addStudent(humble);
        math.addStudent(afraz);
        compSci.addStudent(finn);
        compSci.addStudent(anna);
        biology.addStudent(lyndon);
        biology.addStudent(zephyr);

        System.out.println(berkeleyHigh.toString());
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSci.toString());
        System.out.println(albinson.toString());
        System.out.println(mueller.toString());
        System.out.println(albrecht.toString());
        System.out.println(humble.toString());
        System.out.println(afraz.toString());
        System.out.println(finn.toString());
        System.out.println(anna.toString());
        System.out.println(lyndon.toString());
        System.out.println(zephyr.toString());
    }
}