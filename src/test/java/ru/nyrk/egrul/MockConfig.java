package ru.nyrk.egrul;

import org.mockito.Mockito;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ru.nyrk.egrul.loader.LoaderFromNalog;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * todo:java doc
 */
@TestConfiguration
public class MockConfig {
    @Bean
    LoaderFromNalog loaderFromNalogImpl(){
        LoaderFromNalog mock = Mockito.mock(LoaderFromNalog.class);
//        when(mock.load(any(), any(), anyBoolean(), anyInt())).thenReturn(new )
        return mock;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return r->{};
    }
}
