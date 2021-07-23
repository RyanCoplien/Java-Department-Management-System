// Person.java
// 2430 OOPs I Program 3
package logins;

public abstract class Person
{
    private static int numPeople;

    private String name;
    private int id = 10000;
    private int role;
    private String username;
    private String password;

    public Person(String name, String username, String password, int role)
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.id += numPeople;
        ++numPeople;
    }

    public String getName()
    {
        return this.name;
    }

    public int getID()
    {
        return this.id;
    }

    public String getRole()
    {
        if (this.role == 1)
        {
            return "Student";
        }
        if (this.role == 2)
        {
            return "Professor";
        }
        if (this.role == 3)
        {
            return "Administrator";
        }
        return "Error";
    }

    public int getRoleNum()
    {
        return this.role;
    }

    public boolean newEquals(Object p)
    {
        Person temp = (Person) p;
        return this.username.equals(temp.username) && this.password.equals(
                temp.password);
    }

    public String getUsername()
    {
        return this.username;
    }
}
