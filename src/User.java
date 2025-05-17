public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("User created");
        switch (name) {
            case "John":
                System.out.println("John");
                break;
                case "Jane":


                    System.out.println("Jane");
        }
    }
}
