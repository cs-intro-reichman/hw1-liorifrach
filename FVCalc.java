public class FVCalc {
    public static void main(String[] var0) {

        int currentValue = Integer.parseInt(var0[0]);
        double rate = Double.parseDouble(var0[1]);
        int length = Integer.parseInt(var0[2]);

        double futureValue = currentValue * Math.pow(1 + rate / 100, length);

        System.out.println("After " + length + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
    }
}
