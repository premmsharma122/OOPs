class ConfigurationMannager{
    private String appName;
    private String version;
    private static ConfigurationMannager instance;
    private ConfigurationMannager(){};
    static ConfigurationMannager getInstance(){
        if(instance==null){
            instance = new ConfigurationMannager();
        }
        return instance;
    }
    void setConfig(String appName, String version){
        this.appName=appName;
        this.version=version;
    }
    void displayConfig(){
        System.out.println("Name: "+appName);
        System.out.println("Version: "+version);
    }
}
public class day13 {
    public static void main(String[] args) {
     ConfigurationMannager c1 =  ConfigurationMannager.getInstance();
     ConfigurationMannager c2 =  ConfigurationMannager.getInstance();
     c1.setConfig("App1", "112.11");
     c2.setConfig("App2", "11.212");
     c1.displayConfig();
     c2.displayConfig();
     System.out.println(c1==c2);
    }
}
