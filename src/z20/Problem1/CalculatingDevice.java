package z20.Problem1;

public class CalculatingDevice {
    private String name;
    public CalculatingDevice(String name) {
        this.name = name;
    }
    public String calculate(double x, double y){
        double res = x + y;
        return name + ": " + x + "+" + y + "="+ res;
    }
    public static void printRes(CalculatingDevice[] a, double x, double y){
        for(CalculatingDevice cal : a){
            System.out.println(cal.calculate(x,y));
        }
    }
}
