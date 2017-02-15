import java.io.*;
import java.net.*;
/**
 *
 * @author harrikr
 */
public class SendEmailDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            System.out.println("Connecting...");
            String host = "127.0.0.1";
            int port = 25;
            Socket socket = new Socket(host,port);
            System.out.println("Connected");
            
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF8"));
            BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            
            // Menunggu respon
            System.out.println("Respon:");   
            line = rd.readLine();
            System.out.println(line);
            
            //Kirim HELO
            System.out.println("Kirim HELO");                                    
            wr.write("HELO jarkom\r\n");           
            wr.flush();
            System.out.println("Respon:");                        
            line = rd.readLine();
            System.out.println(line);  
            
            
            //Kirim MAIL FROM
            System.out.println("Kirim MAIL FROM");                                    
            wr.write("MAIL FROM: <a@blackcobra.com>\r\n");            
            wr.flush();
            System.out.println("Respon:");                        
            line = rd.readLine();
            System.out.println(line); 
            
            //Kirim RCPT TO
            System.out.println("Kirim RCPT TO");                                    
            wr.write("RCPT TO: <b@blackcobra.com>\r\n");            
            wr.flush();
            System.out.println("Respon:");                        
            line = rd.readLine();
            System.out.println(line);
            
             //Kirim DATA
            System.out.println("Kirim DATA");                                    
            wr.write("DATA\r\n");           
            wr.flush();
            System.out.println("Respon:");                        
            line = rd.readLine();
            System.out.println(line);
            
            System.out.println("Kirim Isi EMail");   
            wr.write("From: akun1<a@blackcobra.com>\r\n");
            wr.write("To: akun2<b@blackcobra.com>\r\n");
            wr.write("Subject: ini subjek email\r\n");
            wr.write("\r\n");
            wr.write("Ini isi email. Sekedar uji coba email\r\n");  
            wr.write(".\r\n");
            wr.flush();
            System.out.println("Respon:");                        
            line = rd.readLine();
            System.out.println(line);
            
            //Kirim Quit
            System.out.println("Kirim QUIT");                                    
            wr.write("QUIT\r\n");            
            wr.flush();
            System.out.println("Respon:");         
            line = rd.readLine();
            System.out.println(line);
                        
            
            wr.close();
            rd.close();
            socket.close();    
            System.out.println("Disconnected");
            
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
