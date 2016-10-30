package model;
import java.util.Date;
import javax.mail.Message;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @web http://blog.jheysonmatta.com.pe
 * @author Jheyson Matta
 */
public class Mail {

    private String from = "aa10013@ues.edu.sv";//tu_correo@gmail.com
    private String password = "47327";//tu password: 123456 :)
    private InternetAddress[] addressTo;// destinatario1@hotmail.com,destinatario2@hotmail.com, destinatario_n@hotmail.com
    private String Subject = "";//titulo del mensaje
    private String MessageMail = "";//contenido del mensaje

    public Mail(){}

    public void SEND() throws IOException
    {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.user", "usuario");
            props.put("mail.smtp.port", 25);
            //
            SMTPAuthenticator auth = new SMTPAuthenticator( getFrom(), getPassword() );
            Session session = Session.getDefaultInstance(props, auth);
            session.setDebug(false);
            //Se crea destino y origen del mensaje
            MimeMessage mimemessage = new MimeMessage(session);
            InternetAddress addressFrom = new InternetAddress( getFrom() );
            mimemessage.setFrom(addressFrom);
            mimemessage.setRecipients(Message.RecipientType.TO, addressTo);
            mimemessage.setSubject( getSubject() );
            // Se crea el contenido del mensaje
            MimeBodyPart mimebodypart = new MimeBodyPart();
            mimebodypart.setText( getMessage() );
            mimebodypart.setContent( getMessage() , "text/html");
            Multipart multipart = new MimeMultipart();
            
            //se lee la plantilla html
            
            InputStream inputStream = getClass().getResourceAsStream("PlantillaUno");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            
            //se almacena el contenido de la plantilla en un stringbuffer
            
            String strLine;
            StringBuffer msjHTML = new StringBuffer();
            while ((strLine = bufferedReader.readLine())!= null) {
                msjHTML.append(strLine);
         
            }
            
            //url directorio de las imagenes
            
            String urlImagenes = "C:\\Users\\Alex\\Desktop\\IMG";
            File directorio = new File(urlImagenes);
            
            //obtenes los nombres de las imagenes en el directorio
            String[] imagenesDirectorio = directorio.list();
            
            //creo la parte del mensaje html
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msjHTML.toString(),"text/html");
            
            //validar que el directorio si tenga las imagenes
            
            if (imagenesDirectorio != null) {
				for (int count = 0; count < imagenesDirectorio.length; count++) {

					MimeBodyPart imagePart = new MimeBodyPart();
					imagePart.setHeader("Content-ID", "<"
							+ imagenesDirectorio[count] + ">");
					imagePart.setDisposition(MimeBodyPart.INLINE);
					imagePart.attachFile(urlImagenes
							+ imagenesDirectorio[count]);
					multipart.addBodyPart(imagePart);
				}
			} else {
				System.out.println("No hay imagenes en el directorio");
			}
            
            //agregar la parte del mensaje HTML al multipart
            multipart.addBodyPart(mimebodypart);

            //agregar el multipart al cuerpo del mensaje
            mimemessage.setContent(multipart);          
            
            mimemessage.setSentDate(new Date());
            
            
            Transport.send(mimemessage);
            //JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (MessagingException ex) {
            System.out.println(ex);
        }

    }
    //remitente
    private void setFrom(String mail){ this.from = mail; }
    private String getFrom(){ return this.from; }
    //Contraseña
    public void setPassword(char[] value){
        this.password = new String(value);
    }
    public String getPassword(){ return this.password; }
    //destinatarios
    public void setTo(String mails){
        String[] tmp =mails.split(",");
        addressTo = new InternetAddress[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try {
                addressTo[i] = new InternetAddress(tmp[i]);
            } catch (AddressException ex) {
                System.out.println(ex);
            }
        }
    }
    public InternetAddress[] getTo(){ return this.addressTo; }
    //titulo correo
    public void setSubject(String value){ this.Subject = value; }
    public String getSubject(){ return this.Subject; }
    //contenido del mensaje
    public void setMessage(String value){ this.MessageMail = value; }
    public String getMessage(){ return this.MessageMail; }

}
