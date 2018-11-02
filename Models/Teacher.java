package HW14.Models;

import HW14.Constants.Gender;
import HW14.Constants.Subject;

import java.util.Arrays;

public class Teacher extends Person {
    private static final int MAX_SUBJECTS = 4;
    private double salary;
    private Subject[] subjects;
    private int subjectsCount;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Subject[] getSubject() {
        return subjects;
    }

    public void setSubject(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Teacher(String name, int age, Gender gender, double salary, Subject... subjects) {
        super(name, age, gender);
        this.salary = salary;
        this.subjects = generateSubjectsArray(subjects);
    }

    private Subject[] generateSubjectsArray(Subject... subjectSequence) {
        if (subjectSequence.length > 5) {
            throw new IllegalArgumentException("Too many workload");
        }
        subjectsCount = subjectSequence.length - 1;
        Subject[] subjects = new Subject[5];
        for (int i = 0; i < subjectSequence.length; i++) {
            subjects[i] = subjectSequence[i];
        }
        return subjects;
    }

    public boolean addSubject(Subject subject) {
        if (subjectsCount < MAX_SUBJECTS) {
            subjects[++subjectsCount] = subject;
            return true;
        }
        return false;
    }

    public boolean removeSubject(Subject subject) {
        int index = Arrays.binarySearch(subjects, subject);
        if (index < 0) {
            return false;
        }

        if(index != subjectsCount) {
            subjects[index] = subjects[subjectsCount];
        }
        subjects[subjectsCount] = null;
        subjectsCount--;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" +  getName() +
                "age=" + getAge() +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", subjectsCount=" + subjectsCount +
                '}';
    }
}