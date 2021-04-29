package z20.Problem1;

public class Calculator extends CalculatingDevice{

    public Calculator(String name) {
        super(name);
    }
    @Override
    public String calculate(double x, double y){
        super.calculate(x,y);
        double res = x - y;
        return super.calculate(x,y) + "; " + x + "-" + y + "=" + res;
    }
}
