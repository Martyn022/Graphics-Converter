import graphics.image.Convert;
import graphics.image.TextGraphicsConverter;
import graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Convert();
        GServer server = new GServer(converter);
        server.start();

        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }

}