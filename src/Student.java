public class Student {
    private int studId;
    private String studName;
    private String studSurname;
    private static int studIdUnique = 0;

    public Student(String studName, String studSurname){
        this.studId = ++studIdUnique;
        this.studName = studName;
        this.studSurname = studSurname;
    }


    public int getStudId() {
        return studId;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudSurname() {
        return studSurname;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudSurname(String studSurname) {
        this.studSurname = studSurname;
    }
}
