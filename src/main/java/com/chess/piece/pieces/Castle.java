package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import static com.chess.piece.Piece.Type.CASTLE;

public class Castle extends Piece {
    public Castle(Color color) {
        super(color, CASTLE);
    }

    @Override
    public Vector doMove(Move move) {

        return null;
    }
}
