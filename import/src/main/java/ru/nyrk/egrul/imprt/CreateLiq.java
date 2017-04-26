package ru.nyrk.egrul.imprt;

import liquibase.exception.CommandLineParsingException;

import java.io.IOException;

/**
 * todo:java doc
 */
public class CreateLiq {
    public static void main(String[] args) throws IOException, CommandLineParsingException {
        liquibase.integration.commandline.Main.main(args);
    }
}
