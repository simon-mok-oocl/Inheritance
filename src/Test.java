public class Test {
    public static void main(String argv[])
    {
        Felidae tigger = new Felidae(1 , 2);

        tigger.setAge(2);
        tigger.setWeight(3);

        System.out.println(tigger.getAge() + " " + tigger.getWeight());
        tigger.eating();
        tigger.running();
        tigger.meow();
    }
}
