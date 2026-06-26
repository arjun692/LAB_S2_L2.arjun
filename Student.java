public class Student {
    public int study_time;
    public String school;

    public Student(int study_time, String school) {

        this.study_time = study_time;
        this.school = school;
    }

    public Student (String school){

        this.school = school;
    }

    public void setStudytime(int study_time) {

        this.study_time = (study_time < 0) ? study_time : 0;

    }
    public void setschool(String school){

        this.school = school;
    }
    public int getStudyTime() {
        return study_time;
    }

    public String getsSchool(){

        return school;
    }

}
