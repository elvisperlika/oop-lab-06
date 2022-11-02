package it.unibo.exceptions.fakenetwork.api;

import java.io.IOException;
import java.util.Objects;

/**
 * Marks a network error.
 */
public class NetworkException extends IOException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor to be used when there is a failure when sending a message.
     *
     * @param message the message being sent
     */
    public NetworkException(final String message) {
        super("Network error while sending -> " + message);
        Objects.requireNonNull(message);
    }

    /**
     * Constructor to be used when there is a failure receiving a message.
     */
    public NetworkException() {
        super("Network no response");
    }

}
