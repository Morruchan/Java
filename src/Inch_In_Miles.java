public class Inch_In_Miles {
    public static void main(String args[]) {
        long ci; // кубических дюймов в кубической миле
        long im; // линейных дюймов  в линейной миле
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("B одной кубической миле содержится " + ci +" кубических дюймов");
    }
}
