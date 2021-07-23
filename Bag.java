// Bag.java
// 2430 OOPs I Program 3
package logins;

public class Bag
{
    private final int GROW_SIZE = 10;
    private Object[] elements;
    private int numItems = 0;

    public Bag()
    {
        this.elements = new Object[10];
    }

    public Bag(int initialsize)
    {
        this.elements = new Object[initialsize];
    }

    public boolean add(Object x)
    {
        if (this.contains(x) != null)
        {
            return false;
        }
        if (this.numItems == this.elements.length)
        {
            this.grow();
        }
        this.elements[this.numItems++] = x;
        return true;
    }

    public boolean addPerson(Object x)
    {
        if (this.containsPerson(x) != null)
        {
            return false;
        }
        if (this.numItems == this.elements.length)
        {
            this.grow();
        }
        this.elements[this.numItems++] = x;
        return true;
    }

    public boolean addCourse(Object x)
    {
        if (this.containsCourse(x) != null)
        {
            return false;
        }
        if (this.numItems == this.elements.length)
        {
            this.grow();
        }
        this.elements[this.numItems++] = x;
        return true;
    }

    public void addFirst(Object x)
    {
        if (this.checkFirst(x))
        {
            this.elements[0] = x;
        }
    }

    public boolean checkFirst(Object x)
    {
        return this.elements[0] == null;
    }

    public Object contains(Object x)
    {
        int index = this.find(x);
        if (index == -1)
        {
            return null;
        }
        return this.elements[index];
    }

    public Object containsCourse(Object x)
    {
        int index = this.lookCourse(x);
        if (index == -1)
        {
            return null;
        }
        return this.elements[index];
    }

    public Object containsPerson(Object x)
    {
        int index = this.findPerson(x);
        if (index == -1)
        {
            return null;
        }
        return this.elements[index];
    }

    public boolean has(Object x)
    {
        Person y = (Person) x;
        for (int i = 0; i < this.numItems; ++i)
        {
            Person e = (Person) this.elements[i];
            if (!e.newEquals(y))
            {
                continue;
            }
            return true;
        }
        return false;
    }

    public Object findFromUsername(String username)
    {
        for (int i = 0; i < this.numItems; ++i)
        {
            Person temp = (Person) this.elements[i];
            if (!temp.getUsername().equals(username))
            {
                continue;
            }
            return temp;
        }
        return null;
    }

    public int findPerson(Object x)
    {
        Person y = (Person) x;
        for (int i = 0; i < this.numItems; ++i)
        {
            if (!y.newEquals(this.elements[i]))
            {
                continue;
            }
            return i;
        }
        return -1;
    }

    public int lookCourse(Object x)
    {
        Course y = (Course) x;
        for (int i = 0; i < this.numItems; ++i)
        {
            Course z = (Course) this.elements[i];
            if (!y.courseEquals(z))
            {
                continue;
            }
            return i;
        }
        return -1;
    }

    private int find(Object x)
    {
        for (int i = 0; i < this.numItems; ++i)
        {
            if (!x.equals(this.elements[i]))
            {
                continue;
            }
            return i;
        }
        return -1;
    }

    public boolean remove(Object x)
    {
        int index = this.find(x);
        if (index == -1)
        {
            return false;
        }
        this.elements[index] = this.elements[--this.numItems];
        this.elements[this.numItems] = null;
        return true;
    }

    private void grow()
    {
        Object[] newBag = new Object[this.elements.length + 10];
        for (int i = 0; i < this.numItems; ++i)
        {
            newBag[i] = this.elements[i];
        }
        this.elements = newBag;
    }

    public void print()
    {
        Course temp = (Course) this.elements[0];
        String tempName = temp.getCId();
        System.out.println(tempName);
    }

    public int getNumItems()
    {
        return this.numItems;
    }

    public Course getCourse(int index)
    {
        return (Course) this.elements[index];
    }

    public Object getCurrent(int index)
    {
        return this.elements[index];
    }

    public Course findCourse(String CId)
    {
        for (int i = 0; i < this.numItems; ++i)
        {
            Course temp = (Course) this.elements[i];
            if (!temp.getCId().equals(CId))
            {
                continue;
            }
            return temp;
        }
        return null;
    }

    public Student getElement(int i)
    {
        return (Student) this.elements[i];
    }
}
