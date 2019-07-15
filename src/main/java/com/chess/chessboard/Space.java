package com.chess.chessboard;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Getter
@EqualsAndHashCode
@ToString
public class Space {
    public static final int MAX_SPACE = 8;
    public static final int MIN_SPACE = 1;
    private final int x;
    private final int y;

    public Space(@JsonProperty("x") int x, @JsonProperty("y") int y) {
        if (validateCoordinates(x, y))
            throw new IllegalArgumentException("Not valid space coordinates x: " + x + " y: " + y);
        this.x = x;
        this.y = y;
    }

    private boolean validateCoordinates(int x, int y) {
        return x < MIN_SPACE || x > MAX_SPACE
                || y < MIN_SPACE || y > MAX_SPACE;
    }
}
/*
 * y
 * ^
 * |
 * |
 * |
 * |
 * |
 * |---------->x
 * */