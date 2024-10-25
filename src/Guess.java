public class Guess {
    private int randomNum;

    public int generateRandomNum(){
        randomNum = (int)(Math.random()*100);
        return randomNum;
    }
}
