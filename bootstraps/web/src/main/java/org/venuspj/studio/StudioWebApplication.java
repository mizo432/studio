package org.venuspj.studio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ClassUtils;

@SpringBootApplication
public class StudioWebApplication {
    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(StudioWebApplication.class);
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
