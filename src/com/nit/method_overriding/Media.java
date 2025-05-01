package com.nit.method_overriding;

public class Media
{
    String title;
    int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
    public Media getDetails()
    {
        return this;
    }
}
class Image extends Media
{
    String resolution;

    public Image(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public Image getDetails()
    {
        return this;
    }

    @Override
    public String toString() {
        return "Image{" +
                "resolution='" + resolution + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
class Video extends Media
{
    String format;

    public Video(String title, int duration, String format) {
        super(title, duration);
        this.format = format;
    }
    @Override
    public Video getDetails()
    {
        return this;
    }

    @Override
    public String toString() {
        return "Video{" +
                "format='" + format + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
