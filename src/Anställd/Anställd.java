package Anställd;

public class Anställd {
    private final String name;
    private final int ålders;
    private final String yrke;
    private final double lön;
    private final int anställningsnummer;

    public Anställd(String name, int ålders, String yrke, double lön, int anställningsnummer) {
        this.name = name;
        this.ålders = ålders;
        this.yrke = yrke;
        this.lön = lön;
        this.anställningsnummer = anställningsnummer;
    }

    public String getName() {
        return name;
    }

    public int getÅlders() {
        return ålders;
    }

    public String getYrke() {
        return yrke;
    }

    public double getLön() {
        return lön;
    }

    public int getAnställningsnummer() {
        return anställningsnummer;
    }

    public void printAnställd(){
        System.out.println("Anställningsnummer:" + anställningsnummer);
        System.out.println("Namn:" + name);
        System.out.println("Ålders:" + ålders);
        System.out.println("Yrke:" + yrke);
        System.out.println("Lön:" + lön);

    }
}
