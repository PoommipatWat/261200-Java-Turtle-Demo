public class Flower{
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
        for(int i = 0; i < 8; i++){
            Heart heart = new Heart(i, 0, X, Y);
            heart.set_color(color[i]);
            Thread thread = new Thread(heart);
            thread.start();
        }
        for(int j = 0; j < 8; j++){
            Heart heart2 = new Heart(j, 2, X, Y);
            heart2.set_color(color[j]);
            Thread thread = new Thread(heart2);
            thread.start();
        }
        Thread thread = new Thread(new Stalk(X,Y));
        thread.start();
    }
}
