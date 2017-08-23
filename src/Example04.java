import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by minlc on 2017/8/10.
 */
public class Example04 {
    public static void main(String[] args) throws Exception {
        new TCPServer().listen();
    }

    //TCP服务端
    static class TCPServer{
        private static final int PORT = 7788;
        public void listen() throws Exception {
            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket client = serverSocket.accept();
            OutputStream os = client.getOutputStream();
            System.out.println("开始于客户端交互数据");
            os.write(("传智播客欢迎你！").getBytes());
            Thread.sleep(5000);
            System.out.println("结束与客户端交互数据");
            os.close();
            client.close();
        }
    }
}
