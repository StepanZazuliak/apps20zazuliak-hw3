package ua.edu.ucu;


import java.util.Objects;

class Student {

    private final double gpa;
    private final int year;
    private final String name;
    private final String surname;

    public Student(String name, String surname, double gpa, int year) {

        this.gpa = gpa;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public int getYear() {

        return year;
    }

    public double getGPA() {

        return gpa;
    }

    public String getSurname() {

        return surname;
    }

    public String getName() {

        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {

            return true;
        }

        if (o == null || getClass() != o.getClass()) {

            return false;
        }

        Student student = (Student) o;

        return Double.compare(student.gpa, gpa) == 0 && year == student.year && name.equals(student.name) && surname.equals(student.surname);
    }

    @Override
    public String toString() {

        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + gpa + ", year=" + year + '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(gpa, year, name, surname);
    }
}
