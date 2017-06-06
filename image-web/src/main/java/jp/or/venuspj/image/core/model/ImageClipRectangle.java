package jp.or.venuspj.image.core.model;

public class ImageClipRectangle {
    protected int x;

    protected int y;

    protected int width;

    protected int height;

    public ImageClipRectangle() {
        //NOP
    }

    public ImageClipRectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }

    @Deprecated
    public int getX() {
        return x;
    }

    @Deprecated
    public void setX(int x) {
        this.x = x;
    }

    @Deprecated
    public int getY() {
        return y;
    }

    @Deprecated
    public void setY(int y) {
        this.y = y;
    }

    @Deprecated
    public int getWidth() {
        return width;
    }

    @Deprecated
    public void setWidth(int width) {
        this.width = width;
    }

    @Deprecated
    public int getHeight() {
        return height;
    }

    @Deprecated
    public void setHeight(int height) {
        this.height = height;
    }
}
