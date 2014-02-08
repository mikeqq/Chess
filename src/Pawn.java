/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.2
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public class Pawn implements Figure {


    @Override
    public boolean check(int newX, int newY, int colour) {
        if (move(X,Y)==false) {
            if (colour==Deck[newX][newY].color) {
                return false;
            } else Deck[newX][newY].status=false;
        }
    }

    @Override
    public boolean move(int newX, int newY) {

        return false;
    }



}
