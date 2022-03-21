package com.chess.engine.pieces;// logical package

import com.chess.engine.Alliance;
import com.chess.engine.Board;
import com.chess.engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;
    protected  final Alliance pieceAlliance;


    Piece (final int piecePosition, final Alliance pieceAlliance){
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;

    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);//set: no duplicates unordered  list: dupilicates and ordered

}
