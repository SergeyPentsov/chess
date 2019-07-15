package com.chess.test;


import com.chess.init.StartChessboardBuilder;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class MoveTestConfiguration {

    @Bean
    @Primary
    public StartChessboardBuilder nameService() {

        return Mockito.mock(StartChessboardBuilder.class);
    }

}
