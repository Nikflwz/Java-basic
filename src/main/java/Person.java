public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }

    public static void main(String[] args) {

        // Старый способ — 5 строк на один объект:
        // Person person = new Person();
        // person.firstName = "Никита";
        // person.lastName = "Демидович";
        // person.age = 23;
        // person.introduce();

        Person person1 = new Person("Никита", "Демидович", 23);
        person1.introduce();

        Person person2 = new Person("Антон", "Иванов", 33);
        person2.introduce();

        Person person3 = new Person("Олег", "Каштанов", 63);
        person3.introduce();
    }
}