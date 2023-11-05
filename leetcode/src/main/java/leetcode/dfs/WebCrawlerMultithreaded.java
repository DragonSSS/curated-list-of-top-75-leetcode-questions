import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebCrawlerMultithreaded {

    private ExecutorService executor = Executors.newFixedThreadPool(6);
    

    List<String> res = new ArrayList<>();

    class HtmlParser {
        public List<String> getUrls(String url) {
            return new ArrayList<>();
        }
    }

    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        return res;
    }
}
