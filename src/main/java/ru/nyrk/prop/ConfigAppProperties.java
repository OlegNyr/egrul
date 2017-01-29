package ru.nyrk.prop;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "config")
@Data
public class ConfigAppProperties {
    @Valid
    private Server nalog;
    private String dataDir;
}
