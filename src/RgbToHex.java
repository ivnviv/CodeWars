import java.awt.*;


public class RgbToHex {
    public static String rgb(int r, int g, int b) {

        int red = Math.max(0, Math.min(r, 255));
        int green = Math.max(0, Math.min(g, 255));
        int blue = Math.max(0, Math.min(b, 255));

        Color color = new Color(red, green, blue);
        String hex = Integer.toHexString(color.getRGB()).substring(2).toUpperCase();

        return  hex;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0, 0, 0) + " ОР: 000000");
        System.out.println(rgb(1, 2, 3) + " ОР: 010203");
        System.out.println(rgb(255, 255, 255) + " ОР: FFFFFF");
        System.out.println(rgb(254, 253, 252) + " ОР: FEFDFC");
        System.out.println(rgb(-20, 275, 125) + " ОР: 00FF7D");

    }
}
