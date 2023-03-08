public class Main{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j+=2)
            {
                Flower flower = new Flower(i,j);
                flower.draw();
            }
        }
        Turtle.saveGCODE("test.gcode");
        // Flower flower = new Flower(0,0);
        // flower.draw();
    }
}
