package exceptions;

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {
        if(value <= 0)
            throw new IOException();
//if we wanna throw IOException we have to specify it above with "throws"
    }
}
