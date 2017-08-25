import java.util.ArrayList;
/**
 * Write a description of class ContainsBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContainsBet extends Bet
{
    protected ArrayList<WheelSpace> allSpaces;
    public ContainsBet(Gambler gambler, int amount, ArrayList<WheelSpace> spaces){
        super(gambler, amount);
        this.allSpaces = spaces;
        this.type = "contains";
    }
    
    public boolean isWinning(WheelSpace w){
        return allSpaces.contains(w);
    }
    
        public String toString(){
        String s = "";
        s+= "Contains(" + amount +"," + allSpaces + ")";
        return s;
    }
}
