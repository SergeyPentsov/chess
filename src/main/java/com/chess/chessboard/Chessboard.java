package com.chess.chessboard;

import com.chess.piece.Piece;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;


@Getter
@EqualsAndHashCode
@ToString
public class Chessboard {
    public final UUID chessboardId = UUID.randomUUID();
    public final Set<ChessboardSquare> squares;

    public Chessboard(Set<ChessboardSquare> squares) {
        this.squares = Collections.unmodifiableSet(squares);
    }

    public void movePiece(Move move) {
        Optional<Piece> pieceFromSpace = getPieceFromSpace(move.getBefore());
        if (!pieceFromSpace.isPresent()) throw new IllegalArgumentException("Empty space");
        Piece piece = pieceFromSpace.get();
        piece.doMove(move);
    }

    public Optional<Piece> getPieceFromSpace(Space space) {
        for (ChessboardSquare chessboardSquare : squares) {
            if (chessboardSquare.getSpace().equals(space)) {
                return Optional.of(chessboardSquare.getPiece());
            }
        }
        return Optional.empty();
    }
}
