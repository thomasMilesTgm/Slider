/**
 * Created by Tom Miles (tmiles, 626263) and George Juliff (juliffg, 624946) on 1/04/2017.
 * Tile that can be moved into if it is occupied == false
 */
public class ValidTile extends Tile {
    private boolean occupied;

    ValidTile(boolean containsPiece) {
        occupied = containsPiece;
    }
    @Override
    public boolean isOccupied() {
        return occupied;
    }

}
