public class Person {
   
    private String name;
    private int  age;
    private double weight;
    private double height;
    private double BMI;
    private String gender;

    public Person(String name, int age, double weight, double height, double BMI, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person" + "\nName:" + name + 
                "\nAge:" + age + "\nWeight:" + weight + "\nHeight:" + height + 
                "\nBMI:" + BMI + "\nGender:" + gender;
    } 
}
