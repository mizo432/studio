package jp.or.venuspj.image.core.config;

import jp.or.venuspj.image.core.fundamentals.path.Path;

/**
 */
public class ImageConfig {

    Path path = Path.DEFAULT;

    public void setPath(String aPath) {
        path = new Path(aPath);

    }

    public Path path() {
        return path;
    }

    public String getReplace404() {
        //XXX value object化する
        return "";
    }
}
