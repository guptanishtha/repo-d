public class RobotCustomException {
    public void MovementCheck(int Direction) throws NotStraightLineExeption {
        if(Direction!=1){
            throw new NotStraightLineExeption("Robot is not moving forward.");
        }
    }

    public static void main(String[] args) throws NotStraightLineExeption{
        RobotCustomException Rob = new RobotCustomException();
        Rob.MovementCheck(0);
        Rob.MovementCheck(1);
    }
}