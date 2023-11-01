import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
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
        helper(startUrl, htmlParser);
        return new ArrayList<>(visited);
    }

    private void helper(String url, HtmlParser htmlParser) {
        visited.add(url);
        for(String next : htmlParser.getUrls(url)) {
            if (!visited.contains(next) && hostName.equals(getHostName(next))) {
                helper(next, htmlParser);
            }
        }
    }

    private String getHostName(String url){
        return url.split("/")[2];
    }    
}
