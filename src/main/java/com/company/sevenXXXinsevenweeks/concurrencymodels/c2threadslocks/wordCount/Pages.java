package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.wordCount;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/25 10:56
 * @email: liuzihao29@jd.com
 */

class Pages implements Iterable<Page> {

    private final int maxPages;
    private final String fileName;

    public Pages(int maxPages, String fileName) {
        this.maxPages = maxPages;
        this.fileName = fileName;
    }

    private class PageIterator implements Iterator<Page> {

        private XMLEventReader reader;
        private int remainingPages;

        public PageIterator() throws Exception {
            remainingPages = maxPages;
            reader = XMLInputFactory.newInstance().createXMLEventReader(new FileInputStream(fileName));
        }

        public boolean hasNext() { return remainingPages > 0; }

        public Page next() {
            try {
                XMLEvent event;
                String title = "";
                String text = "";
                while (true) {
                    event = reader.nextEvent();
                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart().equals("page")) {
                            while (true) {
                                event = reader.nextEvent();
                                if (event.isStartElement()) {
                                    String name = event.asStartElement().getName().getLocalPart();
                                    if (name.equals("title"))
                                        title = reader.getElementText();
                                    else if (name.equals("text"))
                                        text = reader.getElementText();
                                } else if (event.isEndElement()) {
                                    if (event.asEndElement().getName().getLocalPart().equals("page")) {
                                        --remainingPages;
                                        return new Page(title, text);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new NoSuchElementException();
            }
        }

        public void remove() { throw new UnsupportedOperationException(); }
    }

    public Iterator<Page> iterator() {
        try {
            return new PageIterator();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
