package Chess;

import BoardGame.Board;
import BoardGame.Piece;
import BoardGame.Position;
import ChessPieces.King;
import ChessPieces.Tower;

public class ChessMatch {
    private Board board;

public ChessMatch(){
    board = new Board(8, 8);
    iniatalSetup();
}
public ChessPiece[][] getPieces(){
   
    ChessPiece[][] mat = new ChessPiece[board.getrow()][board.getColumn()];
    for(int i = 0; i<board.getrow();i++){
        for(int j = 0 ; j<board.getColumn(); j++){
            mat[i][j] = (ChessPiece) board.piece(i, j);
        }
    }
    return mat;
}
private void iniatalSetup(){
    board.placePiece(new Tower(board, Color.WHITE),new Position(3, 6));
    board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
    board.placePiece(new King(board, Color.WHITE), new Position(6, 6));
}
}


