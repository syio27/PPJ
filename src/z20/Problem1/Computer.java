package z20.Problem1;

public class Computer extends Calculator{

    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y){
        super.calculate(x,y);
        double res = x*y;
        double res1 = x/y;
        return super.calculate(x,y) + "; " + x + "*" + y + "=" + res + "; " + x + "/" + y + "=" + res1;
    }
}
