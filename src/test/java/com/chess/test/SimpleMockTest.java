package com.chess.test;

import com.chess.chessboard.Move;
import com.chess.chessboard.Space;
import com.chess.init.StartChessboardBuilder;
import com.chess.piece.Piece;
import com.chess.piece.pieces.Pawn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@RunWith(MockitoJUnitRunner.class)
public class SimpleMockTest {


    @Test
    public void testValidMove() {
        Piece piece = Mockito.mock(Piece.class);
        Mockito.when(piece.getPieceMoveVector(getValidMove())).thenCallRealMethod();
        System.out.println(piece.getPieceMoveVector(getValidMove()));
    }


    private Move getValidMove() {
        Space before = new Space(2, 8);
        Space after = new Space(2, 3);
        return new Move(before, after);
    }
}
