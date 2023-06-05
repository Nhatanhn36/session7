package StudentManage;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private String studentImg;

    public Student(String firstName, String lastName, String email, String studentImg){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentImg = studentImg;
    }

    public Student(int id ,String firstName, String lastName, String email, String studentImg){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentImg = studentImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(String studentImg) {
        this.studentImg = studentImg;
    }

    @Override
    public String toString() {
        return "Student [Id= " + id + ", First name= " + firstName + ", Last name= " + lastName + ", Email= " + email + "]";
    }
}
