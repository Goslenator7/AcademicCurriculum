public class DemoDiploma {
    public static void main(String[] args) {

        // Create diploma object from Diploma class
        Diploma diploma1 = new Diploma("MSc Computing");

        // Create module objects which will be included in ArrayList in Diploma class
        Module module1 = new Module("Software Development 1");
        Module module2 = new Module("Web Design & Development");
        Module module3 = new Module("Design Dialogues");
        Module module4 = new Module("Software Development 2");
        Module module5 = new Module("Programming for the Web");
        Module module6 = new Module("User Experience and Service Design");

        // Create lecture objects which will be in ArrayList in module class, which is in turn an
        // ArrayList in diploma object
        Lecture l1 = new Lecture("Java variables", 1);
        Lecture l2 = new Lecture("Classes", 2);
        Lecture l3 = new Lecture("Methods", 3);
        Lecture l4 = new Lecture("Arrays", 4);
        Lecture l5 = new Lecture("Collections", 5);
        Lecture l6 = new Lecture("Associations", 6);

        Lecture l7 = new Lecture("HTML & CSS", 1);
        Lecture l8 = new Lecture("Positioning", 2);
        Lecture l9 = new Lecture("User Input", 3);
        Lecture l10 = new Lecture("Bootstrap", 4);
        Lecture l11 = new Lecture("Databases & CRUD", 5);
        Lecture l12 = new Lecture("Javascript", 6);

        // Add module objects to diploma
        diploma1.addModule(module1);
        diploma1.addModule(module2);

        // add lectures to modules to be added to diploma
        module1.addLecture(l1);
        module1.addLecture(l2);
        module1.addLecture(l3);
        module1.addLecture(l4);
        module1.addLecture(l5);
        module1.addLecture(l6);

        module2.addLecture(l7);
        module2.addLecture(l8);
        module2.addLecture(l9);
        module2.addLecture(l10);
        module2.addLecture(l11);
        module2.addLecture(l12);

        // Call display details method on diploma
        diploma1.displayDetails();
    }
}
