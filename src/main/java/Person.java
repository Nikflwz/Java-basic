public class Person {
    String firstName;
    String lastName;
    int age;

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " года.");
    }

    public static void main(String[] args) {
        Person pr = new Person();
        pr.firstName = "Никита";
        pr.lastName = "Демидович";
        pr.age = 23;

        pr.introduce();
    }

}
