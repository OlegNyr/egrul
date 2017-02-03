package ru.nyrk.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix = "config")
@Data
public class ConfigAppProperties {
    @Valid
    private Server nalog;
    private String dataDir;

    @Data
    public static class Server {
        private String alias;
        @NotNull
        private String url;
        @NotNull
        private String p12;
        @NotNull
        private String password;
        private String autification;
    }
}
