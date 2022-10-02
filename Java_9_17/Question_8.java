package Java_9_17;

class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Resource created");
    }

    public void display() {
        System.out.println("Resource displayed");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource close method invoked");
    }
}
public class Question_8 {
    //Demonstrate the use AutoCloseable
    public static void main(String[] args) throws Exception {

        Resource resource = new Resource();
        try (resource){
            resource.display();
        }
    }
}