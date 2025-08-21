public class Person {
    private String name;
    private int age;

    public Person(String name ,  int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : "+name+" age : "+age);
    }
    public static void main(String[] args) {
        Person p= new Person("Pratibha", 21);

        p.display();
    }
}
