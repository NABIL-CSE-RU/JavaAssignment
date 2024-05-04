public class Person {
    private string name;
    private int age ;

    public void setName(string name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public string getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        name ="CSE";
        age = 20;
        public Person(string name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}
