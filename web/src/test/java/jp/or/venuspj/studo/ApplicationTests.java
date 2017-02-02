package jp.or.venuspj.studo;

import org.springframework.boot.SpringApplication;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("unit")
public class ApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTests.class, args);
    }

}
