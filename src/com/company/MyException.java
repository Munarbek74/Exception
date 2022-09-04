package com.company;

public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message, int a) {
        System.out.println("Жашы терс сан болбош керек");
    }

    public MyException( String a) {
        System.out.println("Атын жаз же жашы ката жазылган");
    }


}
