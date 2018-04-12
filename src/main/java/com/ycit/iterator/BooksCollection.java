package com.ycit.iterator;

/**
 * Created by xlch on 2017/3/23.
 */
public class BooksCollection implements IContainer {

    private String books [] = {"think in java","head first design pattern","ElasticSearch cookbook"};

    @Override
    public IIterator createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements IIterator {

        private int pos;

        @Override
        public boolean hasNext() {
            if (pos < books.length) {
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return books[pos++];
            }else {
                return null;
            }
        }
    }

}
