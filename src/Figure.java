/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.2
 * Time: 11:18
 * To change this template use File | Settings | File Templates.
 */
public interface Figure {
    boolean move(int newX, int newY); //true-empty ; false-not empty
    boolean check(int newX, int newY, int colour); // if move==false check true-enemy ; false-ally
    boolean attack(int newStatus); //if check=true attack status=false



}
