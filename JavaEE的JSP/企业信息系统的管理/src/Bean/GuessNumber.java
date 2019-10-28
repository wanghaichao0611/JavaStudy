package Bean;
public class GuessNumber {
    int answer=0;
    int guessNumber=0;
    int guessCount=0;
    String result=null;
    boolean right=false;
    public void setAnswer(int answer)
    {
        this.answer=answer;
        guessCount=0;
    }
    public int getAnswer()
    {
        return answer;
    }
    public void setGuessNumber(int guessNumber)
    {
        this.guessNumber=guessNumber;
        guessCount++;
        if (guessNumber==answer){
            result="恭喜你猜对了!";
            right=true;
        }
        else if (guessNumber>answer)
        {
            result="不好意思,你猜大了!";
            right=false;
        }
        else if (guessNumber<answer)
        {
            result="不好意思，你猜小了!";
            right=false;
        }
        else if (this.answer==1||this.answer>1000){
            result="请输入1~100的整数!";
            right=false;
        }
    }
    public int getGuessNumber(){
        return guessNumber;
    }
    public int getGuessCount()
    {
        return guessCount;
    }
    public String getResult()
    {
        return result;
    }
    public boolean isRight()
    {
        return right;
    }
}
