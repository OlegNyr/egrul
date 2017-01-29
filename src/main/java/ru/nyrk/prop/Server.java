package ru.nyrk.prop;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Server {
    private String alias;
    @NotNull
    private String url;
    @NotNull
    private String p12;
    @NotNull
    private String password;
    @NotNull
    private String autification;
}
