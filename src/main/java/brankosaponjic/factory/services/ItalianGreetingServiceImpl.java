package brankosaponjic.factory.services;

public class ItalianGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Ciao Mondo!";
    }
}
