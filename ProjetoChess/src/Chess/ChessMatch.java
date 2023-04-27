package Chess;

import BoardGame.Board;

import ChessPieces.King;
import ChessPieces.Tower;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        iniatalSetup();
    }

    public ChessPiece[][] getPieces() {

        ChessPiece[][] mat = new ChessPiece[board.getrow()][board.getColumn()];
        for (int i = 0; i < board.getrow(); i++) {
            for (int j = 0; j < board.getColumn(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

private void placeNewPiece(char column, int row, ChessPiece piece){
    board.placePiece(piece, new ChessPosition(column, row).toPosition());
}

    private void iniatalSetup() {
        placeNewPiece('b', 6, new Tower(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 7  ,new King(board, Color.WHITE));
        placeNewPiece('c', 6, new Tower(board, Color.BLACK));
    }
}
