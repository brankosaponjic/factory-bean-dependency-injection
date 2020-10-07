package brankosaponjic.factory.config;

import brankosaponjic.factory.fakebeans.FakeAdmin;
import brankosaponjic.factory.fakebeans.FakeCustomer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeBeanConfig {

    @Value("${admin.username}")
    String adminUser;
    @Value("${admin.password}")
    String adminPass;
    @Value("${admin.url}")
    String adminUrl;
    @Value("${customer.username}")
    String customerUser;
    @Value("${customer.password}")
    String customerPass;
    @Value("${customer.url}")
    String customerUrl;

    @Bean
    public FakeAdmin fakeAdmin() {
        FakeAdmin admin = new FakeAdmin();
        admin.setUsername(adminUser);
        admin.setPassword(adminPass);
        admin.setUrl(adminUrl);
        return admin;
    }

    @Bean
    public FakeCustomer fakeCustomer() {
        FakeCustomer customer = new FakeCustomer();
        customer.setUsername(customerUser);
        customer.setPassword(customerPass);
        customer.setUrl(customerUrl);
        return customer;
    }
}
