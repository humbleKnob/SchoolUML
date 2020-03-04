import java.util.Arrays;

public class School {
    public String name;
    private int sectionCount = 0;
    private Section[] sections = new Section[200];

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }


    public Section[] getSections(){
        return sections;
    }

    public String toString() {
        return "The school named " + name + " has " + sectionCount + " sections.";
    }
}