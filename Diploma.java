import javax.swing.*;
import java.util.ArrayList;

public class Diploma {

    private String diplomaName;
    private ArrayList<Module> degreeModules = new ArrayList<Module>();

    // Constructor
    public Diploma(String diplomaName) {
        setDiplomaName(diplomaName);
    }

    // Add module to list of modules
    public void addModule(Module module) {
        this.degreeModules.add(module);
    }

    public String toString() {
        String output;

        output = "Diploma: "+this.getDiplomaName();

        for (Module tempModule : this.degreeModules) {
            output = output +"\n"+tempModule.getModuleName();
            output = output +"\n"+tempModule.lectureDetails(); // Watch out for this
        }

        return output;
    }

    public void displayDetails() {
        String output;

        output = toString();
        JOptionPane.showMessageDialog(null, output);
    }

    // Getters and Setters
    public String getDiplomaName() {
        return this.diplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }
}
