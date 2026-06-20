class Logger{
    private static Logger instance;
    private int logCount;
    private Logger(){};
    static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    void log(String s){
        logCount+=1;
        System.out.println("Message :"+s);
    }
    void displayLogCount(){
        System.out.println(logCount);
    }
}
public class day12 {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.displayLogCount();
        l2.displayLogCount();
        l1.log("L1");
        l2.log("L2");
    }
}
