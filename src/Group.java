import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student starosta;
    private List<Student> listOfStudents = new ArrayList<>();
    private List<String> listOfTasks = new ArrayList<>();

    public Student getStarosta() {
        return starosta;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public List<String> getListOfTasks() {
        return listOfTasks;
    }
    public Group (Student starosta) {
        this.starosta = starosta;
    }

    public void changeStarosta (Student newStarosta){
        this.starosta = newStarosta;

    }
    public void addStudent (Student newStudent){
        listOfStudents.add(newStudent);
//        listOfStudents.add(Student.getUniqueId(),newStudent);
//        System.out.println("New student is added to the group: " + Student.getUniqueId()+ newStudent.getStudId() + " " + newStudent.getStudName() + " " + newStudent.getStudSurname());
    }

    public void removeStudent (Student removedStudent){
        listOfStudents.remove(removedStudent);
    }
    public void addTask (String newTask){
        listOfTasks.add(newTask);
    }


}
