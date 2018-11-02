package HW14;

import HW14.Constants.Gender;
import HW14.Constants.Major;
import HW14.Constants.Subject;
import HW14.Models.CollegeStudent;
import HW14.Models.Person;
import HW14.Models.Student;
import HW14.Models.Teacher;

public class Main {
    public static void main(String[] args) {
        Student oleh = new Student("oleh", 20, Gender.FEMALE, "QWE1234", 4.5);
        Student anna = new Student("anna", 21, Gender.FEMALE, "QWE1224", 2.5);
        Teacher vasyaMikhalych = new Teacher("Vasiliy", 42, Gender.MALE, 4.960, Subject.CHEMISTRY, Subject.OTHER);
        Student petr = new CollegeStudent("Petr", 22, Gender.MALE, "QWE1222", 3.8, 3, Major.ELECTRICAL_ENGINEERING);

        Person[] persons = {oleh, anna, vasyaMikhalych, petr};
        personPrinter(persons);

        //Negative scenarios
        /*
        Student kirill = new Student("Kirill", 228, Gender.MALE, "QWE1337", 4.8); // - age
        Teacher someBadMan = new Teacher("Pork", 37, Gender.MALE, 3.900, null); // - Subjects = null
        Student kirill = new Student("Kirill", 22, Gender.MALE, "QWERTY1337", 4.8);// - idNumber
        */
        Student kirill = new CollegeStudent("Kirill", 22, Gender.MALE, "QWE1337", 5.2, 3, Major.COMMUNICATIONS);

    }

    private static void personPrinter(Person[] persons) {
        for(Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
