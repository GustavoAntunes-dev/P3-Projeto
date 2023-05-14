package BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if ( rows < 1 || columns <1){
            throw new BoardException("Error creating bordad : there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRow() {
        return rows;
    }

    

    public int getColumn() {
        return columns;
    }

   

    public Piece piece(int rows, int columns) {
        if(!positionExists(rows, columns)){
            throw new BoardException("Position not on the board");
        }
        return pieces[rows][columns];
    }

    public Piece piece(Position position) {
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        if(piece(position)==null){
            return null;
        }
        Piece aux = piece((position));
        aux.position=null;
        pieces[position.getRow()][position.getColumn()]=null;
        return aux;
        
    }


    public boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;

    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;

    }
}
