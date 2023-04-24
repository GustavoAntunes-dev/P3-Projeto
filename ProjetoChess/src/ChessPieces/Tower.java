package ChessPieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Tower extends ChessPiece {

    public Tower(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString(){
        return "T";
    }
    
}
