package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import static com.chess.piece.Piece.Type.KNIGHT;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, KNIGHT);
    }

    @Override
    public Vector doMove(Move move) {

        return null;
    }
}
