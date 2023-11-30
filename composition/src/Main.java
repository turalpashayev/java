public class Main {

    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Ali");
        std.setDateOfBirth("01-may-2000");
        std.setStudentHouse(false);
        std.setCourse(new Course());
        std.getCourse().setLevel("BS");
        std.getCourse().setTitle("Computer Science");
        std.getCourse().setStartDate("01-jan-2020");
        Course c = std.getCourse();
        System.out.println(c.getTitle());

        System.out.println(std.getName() + " date of birth on " + std.getDateOfBirth() + " has a house: " + (std.getStudentHouse() ? "yes" : "no"));
        System.out.println(std.getCourse().getLevel() + " " + std.getCourse().getTitle()+ " " + std.getCourse().getStartDate());

    }
}
