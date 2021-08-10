package exceptionHandling;

public class robot {
    public int yC;
    public int xC;
    robot (){
        this.yC = 0;
        this.xC = 0;
    }
    public void updateY(int displacement){
        this.yC += displacement;
    }
    public void updateX(int displacement){
        this.xC += displacement;
    }
    public int getyC(){return yC;}
    public int getxC(){return xC;}
    public void setyC(int init){this.yC = init;}
    public void setxC(int init){this.xC = init;}
}
