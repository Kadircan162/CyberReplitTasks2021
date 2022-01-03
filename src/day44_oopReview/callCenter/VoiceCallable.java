package day44_oopReview.callCenter;

public interface VoiceCallable {

    boolean CAN_CALL = false;

    void call(String contact);

    static void decline(){
        System.out.println("Mike declined voice call..");
    }

    default void accept(){
        System.out.println("Mr.White finally accepted voice call");
    }

}
