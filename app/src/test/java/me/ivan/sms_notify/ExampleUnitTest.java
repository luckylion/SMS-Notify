package me.ivan.sms_notify;

import org.junit.Test;

import javax.mail.MessagingException;

import me.ivan.sms_notify.services.SMTPService;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void sendEmail() throws MessagingException {
        new SMTPService("2967948168@qq.com",true,"smtp.qq.com",587,"","2967948168@qq.com")
                .send("hello","content");
    }
}