
package employeeProject.StaticExample;


public class BlobMaker {

  
    public static void main(String[] args) {
        Blob a, b, c;
        a = new Blob("Joey");
        b = new Blob("Franky");
        c = new Blob ("Yeet");
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }
    
}
