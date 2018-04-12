package com.ycit.iterator;

/**
 * Created by xlch on 2017/3/27.
 */
public class Main {

    public static void main(String [] args) {
        BooksCollection booksCollection = new BooksCollection();
        IIterator it = booksCollection.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
