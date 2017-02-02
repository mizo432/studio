package jp.or.venuspj.studo;

import org.springframework.boot.SpringApplication;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("integration")
public class ApplicationIntegrationTest {

    public static void main(String[] args) {
        SpringApplication.run(jp.or.venuspj.studo.ApplicationIntegrationTest.class, args);
    }

}
