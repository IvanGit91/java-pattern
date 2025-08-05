package structural.proxy;

import structural.proxy.downloader.YouTubeDownloader;
import structural.proxy.proxy.YouTubeCacheProxy;
import structural.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

/*
 * Proxy is a structural design pattern that provides an object that acts as a substitute for a real service object used by a client. 
 * A proxy receives client requests, does some work (access control, caching, etc.) and then passes the request to a service object.
 * 
 * Usage examples: While the Proxy pattern isn’t a frequent guest in most Java applications, it’s still very handy in some special cases. 
 * It’s irreplaceable when you want to add some additional behaviors to an object of some existing class without changing the client code.
 * 
 * Identification: Proxies delegate all of the real work to some other object. 
 * Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.
 */
public class Proxy {
    // In this example, the Proxy pattern helps to implement the lazy initialization and caching to an inefficient 3rd-party YouTube integration library.
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
