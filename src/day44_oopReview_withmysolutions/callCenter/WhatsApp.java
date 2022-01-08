package day44_oopReview_withmysolutions.callCenter;

public class WhatsApp extends MessagingApp implements VideoCallable,VoiceCallable{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Whatsapp - sending a message to " + msg);
    }

    @Override
    public void videoCall() {
        System.out.println("Whatsapp - doing a video call with Mr. White");
    }

    @Override
    public void call(String contact) {
        System.out.println("Whatsapp - calling " + contact + "...");
    }
}
