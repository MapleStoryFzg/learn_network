import java.net.InetAddress;

/**
 * Created by minlc on 2017/8/10.
 */
public class Example01 {
    public static void main(String[] args) throws Exception {
        InetAddress localAddress = InetAddress.getLocalHost();
        InetAddress remoteAddress = InetAddress.getByName("www.itcast.com");
        System.out.println("本机的ip地址" + localAddress.getHostAddress());
        System.out.println("itcast的IP地址" + remoteAddress.getHostAddress());
        System.out.println("3秒是否可达" + remoteAddress.isReachable(3000));
        System.out.println("itcast的主机名为：" + remoteAddress.getHostName());

    }
}
