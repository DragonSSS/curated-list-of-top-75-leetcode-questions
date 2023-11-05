package leetcode.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebCrawler {
    class HtmlParser {
        public List<String> getUrls(String url) {
            return new ArrayList<>();
        }
    }

    // startUrl = "http://news.yahoo.com/news/topics/"
    Set<String> visited = new HashSet<>();
    String hostName = "";
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        String[] parts = startUrl.split("/");
        hostName = parts[2];
        visited.add(startUrl);
        helper(startUrl, htmlParser);
        return new ArrayList<>(visited);
    }

    private void helper(String url, HtmlParser htmlParser) {
        for(String next : htmlParser.getUrls(url)) {
            if (hostName.equals(getHostName(next)) && visited.add(next)) {
                helper(next, htmlParser);
            }
        }
    }

    private String getHostName(String url){
        return url.split("/")[2];
    }   
}
