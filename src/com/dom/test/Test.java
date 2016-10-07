package com.dom.test;

import com.dom.domain.Book;
import com.dom.http.HttpUtils;
import com.dom.service.DomService;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by durban126 on 16/10/7.
 */
public class Test {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        String path = "http://192.168.31.220:8080/ProductManagement/book.xml";
        InputStream inputStream = HttpUtils.getXML(path);
        DomService service = new DomService();
        List<Book> list = service.getBooks(inputStream);
        for (Book book:list){
            System.out.println(book.toString());
        }
    }
}
