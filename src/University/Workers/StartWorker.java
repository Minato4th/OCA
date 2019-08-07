package University.Workers;

import java.util.Arrays;
import java.util.List;

interface Employees {

    String getName();

    Long getAge();

    String getPosition();
}

abstract class Managers implements Employees {

    private String position = "Manager";

    protected String name;

    protected Long age;

    protected String officePlace = "Near Window";

    abstract String getOfficePlace();

    public String getPosition() {
        return position + " - ";
    }
}

abstract class Workers implements Employees {

    private String position = "Worker";

    protected String name;

    protected Long age;

    protected String workingDays = "Monday, Wednesday";

    abstract String getWorkingDays();

    public String getPosition() {
        return position + " - ";
    }
}

class Director extends Managers {

    private Boolean isOwner = true;

    public Boolean getOwner() {
        return isOwner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String getOfficePlace() {
        return officePlace;
    }

    @Override
    public String getPosition() {
        return super.getPosition() + "Director";
    }

    @Override
    public String toString() {
        return "Director{" +
                "officePlace='" + officePlace + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isOwner=" + isOwner +
                '}';
    }
}

class ChiefAccountant extends Managers {

    private long experienceYears;

    public long getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(long experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String getOfficePlace() {
        return officePlace;
    }

    @Override
    public String getPosition() {
        return super.getPosition() + "Chief Accountant";
    }

    @Override
    public String toString() {
        return "ChiefAccountant{" +
                "officePlace='" + officePlace + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experienceYears=" + experienceYears +
                '}';
    }
}

class Waiter extends Workers {

    private Long tips;

    public Long getTips() {
        return tips;
    }

    public void setTips(Long tips) {
        this.tips = tips;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    @Override
    public String getWorkingDays() {
        return workingDays;
    }

    @Override
    public String getPosition() {
        return super.getPosition() + "Waiter";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "workingDays='" + workingDays + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tips=" + tips +
                '}';
    }
}

class Cook extends Workers {

    private List<String> recipes;

    public List<String> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<String> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    @Override
    public String getWorkingDays() {
        return workingDays;
    }

    @Override
    public String getPosition() {
        return super.getPosition() + "Cook";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "workingDays='" + workingDays + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", recipes=" + recipes +
                '}';
    }
}

class Driver implements Employees {

    private String name;

    private Long age;

    private String position = "none";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAge() {
        return age;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}

public class StartWorker {

    private static Director director = new Director();

    private static ChiefAccountant chiefAccountant = new ChiefAccountant();

    private static Waiter waiter = new Waiter();

    private static Cook cook = new Cook();

    private static Driver driver = new Driver();

    public static void main(String[] args) {

        populateData();
        System.out.println(director);
        System.out.println(chiefAccountant);
        System.out.println(waiter);
        System.out.println(cook);
        System.out.println(driver);
    }

    private static void populateData() {
        director.setAge(68L);
        director.setName("King");

        chiefAccountant.setAge(49L);
        chiefAccountant.setExperienceYears(23L);
        chiefAccountant.setName("Money");
        chiefAccountant.officePlace = "Near Director";

        waiter.setAge(21L);
        waiter.setName("Best");
        waiter.setTips(23L);

        cook.setAge(32L);
        cook.setName("Lasagna");
        cook.setRecipes(Arrays.asList("Noodles", "Lasagna", "Coffee"));

        driver.setAge(452L);
        driver.setName("BMW");
    }
}


class Some {

    int a = 10;

    public static void main(String[] args) {
        Some some = new Some();
        some.a = 10;
    }
}
