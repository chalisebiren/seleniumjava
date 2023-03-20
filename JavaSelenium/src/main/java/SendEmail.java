import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
public class SendEmail
{
    public static void main(String[] args) throws EmailException
    {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("birend448@gmail.com", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("biren448@gmail.com");
        email.setSubject("Automation Test Report");
        email.setMsg("This is the test result of automation test execution !!!");
        email.addTo("chalisebiren@gmail.com");
        email.send();
    }}