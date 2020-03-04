public class Teacher extends Person {
    private Section[] section = new Section[10];
    private int sectionCount = 0;
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){ this.subject = subject; }

    public void addSection(Section s){
        section[sectionCount] = s;
        sectionCount++;
    }
    public Section[] getSections(){
        return section;
    }

    public String toString(){
        String o = "";
        for (int i = 0; i < sectionCount; i++) {
            o += section[i].getName() + " ";
        }
        return getName() + " teaches the following sections " + o;
    }
}
