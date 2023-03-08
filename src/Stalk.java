public class Stalk implements Runnable{
    private Turtle Bob;

    public Stalk (int x, int y){
        this("green", 30, 10,x ,y);
    }
    public Stalk (String pencolor, int width, int speed, int x, int y){
        Bob = new Turtle(x,y);
        Bob.penColor(pencolor);
        Bob.width(width);
        Bob.speed(speed);
    }

    public void run(){
        Bob.right(90);
        Bob.forward(1000);
    }
}
