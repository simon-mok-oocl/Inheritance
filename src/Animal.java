public class Animal {
    private int age, weight;

    public Animal(int age, int weight)
    {
        this.age = age;
        this. weight = weight;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void running()
    {
        System.out.println("animal running");
    }

    public void eating()
    {
        System.out.println("animal eating");
    }
}
