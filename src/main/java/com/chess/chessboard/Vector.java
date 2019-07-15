package com.chess.chessboard;

import lombok.ToString;

import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;


@ToString
public class Vector {
    private final List<Space> spaces;

    public Vector(List<Space> spaces) {
        this.spaces = Collections.unmodifiableList(spaces);
    }

    public List<Space> getSpaces() {
        return spaces;
    }


}
