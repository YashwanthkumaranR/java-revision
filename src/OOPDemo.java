public class OOPDemo{
    public static void main(String args[]){
        Student stu = new Student("Yash",22,98);
        System.out.println("Name: " + stu.getName()+ ", Age: "+stu.getAge()+ ", Mark: "+ stu.getMarks());
        Animal dog = new Dog();
        System.out.println(dog.makeSound());

        Animal cat = new Cat();
        System.out.println(cat.makeSound());
    }
}

class Student {

    private String name;
    private int age;
    private int marks;

    Student(String name,int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
}

class Animal{
    public  String makeSound(){
        return "Animal sound";
    }
}


class Dog extends Animal{
    @Override
    public  String makeSound(){
        return "Bark";
    }
}

class Cat extends Animal{
    @Override
    public  String makeSound(){
        return "meow";
    }
}