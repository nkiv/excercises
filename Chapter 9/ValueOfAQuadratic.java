public class ValueOfAQuadratic{
    public static void main ( String[] args ){
    int X = 0;
    double a = (3*X)*(3*X);
    double b =  -8*X;
    double c =    4;
    double X1 =   ((-b+(Math.sqrt (b*b)-(4*a*c)/(2*a))));
    double X2 =   ((-b+(Math.sqrt (b*b)+(4*a*c)/(2*a))));
    
    System.out.println("The Quadratic Equation " + X1);
    System.out.println("The Quadratic Equation " + X2);
    }

}