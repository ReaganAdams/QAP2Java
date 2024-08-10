public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);

        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + Math.toDegrees(line1.getGradient()));

        line1.setBegin(new MyPoint(1, 1));
        line1.setEnd(new MyPoint(4, 5));
        System.out.println("After setting new begin and end points:");
        System.out.println(line1);

        System.out.println("New Length: " + line1.getLength());
        System.out.println("New Gradient: " + Math.toDegrees(line1.getGradient()));
    }
}
