package brankosaponjic.factory.services;

public class GreetingServiceFactory {

    private GreetingService greetingService;

    public GreetingServiceFactory(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new GreetingServiceImpl();
            case "ar":
                return new ArabianGreetingServiceImpl();
            case "fr":
                return new FrenchGreetingServiceImpl();
            case "de":
                return new GermanGreetingServiceImpl();
            case "gr":
                return new GreekGreetingServiceImpl();
            case "it":
                return new ItalianGreetingServiceImpl();
            case "ps":
                return new PersianGreetingServiceImpl();
            case "ru":
                return new RussianGreetingServiceImpl();
            case "sr":
                return new SerbianGreetingServiceImpl();
            case "es":
                return new SpanishGreetingServiceImpl();
            case "tr":
                return new TurkishGreetingServiceImpl();
            default:
                return new GreetingServiceImpl();
        }
    }
}
