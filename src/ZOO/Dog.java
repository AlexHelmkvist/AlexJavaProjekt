package ZOO;

public class Dog extends Animal {
    public Dog(String namn,int jump,String say) {
        setNamn(namn);
        setJump(jump);
        setSay(say);
    }
    void woof(){
        System.out.println(getNamn() + " spring " + getJump() + " gång " + "och say " + getSay());
    }
}
