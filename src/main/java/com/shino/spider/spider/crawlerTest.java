package com.shino.spider.spider;


import com.shino.spider.utils.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
public class crawlerTest {
    public static void main(String[] args) throws IOException {
        String reg = "[^0-9]";
        Pattern p = Pattern.compile(reg);
        Document doc = Jsoup.connect("https://juejin.cn/backend/Java?sort=three_days_hottest").get();
        Elements name = doc.getElementsByClass("name");
        System.out.println(name);
    }
}
