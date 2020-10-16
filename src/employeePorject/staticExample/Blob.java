
package employeeProject.StaticExample;
/*
static variables - are NOT instance variables, which apply to an individual object.
they are CLASS-LEVEL variables that
apply to the entire class.
Static methods - abilities of the entire CLASS and not of 
an individual object / instance. These are run through the
class itself and not an object.
*/

public class Blob {
    private String name;
    
    public Blob(String n){
        name = n;
        
    }
    
    public String getName(){
        return name;
    }
    
    
}
