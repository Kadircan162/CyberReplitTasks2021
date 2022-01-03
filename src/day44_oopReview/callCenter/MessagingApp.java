package day44_oopReview.callCenter;

public abstract class MessagingApp {

    public String name;
    protected boolean isFree;
    boolean allOSCompatible = true;
    private static int count;
    public static final String APP_TYPE;

    static {
        APP_TYPE = "Messenger";
    }

    public MessagingApp(){
        System.out.println("Messaging no-arg constructor");
    }

    public MessagingApp(String name, int count){
        this.name = name;
        MessagingApp.count = count;
    }

    public abstract void sendMessage(String msg);

    public void launch(){
        System.out.println("MessagingApp is launching");
    }

    public static void close(){
        System.out.println("MessagingApp is closing");
    }

    public static void setCount(int count) {
        MessagingApp.count = count;
    }

    public static int getCount() {
        return count;
    }


}
