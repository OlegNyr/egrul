package ru.nyrk.loader;

import org.apache.http.StatusLine;

public class LoadException extends RuntimeException {
    private final StatusLine statusLine;

    public LoadException(StatusLine statusLine) {
        super(statusLine.toString());
        this.statusLine = statusLine;
    }

    int getStatusCode() {
        return statusLine.getStatusCode();
    }
}
