package D.DesignPatterns.documentstructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Composed {

    // this is a reference to circles
    private List<Circle> circles = new ArrayList<Circle>();
    // this is a reference to squares
    private List<Square> squares = new ArrayList<Square>();

    public List<Circle> getCircles() {
        return circles;
    }

    public void setCircles(List<Circle> circles) {
        this.circles = circles;
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void setSquares(List<Square> squares) {
        this.squares = squares;
    }
}
