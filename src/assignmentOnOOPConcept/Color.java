package assignmentOnOOPConcept;

//Question-13
import java.util.*;

public class Color {
    private int[] rgb = new int[3];

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};

    public Color(int r, int g, int b){
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }

    public Color() {
        this(255, 255, 255);
    }

    public String toString() {

        int[][] colorsArr = {WHITE, LIGHT_GRAY, GRAY, DARK_GRAY, BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA, CYAN, BLUE};
        String[] colors = {"WHITE", "LIGHT GREY", "GRAY", "DARK GREY", "BLACK", "RED", "PINK", "ORANGE", "YELLOW", "GREEN", "MAGENTA", "CYAN", "BLUE"};

        for (int i=0; i<colorsArr.length; i++){
            if(Arrays.equals(rgb, colorsArr[i])){
                return colors[i].toLowerCase();
            }
        }
        return "n/a";
    }
}

class Test13{
    public static void main(String[] args) {
        Color color = new Color();
        System.out.println(color.toString() ) ; // prints "white"

        Color color2 = new Color(255, 0, 0);
        System.out.println(color2.toString() ) ; // prints "red"

        Color color3 = new Color(255, 44, 88);
        System.out.println(color3.toString() ) ; // prints "n/a"

        Color color4 = new Color(192, 192, 192);
        System.out.println(color4 ) ; // prints "light gray"
    }
}
