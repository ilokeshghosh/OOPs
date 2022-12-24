class Student0{
    String name;
    static String school;
    public static void changeSchool(){
        school="newshool";
    }

}
public class Static_keywords {
    public static void main(String[] args){

        //If we use static , we can initialize without creating object
        Student0.school="LMET International School";
        System.out.println(Student0.school);


        Student0 student1=new Student0();
        student1.name="Lokesh Ghosh";


    }
}
