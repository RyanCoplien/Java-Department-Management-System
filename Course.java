// Course.java
// 2430 OOPs I Program 3
package logins;

public class Course
{
    private String CId;
    private String CTitle;
    private final int MAX_COURSES = 50;
    public Bag taking;
    private Professor teacher;
    private int numTaking = 0;

    public Course(String CName, String CTitle)
    {
        this.CId = CName;
        this.CTitle = CTitle;
        this.taking = new Bag();
    }

    public String getCId()
    {
        return this.CId;
    }

    public String getCTitle()
    {
        return this.CTitle;
    }

    public void addToTaking(Person p)
    {
        this.taking.add(p);
        ++this.numTaking;
    }

    public void addTeacher(Person p)
    {
        this.teacher = (Professor) p;
    }

    public boolean hasTeacher()
    {
        return this.teacher != null;
    }

    public String getTeacher()
    {
        return this.teacher.getName();
    }

    public String getStudents(int i)
    {
        return this.taking.getElement(i).getName();
    }

    public String getStudentId(int i)
    {
        return Integer.toString(this.taking.getElement(i).getID());
    }

    public int getNumTaking()
    {
        return this.numTaking;
    }

    public void changeCId(String newCId)
    {
        this.CId = newCId;
    }

    public void changeCTitle(String newCTitle)
    {
        this.CTitle = newCTitle;
    }

    public boolean courseEquals(Course crs)
    {
        return this.CId.equals(crs.CId) && this.CTitle.equals(crs.CTitle);
    }
}
