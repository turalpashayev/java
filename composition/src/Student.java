public class Student {
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHouse;
    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getStudentHouse() {
        return hasStudentHouse;
    }

    public void setStudentHouse(boolean hasStudentHouse) {
        this.hasStudentHouse = hasStudentHouse;
    }

    public Course getCourse(){
        return course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

}
