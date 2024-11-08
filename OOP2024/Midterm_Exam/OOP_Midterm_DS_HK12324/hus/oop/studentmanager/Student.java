package hus.oop.studentmanager;

public class Student implements MyStudentComparable {
    private String id;
    private String lastname;
    private String firstname;
    private int yearOfBirth;
    private double mathsGrade;
    private double physicsGrade;
    private double chemistryGrade;

    private Student() {}

    public static class StudentBuilder {
        private String id;
        private String lastname;
        private String firstname;
        private int yearOfBirth;
        private double mathsGrade;
        private double physicsGrade;
        private double chemistryGrade;

        public StudentBuilder(String id) {
            this.id = id;
        }

        public StudentBuilder withLastname(String lastname) {
            /* TODO */
        }

        public StudentBuilder withFirstname(String firstname) {
            /* TODO */
        }

        public StudentBuilder withYearOfBirth(int yearOfBirth) {
            /* TODO */
        }

        public StudentBuilder withMathsGrade(double mathsGrade) {
            /* TODO */
        }

        public StudentBuilder withPhysicsGrade(double physicsGrade) {
            /* TODO */
        }

        public StudentBuilder withChemistryGrade(double chemistryGrade) {
            /* TODO */
        }

        public Student build() {
            Student student = new Student();
            student.id = this.id;
            student.lastname = this.lastname;
            student.firstname = this.firstname;
            student.yearOfBirth = this.yearOfBirth;
            student.mathsGrade = this.mathsGrade;
            student.physicsGrade = this.physicsGrade;
            student.chemistryGrade = this.chemistryGrade;
            return student;
        }
    }

    public String getId() {
        /* TODO */
    }

    public String getLastname() {
        /* TODO */
    }

    public String getFirstname() {
        /* TODO */
    }

    public int getYearOfBirth() {
        /* TODO */
    }

    public double getMathsGrade() {
        /* TODO */
    }

    public double getPhysicsGrade() {
        /* TODO */
    }

    public double getChemistryGrade() {
        /* TODO */
    }

    public double getAverageGrade() {
        /* TODO */
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", mathsGrade=" + mathsGrade +
                ", physicsGrade=" + physicsGrade +
                ", chemistryGrade=" + chemistryGrade +
                '}';
    }

    /**
     * Phương thức đưa ra tiêu chí so sánh 2 đối tượng kiểu Student sao cho
     * thứ tự tăng dần theo tên và sau đó đến họ.
     * @param another
     * @return
     */
    @Override
    public int compareTo(Student another) {
        /* TODO */
    }
}
