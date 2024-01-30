package ZOO;

public class Frog extends Animal{
    public Frog(String namn,int jump,String say,int age) {
        setNamn(namn);
        setJump(jump);
        setSay(say);
        setAge(age);


    }

    void kva(){
        System.out.println(getNamn() + " spring " + getJump() + " gången " + "och say " + getSay() + "." + " Kwa är " + getAge() + " år gammal.");
    }

}
