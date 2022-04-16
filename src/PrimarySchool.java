public class PrimarySchool extends School {
    private String nameOfSchool;
    private int amountOfStudents;
    private String schedule;

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public String getSchedule() {
        return schedule;
    }


    @Override
    void getAmountOfClasses() {

    }

    @Override
    String getAddress() {
        return null;
    }

    @Override
    int getStudents() {
        return 0;
    }

    @Override
    boolean isThereLibrary() {
        return false;
    }
}
