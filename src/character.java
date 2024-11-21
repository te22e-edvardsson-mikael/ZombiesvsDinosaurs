import java.util.Random;

public class character {
    public int intelligance;
    public int strengh;
    public int resistance;
    Random RandomGen = new Random();
    public int maxValue = 20;

    public int PlayChess(){
        int returnValue = RandomGen.nextInt(20) + intelligance;
        if (returnValue>maxValue){
         returnValue=maxValue;
        }
        return returnValue;
    }
}


