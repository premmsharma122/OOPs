import java.util.ArrayList;

interface Subscriber{
    void update(String videoTitle);
}
class User implements Subscriber{
    private String name;
    User(String name){
        this.name = name;
    }
    @Override
    public void update(String videoTitle){
        System.out.println(name+" received notification:");
        System.out.println(videoTitle+" uploaded.");
        System.out.println();
    }
}
interface Channel{
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();
}
class YouTubeChannel implements Channel{
    private String channelName;
    private String videoTitle;

    private ArrayList<Subscriber> subscribers;
    YouTubeChannel(String channelName){
        this.channelName=channelName;
        subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(){
        for(Subscriber s : subscribers){
            s.update(videoTitle);
        }
    }
    void uploadVideo(String videoTitle){
        this.videoTitle = videoTitle;
        System.out.println(channelName+" uploaded a new video");
        System.out.println(videoTitle);
        System.out.println();
        notifySubscribers();
    }
    
}
public class day24 {
       public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("CodeWithPrem");
        Subscriber s1 = new User("Prem1");
        Subscriber s2 = new User("Dev");
        Subscriber s3 = new User("Sharma");
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Observer Pattern in Java");
        System.out.println("------------");
        channel.unsubscribe(s2);
        channel.uploadVideo("Factory Pattern in Java");

       }
}
