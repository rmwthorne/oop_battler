import java.util.Random;

public class Utils {

  public static int roll(int d, int modifier) {
    Random rand = new Random();
    int randomNum = rand.nextInt(d - 1) + 1;
    return randomNum + modifier;
  }

}
