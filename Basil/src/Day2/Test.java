package Day2;

public class Test
{

    public static void main(String[] args)
    {
        String direction = "left";

        try
        {
            if(!direction.equals("straight"))
            {
                throw new StraightlineException("Not straight line");

            }
            else
            {
                System.out.println("Its straight line");

            }
        }
        catch (StraightlineException out)
        {
            System.out.println("Caught the exception: " + out);
        }
    }
}