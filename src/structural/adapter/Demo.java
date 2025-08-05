package structural.adapter;

import structural.adapter.adapters.SquarePegAdapter;
import structural.adapter.round.RoundHole;
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

/**
 Adapter is a structural design pattern, which allows incompatible objects to collaborate.

 The Adapter acts as a wrapper between two objects.
 It catches calls for one object and transforms them to format and interface recognizable by the second object.

 Usage examples: The Adapter pattern is pretty common in Java code.
 It’s very often used in systems based on some legacy code. In such cases, Adapters make legacy code work with modern classes.

 Identification: Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type.
 When the adapter receives a call to any of its methods,
 it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.
**/

public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}