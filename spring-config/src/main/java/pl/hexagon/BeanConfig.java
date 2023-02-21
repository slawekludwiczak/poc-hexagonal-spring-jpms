package pl.hexagon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.hexagon.application.port.in.CreateFooInputPort;
import pl.hexagon.application.port.out.PersistFooOutputPort;

@Configuration(proxyBeanMethods = false)
class BeanConfig {

    @Bean
    CreateFooInputPort fooInputPort(PersistFooOutputPort persistFooOutputPort) {
        return new CreateFooInputPort(persistFooOutputPort);
    }
}
