package brankosaponjic.factory.services;

public class RussianGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет мир!";
    }
}
