package com.at.c_annot;

import java.util.Arrays;

public class Demo01Annot {
    public static void main(String[] args) {
        Class<BookShell> bookShellClass = BookShell.class;
        boolean b = bookShellClass.isAnnotationPresent(Book.class);
        System.out.println("b = " + b);

        if (b) {
            Book book = bookShellClass.getAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(Arrays.toString(book.author()));
            System.out.println(book.price());
            System.out.println(book.count());
        }
    }
}
