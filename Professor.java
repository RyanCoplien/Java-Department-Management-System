// Professor.java
// 2430 OOPs I Program 3
package logins;

public class Professor extends Person
{
    private int numProfs = 0;

    public Professor(String name, String username, String password, int role)
    {
        super(name, username, password, role);
    }

    public void register(Course crs)
    {
        crs.addTeacher(this);
    }
}
