package brankosaponjic.factory.config;

import brankosaponjic.factory.services.GreetingService;
import brankosaponjic.factory.services.GreetingServiceFactory;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(@Lazy GreetingService greetingService) {
        return new GreetingServiceFactory(greetingService);
    }

    @Bean
    @Profile({"en", "default"})
    @Primary
    GreetingService greetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Profile("ar")
    @Primary
    GreetingService arabianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("ar");
    }

    @Bean
    @Profile("fr")
    @Primary
    GreetingService frenchGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("fr");
    }

    @Bean
    @Profile("de")
    @Primary
    GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Profile("gr")
    @Primary
    GreetingService greekGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("gr");
    }

    @Bean
    @Profile("it")
    @Primary
    GreetingService italianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("it");
    }

    @Bean
    @Profile("ps")
    @Primary
    GreetingService persianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("ps");
    }

    @Bean
    @Profile("ru")
    @Primary
    GreetingService russianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("ru");
    }

    @Bean
    @Profile("sr")
    @Primary
    GreetingService serbianGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("sr");
    }

    @Bean
    @Profile("es")
    @Primary
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Profile("tr")
    @Primary
    GreetingService turkishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("tr");
    }

}