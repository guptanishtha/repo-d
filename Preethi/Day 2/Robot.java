package Day2;

public class Robot {
    public void Robotmoves(String direction) throws StopException{
        if (direction!="s")
            throw new StopException("Stop!\n");
    }
    public static void main(String args[]) throws StopException {
        Robot r = new Robot();
        r.Robotmoves("s");
        r.Robotmoves("l");
        r.Robotmoves("r");
    }
}
