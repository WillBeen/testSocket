package testBrowser;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
	public static void main(String [] args) throws IOException {
		InetAddress add;
		Socket soc = null;
		try {
			add = InetAddress.getByName("www.pmu.fr");
			soc = new Socket(add,80);
		} catch (UnknownHostException e) {
			System.out.println("hote introuvable");
		} catch (IOException e) {
			System.out.println("port ferme");
		} finally {
			if(soc != null) {
				try {
					soc.close();
				} catch(IOException e) {
					e.printStackTrace();
					soc = null;
				}
			}
		}
	}
}
