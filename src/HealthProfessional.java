public class HealthProfessional {
    private int id;
    private String name;
    private int age;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.age =0 ;
    }

    public HealthProfessional(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printInformation()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
}
