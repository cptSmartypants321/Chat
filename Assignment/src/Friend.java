

public class Friend {

    private String name;
    private int id;

    public Friend(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return "Name: " + name + "\nID: " + id;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Friend))
        {
            return false;
        }

        Friend other = (Friend) obj;

        return name.equalsIgnoreCase(other.getName()) && id == other.getId();
    }
}
