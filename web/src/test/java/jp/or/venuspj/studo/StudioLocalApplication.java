package jp.or.venuspj.studo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ClassUtils;


@ComponentScan(basePackages = "jp.or.venuspj.studio")
@EnableAutoConfiguration
public class StudioLocalApplication {

    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(StudioLocalApplication.class);
        if (isDeveloping()) { // ローカル開発環境では
            springApplication.setAdditionalProfiles("development"); // developing プロファイルを追加
        }
        springApplication.run(args);

    }

    private static boolean isDeveloping() {
        // DevToolsSettings クラスがあれば、開発中。
        return ClassUtils.isPresent("org.springframework.boot.devtools.settings.DevToolsSettings",
                ClassLoader.getSystemClassLoader());
    }

}
