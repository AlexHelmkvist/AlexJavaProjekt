package Exersice8;

public class Spellchecker {
    //isLetter Lätter efter bokstav
    public boolean isLetter(char sign) {
        return (sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z');
    }
}
