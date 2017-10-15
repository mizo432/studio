package org.venuspj.studio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Studio-dataSourceテスト用設定
 */
@SpringBootApplication
public class StudioDaoApplication {
    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(StudioDaoApplication.class);
        springApplication.run(args);

    }

}
