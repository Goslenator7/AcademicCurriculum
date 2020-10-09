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

    // This method is used to gather the information that will become the final output of the
    // program using a for loop to loop through a module, and then use method lectureDetails in Module class
    // to return lecture details to the loop.
    public String toString() {
        String output;

        output = "Diploma: "+this.getDiplomaName();

        for (Module tempModule : this.degreeModules) {
            output = output +"\n"+tempModule.getModuleName();
            output = output +"\n"+tempModule.lectureDetails(); // Calls a method in Module class to pull details from Lecture class.
        }

        return output;
    }

    // Accept output from toString method and creates output message
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
