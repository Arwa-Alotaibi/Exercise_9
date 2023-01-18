import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("JavaBook",13.00,"arwa");
        System.out.println(b1.getDiscount());
        Movie m1 = new Movie("aa",15.77,"bb");
        System.out.println(m1.getDiscount());

        ArrayList<Movable> movables = new ArrayList<Movable>();
        movables.add(new MovablePoint(3,4,5,7));
        for(Movable movable : movables){
            movable.moveUp();
            movable.moveDown();
            movable.moveLeft();
            movable.moveRight();

            System.out.println(movable.toString());
        }



    }
}