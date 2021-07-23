// Administrator.java
// 2430 OOPs I Program 3
package logins;

public class Administrator extends Person
{

    public Administrator(String name, String username, String password, int role)
    {
        super(name, username, password, role);
    }

    public void register(Course crs)
    {
        crs.addToTaking(this);
    }
}
