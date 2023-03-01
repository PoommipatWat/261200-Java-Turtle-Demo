public class Flower {
    private int X;
    private int Y;
    private String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet", "pink"};

    public Flower(){
        this(0,0);
    }
    public Flower(int x, int y){
        X = x*1000;
        Y = y*1000;
    }

    public void draw(){
        Stalk stalk = new Stalk(X,Y);
        stalk.draw();
        for(int i = 0; i < 8; i++){
            Heart heart = new Heart(i, 0, X, Y);
            heart.set_color(color[i]);
            heart.draw();
        }
        for(int i = 0; i < 8; i++){
            Heart heart = new Heart(i, 2, X, Y);
            heart.set_color(color[i]);
            heart.draw();
        }
    }
}
