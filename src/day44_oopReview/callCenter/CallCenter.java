package day44_oopReview.callCenter;

public class CallCenter {

    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.launch();
        whatsApp.allOSCompatible = true;
        whatsApp.isFree = true;
        whatsApp.name = "Whatsapp";
        whatsApp.call("Mr.White");
        whatsApp.sendMessage("Mr.White");
        whatsApp.videoCall();
        whatsApp.accept();
        System.out.println("whatsApp.APP_TYPE = " + WhatsApp.APP_TYPE);
        VoiceCallable.decline();
        System.out.println("VoiceCallable.CAN_CALL = " + VoiceCallable.CAN_CALL);
        WhatsApp.setCount(4);
        System.out.println("WhatsApp.getCount() = " + WhatsApp.getCount());

        VoiceCallable obj = new WhatsApp();
        //MessagingApp ma = (MessagingApp) obj;
        ((MessagingApp) obj).launch();
        System.out.println("((MessagingApp) obj).allOSCompatible = " + ((MessagingApp) obj).allOSCompatible);
        ((WhatsApp) obj).allOSCompatible = false;//whatsapp class inherited the field from Messaging abstract class
        System.out.println("((MessagingApp) obj).allOSCompatible = " + ((MessagingApp) obj).allOSCompatible);

        obj.call("Mr.Mike");

        ((VideoCallable) obj).videoCall();
        ((WhatsApp) obj).videoCall();



    }

}
