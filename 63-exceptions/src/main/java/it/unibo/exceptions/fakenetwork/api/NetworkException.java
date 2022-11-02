package it.unibo.exceptions.fakenetwork.api;

import java.io.IOException;

public class NetworkException extends IOException {

    public NetworkException() throws NetworkException {
        throw new NetworkException("Network error: no response");
    }

    public NetworkException(String message) throws NetworkException {
        throw new NetworkException("Network error while sending message:" + message);
    }
}
