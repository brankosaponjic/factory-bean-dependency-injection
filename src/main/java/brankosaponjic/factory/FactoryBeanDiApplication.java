package brankosaponjic.factory;

import brankosaponjic.factory.controllers.ConstructorInjectedController;
import brankosaponjic.factory.controllers.MyController;
import brankosaponjic.factory.fakebeans.FakeAdmin;
import brankosaponjic.factory.fakebeans.FakeCustomer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FactoryBeanDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(FactoryBeanDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

//        System.out.println(myController.sayHello());
//
//        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//
//        System.out.println(constructorInjectedController.getGreeting());

        FakeAdmin admin = ctx.getBean(FakeAdmin.class);
        System.out.println(admin.getUsername());

        FakeCustomer customer = ctx.getBean(FakeCustomer.class);
        System.out.println(customer.getUsername());
    }

}
