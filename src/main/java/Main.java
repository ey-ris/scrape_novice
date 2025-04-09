import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Fetch the HTML page
            Document doc = Jsoup.connect("http://quotes.toscrape.com").get();

            // Step 2: Select quote elements
            Elements quotes = doc.select("span.text");
            Elements authors = doc.select("small.author");

            // Step 3: Print each quote with its author
            for (int i = 0; i < quotes.size(); i++) {
                System.out.println(quotes.get(i).text() + " — " + authors.get(i).text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
