package ZOO;

public class Dog extends Animal {
    public Dog(String namn,int jump,String say,int age) {
        setNamn(namn);
        setJump(jump);
        setSay(say);
        setAge(age);
    }
    void woof(){
        System.out.println(getNamn() + " hoppar " + getJump() + " gång " + "och say " + getSay() + "." + "Max är " + getAge() + " år gammal.");
    }
}
