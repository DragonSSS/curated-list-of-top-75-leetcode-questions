package leetcode.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class WebCrawlerMultithreaded {

    class HtmlParser {
        public List<String> getUrls(String url) {
            return new ArrayList<>();
        }
    }

    private ExecutorService executor = Executors.newFixedThreadPool(6);

    private AtomicInteger activeTasks = new AtomicInteger();

    private final Set<String> visited = Collections.synchronizedSet(new HashSet<>());  

    private String domain;

    private HtmlParser htmlParser;

    class Task implements Runnable {
        String url;

        public Task(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            for(String next : htmlParser.getUrls(url)) {
                if(next.split("/")[2].equals(domain) && visited.add(next)) {
                    activeTasks.incrementAndGet();
                    executor.execute(new Task(next));
                }
            }
            activeTasks.decrementAndGet();
        }
    }

    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        this.htmlParser = htmlParser;
        this.domain = startUrl.split("/")[2];
        visited.add(startUrl);
        activeTasks.set(1);
        executor.execute(new Task(startUrl));
        while(activeTasks.get() > 0) {
            try {
                Thread.sleep(80);
            } catch (Exception e) {
    
            } 
        }
        executor.shutdownNow();
        return new ArrayList<>(visited);
    }
}
