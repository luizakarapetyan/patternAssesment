package com.synisys.ns.test;
import com.synisys.ns.*;
import org.junit.Assert;
import org.junit.Test;



public class NotificationSenderTest {
    @Test
    public void testSendNotificationFactory() {
        final Notification n = new Notification();

        SenderFactory senderFactory = new SenderFactory();

        Assert.assertEquals(senderFactory.getSender(TransferType.EMAIL).getClass(), MailSender.class);
        Assert.assertEquals(senderFactory.getSender(TransferType.SMS).getClass(), SmsSender.class);
        Assert.assertEquals(senderFactory.getSender(TransferType.SYSTEM).getClass(), SystemSender.class);


    }
}
