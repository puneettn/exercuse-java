public class Question5 {
    String Fn;
    String Ln;
    int age;
    String designation;
    Question5() {
    }
    Question5(String fn, String ln, int age, String desi) {
        super();
        this.Fn = fn;
        this.Ln = ln;
        this.age = age;
        this.designation = desi;
    }
    void setFn(String fn) {
        this.Fn = fn;
    }
    void setLn(String ln) {
        this.Ln = ln;
    }
    void setage(int age) {
        this.age = age;
    }
    void setDesignation(String desi) {
        this.designation = desi;
    }
    String getFname() {
        return Fn;
    }
    String getLn() {
        return Ln;
    }
    int getage() {
        return age;
    }
    String getDesignation() {
        return designation;
    }
    @Override
    public String toString() {
        return this.Fn + " " + this.Ln + " " + this.age + " " + this.designation;
    }
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        q5.setFn("Puneet");
        q5.setLn("Kataria");
        q5.setage(22);
        q5.setDesignation("JVM");
        System.out.println(q5.toString());
        q5.setFn("Sumit");
        q5.setLn("Malik");
        q5.setage(35);
        q5.setDesignation("SoftwareEngineer");
        System.out.println(q5.toString());
    }
}