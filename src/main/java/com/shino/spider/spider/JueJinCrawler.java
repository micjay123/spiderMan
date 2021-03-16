package com.shino.spider.spider;

import com.shino.spider.model.JueJin;
import com.shino.spider.utils.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author langchaojie
 * @date 2021/3/16
 */
public class JueJinCrawler {
    private final static String VIEW_REG = "[^0-9]";
    private final static String JAVA_HOT_URL = "https://juejin.cn/backend/Java?sort=three_days_hottest";

    public static JueJin cleanData(String url){
        Document doc = BaseParse.getHtmlDoc(url);
        String time = doc.getElementsByClass("time").first().text();
        Element element = doc.getElementsByClass("markdown-body").first();
        String views = doc.getElementsByClass("views-count").first().text();
        Pattern p = Pattern.compile(VIEW_REG);
        Matcher matcher = p.matcher(views);
        Integer articleView = Integer.valueOf(matcher.replaceAll("").trim());
        String title = doc.title();
        time = DateUtil.date2TimeStamp(DateUtil.parseDate(time),"yyyy-MM-dd");
        return JueJin.builder().link(url).content(element.toString()).view(articleView).title(title)
                .time(Long.valueOf(time)).build();
    }
//    public static List<JueJin> crawlAllJueJin(){
//
//    }
}

