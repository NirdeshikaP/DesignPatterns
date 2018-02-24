public class Test {
    public static void main(String[] args){
        ImmutablePosition immutablePosition = new Position(10,20);
        MutablePosition mutablePosition = new Position(30,40);

        System.out.print("Mutable Position before changing:");
        System.out.println("x="+mutablePosition.getX()+" and y="+mutablePosition.getY());
        mutablePosition.setX(100);
        System.out.print("Mutable Position after changing:");
        System.out.println("x="+mutablePosition.getX()+" and y="+mutablePosition.getY());

        System.out.print("Immutable Position before changing:");
        System.out.println("x="+immutablePosition.getX()+" and y="+immutablePosition.getY());

        //Drawback
        MutablePosition position = (MutablePosition)immutablePosition;
        position.setX(200);

        System.out.print("Immutable Position after changing:");
        System.out.println("x="+immutablePosition.getX()+" and y="+immutablePosition.getY());

    }

}

/// Things to present:
//1. Initial plan: only one interface. Immutable and make position mutable. For clarity, later changed
// to include two interfaces: one for mutable position and other for immutable position.
//
// i.e Position mutable = new Position(10,20);
//     ImmutablePosition immutablePosition = new Position(30,40);

//2. Did you check the solution? yes. Only at the end for confirming if I included all the required elements.
