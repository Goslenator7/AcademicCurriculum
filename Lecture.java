public class Lecture {

    private String lectureTitle;
    private int weekNumber;

    // Constructor
    public Lecture(String lectureTitle, int weekNumber) {
        setLectureTitle(lectureTitle);
        setWeekNumber(weekNumber);
    }


    // Getters and setters
    public String getLectureTitle() {
        return this.lectureTitle;
    }

    public int getWeekNumber() {
        return this.weekNumber;
    }

    public void setLectureTitle(String lectureTitle) {
        this.lectureTitle = lectureTitle;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

}
