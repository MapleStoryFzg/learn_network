import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by minlc on 2017/8/10.
 */
public class Example05 {
    public static void main(String[] args) throws Exception {
        new TCPClient().connect();
    }

    //测试mac提交
    //测试mac提交2
    //TCP客户端
    static class TCPClient {
        private static final int PORT=7788;
        public void connect() throws Exception {
            Socket client = new Socket(InetAddress.getLocalHost(),PORT);
            InputStream is = client.getInputStream();
            byte[] buf = new byte[1024];
            int len = is.read(buf);
            System.out.println(new String(buf,0,len));
            client.close();
        }
    }
}
