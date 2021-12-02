package assignmentOnStringAndMethodsDay29;

public class Q11RetriveSentencesFromMessage {
    public static void main(String[] args) {
        String message = "<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
        String[] info = {"Sender", "Phone Number", "Message body"};
        int firstIndex, lastIndex;
        lastIndex = message.indexOf(">");
        System.out.println(info[0] + ": " + message.substring(1, lastIndex));

        firstIndex = message.indexOf("[");
        lastIndex = message.indexOf("]");
        System.out.println(info[1] + ": " + message.substring(firstIndex+1, lastIndex));

        firstIndex = message.indexOf("{");
        lastIndex = message.indexOf("}");
        System.out.println(info[2] + ": " + message.substring(firstIndex+1, lastIndex));
    }

}
