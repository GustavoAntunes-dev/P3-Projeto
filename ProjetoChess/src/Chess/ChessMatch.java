package Chess;

import BoardGame.Board;

import ChessPieces.King;
import ChessPieces.Tower;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    private void initialSetup() {
        placeNewPiece('c', 1, new Tower(board, Color.WHITE));
        placeNewPiece('c', 2, new Tower(board, Color.WHITE));
        placeNewPiece('d', 2, new Tower(board, Color.WHITE));
        placeNewPiece('e', 2, new Tower(board, Color.WHITE));
        placeNewPiece('e', 1, new Tower(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Tower(board, Color.BLACK));
        placeNewPiece('c', 8, new Tower(board, Color.BLACK));
        placeNewPiece('d', 7, new Tower(board, Color.BLACK));
        placeNewPiece('e', 7, new Tower(board, Color.BLACK));
        placeNewPiece('e', 8, new Tower(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}
