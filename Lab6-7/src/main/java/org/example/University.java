package org.example;

public class University {
    private String name;
    private int studentsCount;
    private int faculties;
    private static int totalUniversities = 0;
    private static int totalStudents = 0;

    public String getName() {
        return name;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public int getFaculties() {
        return faculties;
    }

    public static int getTotalUniversities() {
        return totalUniversities;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public void setFaculties(int faculties) {
        this.faculties = faculties;
    }

    public University(String name, int studentsCount, int faculties){
        this.name = name;
        this.studentsCount = studentsCount;
        this.faculties = faculties;
        totalUniversities++;
        totalStudents += studentsCount;
    }

    public static double getAverageStudents() {
        return (double) totalStudents / totalUniversities;
    }

    public String toString() {
        return "Университет: " + name + " Студентов: " + studentsCount + " Факультетов: " + faculties;
    }
}
