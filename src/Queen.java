public class Queen extends Piece {

    Position position = new Position(3,3);

    boolean isValidMove(Position newPosition){
        if((newPosition.column == this.position.column || newPosition.row == this.position.row)
        || ((Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)))){
            return true;
        }
        else{
            return false;

        }
    }
}
