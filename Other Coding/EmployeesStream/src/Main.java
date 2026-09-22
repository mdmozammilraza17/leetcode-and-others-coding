import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employees
{
    private int id;
    private String name;
    private String gender;

    public Employees(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Main
{
    public static void main(String[] args)
    {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(200, "Mozammil", "male"));
        employees.add(new Employees(100, "Anjela", "female"));
        employees.add(new Employees(20, "Abhay", "male"));
        employees.add(new Employees(10, "Zainab", "female"));

        List<String> males  = employees.stream().filter(e -> e.getGender()
                .equals("male")).map(Employees::getName).collect(Collectors.toList());
        System.out.println(males);

    }
}