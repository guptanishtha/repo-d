public class Robot
{
    public char direction;
    public void checkDir() throws myException
    {
        if(direction!='u' && direction!='d')
            throw new myException("Cannot move robot in other directions");
    }
    Robot(char d)
    {
        direction=d;
    }
    public static void main(String[] args) {
        char dir = 'd';
        Robot r = new Robot(dir);
        try {
            r.checkDir();
            System.out.println("Robot moved successfully");
        } catch (myException me) {
            System.out.println(me.getMessage());
        }

    }
}

