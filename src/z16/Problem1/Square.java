package z16.Problem1;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public Square() {
        this.side = 1;
    }
    public double getSide() {
        return side;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }

    public double getDiagonal(){
        return side * Math.sqrt(2);
    }

    public double getPerimeter(){
        return side * 4;
    }

    public Square getDoubled(){
        return new Square(Math.pow(side,2));
    }

    public static double getTotalArea(Square[] sqs){
        int sum = 0;
        for(Square s : sqs){
            sum += s.getArea();
        }
        return sum;
    }

    public static Square getMax(Square[] sqs){
        Square maxSqs = sqs[0];
        for(Square s : sqs){
            if(maxSqs.getSide() < s.getSide()){
                maxSqs = s;
            }
        }
        return maxSqs;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
