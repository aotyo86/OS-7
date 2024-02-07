import java.util.Enumeration;
import java.net.NetworkInterface;
import java.net.InetAddress;

public class info2{
    public static void main(String[] args) {
        try {
            Enumeration intf = NetworkInterface.getNetworkInterfaces();
            while (intf.hasMoreElements()) {
                NetworkInterface Nintf = (NetworkInterface)intf.nextElement();
                System.out.println("このネットワークインターフェースの名前は " + Nintf.getName() + " です。");
                System.out.println("  このネットワークインターフェースのすべてのIPアドレスは以下の通りです:");
                Enumeration addresses = Nintf.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = (InetAddress)addresses.nextElement();
                    System.out.println("    " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
