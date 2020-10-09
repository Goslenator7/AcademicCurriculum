import java.util.ArrayList;

public class Module {

    private String moduleName;
    private ArrayList<Lecture> moduleLectures = new ArrayList<Lecture>();

    // Constructor
    public Module(String moduleName) {
        setModuleName(moduleName);
    }

    // Called from Diploma class to loop through moduleLectures list and return info about lectures.
    // This output is then used in the toString method in Diploma class.
    public String lectureDetails() {
        String output = "";

        for (Lecture tempLecture : this.moduleLectures) {
            output = output + "Week "+tempLecture.getWeekNumber()+" -\t"+tempLecture.getLectureTitle()+"\n";
        }
        return output;
    }

    // Add lecture to list of lectures
    public void addLecture(Lecture lecture) {
        this.moduleLectures.add(lecture);
    }

    // Getters and setters
    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }


}
