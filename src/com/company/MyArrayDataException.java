package com.company;

public class MyArrayDataException extends RuntimeException{
     int column;
     int line;

    public MyArrayDataException(String message, int column, int line){
        super(message);
        this.column = column;
        this.line = line;
    }

    public int getColumn(){
        return column;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public int getLine(){
        return line;
    }

    public void setLine(int line){
        this.line = line;
    }

}
