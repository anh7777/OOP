package adapter.pseudocode;

public class Test {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        hole.fits(roundPeg);
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        RoundPeg smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        RoundPeg largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        hole.fits(smallSquarePegAdapter);
        hole.fits(largeSquarePegAdapter);
        System.out.println(hole);
        System.out.println(roundPeg);
        System.out.println(smallSquarePeg);
        System.out.println(largeSquarePeg);
        System.out.println(smallSquarePegAdapter);
        System.out.println(largeSquarePegAdapter);

    }
}
