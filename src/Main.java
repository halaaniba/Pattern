//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){
        Person person1 = new Person.Builder("Mario", "Rossi")
                .age(30)
                .address("Via Roma, 123")
                .build();

        Person person2 = new Person.Builder("Carla", "Bianchi")
                .age(25)
                .build();

        System.out.println("Persona 1: " + person1.getFirstName() + " " + person1.getLastName() + ", " + person1.getAge() + " anni, " + person1.getAddress());
        System.out.println("Persona 2: " + person2.getFirstName() + " " + person2.getLastName() + ", " + person2.getAge() + " anni");
}}