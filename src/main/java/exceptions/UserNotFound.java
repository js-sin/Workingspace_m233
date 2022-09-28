package ch.zli.m223.exception;

public class UserNotFoundException extends RunTimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}