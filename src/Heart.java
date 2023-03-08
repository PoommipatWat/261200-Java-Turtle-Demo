public class Heart implements Runnable{
    private Turtle bot;
    private Turtle bot2;
    private int degree;
    private int scale;

    public Heart (int degree, int scale, int x, int y){
        bot = new Turtle(x,y);
        bot.penColor("red");
        bot.width(2);
        bot.speed(1);

        bot2 = new Turtle(x,y);
        bot2.penColor("red");
        bot2.width(2);
        bot2.speed(1);
        this.degree = degree;
        this.scale = scale;
    }

    private void half_draw(Turtle bott, int k, int j, int m){
        float Y = 0;
        float X = 0;
        double X_old = 0;
        double Y_old = 0;
        double R;
        double theta;
        double last_theta = 0;

        
        if(j == 0) bott.left(45);
        else if (j == 1) bott.left(90);
        else if (j == 2) bott.left(135);
        else if (j == 3) bott.left(180);
        else if (j == 4) bott.left(225);
        else if (j == 5) bott.left(270);
        else if (j == 6) bott.left(315);
        else if (j == 7) bott.left(360);
        

        for (int x = 0; x < 180; x++){
            X = x/100.0f;
            Y = (float) Math.pow(X, 2./3.);
            Y += 0.9*(Math.sqrt(3.3-Math.pow(X,2)))*Math.sin(25.*Math.PI*X);
            X+=m;
            Y+=m;
            X*=100;
            Y*=100*k;
            
            R = Math.sqrt(Math.pow(X-X_old, 2) + Math.pow(Y-Y_old, 2));
            theta = Math.atan2(Y-Y_old, X-X_old);
            theta = Math.toDegrees(theta);
            bott.forward(R);
            if(theta > 0 && last_theta < 0)
                bott.right(178.5);
            else if(theta < 0 && last_theta > 0)
                bott.left(178.5);
            X_old = X;
            Y_old = Y;
            last_theta = theta;
        }
    }

    public void run(){
        this.half_draw(bot, 1, degree, scale);
        this.half_draw(bot2, -1, degree, scale);
    }

    public void set_color(String color){
        bot.penColor(color);
        bot2.penColor(color);
    }
}
