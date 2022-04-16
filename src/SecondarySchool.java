public class SecondarySchool extends School {
    private String nameOfSchool;
    private int amountOfStudents;
    private String schedule;


    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
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
