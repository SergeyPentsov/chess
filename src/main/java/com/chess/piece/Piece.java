package com.chess.piece;


import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Space;
import com.chess.chessboard.Vector;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public abstract class Piece {
    private final Color color;
    private final Type type;

    public abstract Vector doMove(Move move);

    public Vector getPieceMoveVector(final Move move) {
        final Space before = move.getBefore();
        final Space after = move.getAfter();
        final List<Space> vector = new ArrayList<>();
        if (before.getX() - after.getX() == 0 && before.getY() - after.getY() == 0)
            throw new IllegalArgumentException("move bitch!!");

        boolean isForward = (after.getY() - before.getY()) > 0;
        boolean isRight = (after.getX() - before.getX()) > 0;

        if (before.getX() - after.getX() == 0) {
            for (int i = 1; i <= Math.abs(before.getY() - after.getY()); i++) {
                int y = isForward ? before.getY() + i : before.getY() - i;
                vector.add(new Space(before.getX(), y));
            }
        } else if (before.getY() - after.getY() == 0) {
            for (int i = 1; i <= Math.abs(before.getX() - after.getX()); i++) {
                int x = isRight ? before.getX() + i : before.getX() - i;
                vector.add(new Space(x, before.getY()));
            }
        } else {
            if (Math.abs(before.getX() - after.getX()) != Math.abs(before.getY() - after.getY())) {
                throw new IllegalArgumentException("tic tonik!!");
            }
            for (int i = 1; i <= Math.abs(before.getX() - after.getX()); i++) {
                int x = isRight ? before.getX() + i : before.getX() - i;
                int y = isForward ? before.getY() + i : before.getY() - i;
                vector.add(new Space(x, y));
            }

        }
        return new Vector(vector);
    }

    public enum Color {
        WHITE,
        BLACK
    }

    public enum Type {
        KING,//король
        QUEEN,//королева
        BISHOP,//слон
        KNIGHT,//конь
        CASTLE,//ладья
        PAWN//пешка
    }
}
