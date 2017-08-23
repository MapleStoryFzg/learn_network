import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by minlc on 2017/8/10.
 */
public class Example03 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        String str = "hello world";//要发送的数据
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("localhost"),8954);
        System.out.println("发送信息");
        ds.send(dp);
        ds.close();
    }
}
