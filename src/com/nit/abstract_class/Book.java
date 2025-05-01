package com.nit.abstract_class;

public abstract class Book
{
    String title;
    public abstract void setTitle(String title);
    public abstract String getTitle();

    public Book(String title) {
        this.title = title;
    }
}
class MyBook extends Book
{

    public MyBook(String title) {
        super(title);
    }

    @Override
    public void setTitle(String title)
    {
        this.title=title;

    }

    @Override
    public String getTitle() {
        return title;
    }
}
