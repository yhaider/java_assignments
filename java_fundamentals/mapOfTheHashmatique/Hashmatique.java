import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Radioactive", "I'm waking up to ash and dust/I wipe my brow and I sweat my rust...");
        trackList.put("Something About Us", "It might not be the right time/I might not be the right one...");
        trackList.put("Kids", "You were a child/Crawling on your knees toward him...");
        trackList.put("Mad World", "All around me are familiar faces/Worn out places, worn out faces...");

        System.out.println(trackList.get("Kids"));

        for (String key: trackList.keySet()) {
            System.out.println("Title: "+key);
            System.out.println("Lyrics: "+trackList.get(key));
        }
    }
    // Creates a hashmap of four songs with their titles as keys
    // and their lyrics associated with the titles
    // We first get one song's lyrics by its title
    // and then we have it print title and lyric of every song in list
}
