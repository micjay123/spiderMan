package com.shino.spider.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
public class BaseParse {
    public static Document getHtmlDoc(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
