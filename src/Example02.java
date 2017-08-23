import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by minlc on 2017/8/10.
 */
//接收端程序
public class Example02 {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[1024];
        DatagramSocket ds = new DatagramSocket(8954);
        DatagramPacket dp = new DatagramPacket(buf,1024);
        System.out.println("等待接收数据");
        ds.receive(dp);//等待接收数据，如果没有数据则会阻塞
        String str = new String(dp.getData(),0,dp.getLength()) + "from"
                + dp.getAddress().getHostAddress() + ":" +dp.getPort();
        System.out.println(str);
        ds.close();//释放资源
    }
}
