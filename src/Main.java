public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Ivan", "Ivanov");
        Student stud2 = new Student("Petr", "Ivanov");
        Student stud3 = new Student("Oleksandr", "Sydorov");
        Student stud4 = new Student("Andrii", "Petrov");
        Student stud5 = new Student("Olha", "Poliakova");


        Group group1 = new Group(stud1);
        System.out.println("The head of the group: " + group1.getStarosta().getStudName());


        group1.changeStarosta(stud2);
        System.out.println("The new head of the group: " + group1.getStarosta().getStudName());


        group1.addStudent(stud1);
        group1.addStudent(stud2);
        group1.addStudent(stud3);
        group1.addStudent(stud4);
        group1.addStudent(stud3);
        group1.addStudent(stud5);
        System.out.println("The list of students on the group: ");
        for (Student newStudent: group1.getListOfStudents()
             ) {
            System.out.println(newStudent.getStudId() + " " + newStudent.getStudName() + " " + newStudent.getStudSurname());
        }

        group1.removeStudent(stud2);
        group1.removeStudent(stud3);
        System.out.println("The new list of students on the group after removing student: ");
        for (Student newStudent: group1.getListOfStudents()
        ) {
            System.out.println(newStudent.getStudId() + " " + newStudent.getStudName() + " " + newStudent.getStudSurname());
        }


        group1.addTask("Вивчити інкапсуляцію");
        group1.addTask("Вивчити поліморфізм");
        System.out.println("The list of tasks for the group: ");
        System.out.println(group1.getListOfTasks());

    }
}