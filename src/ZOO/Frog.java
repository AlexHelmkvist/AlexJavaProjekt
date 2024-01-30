package ZOO;

public class Frog extends Animal{
    public Frog(String namn,int jump,String say) {
        setNamn(namn);
        setJump(jump);
        setSay(say);


    }

    void kva(){
        System.out.println(getNamn() + " spring " + getJump() + " gången " + "och say " + getSay());
    }

}
