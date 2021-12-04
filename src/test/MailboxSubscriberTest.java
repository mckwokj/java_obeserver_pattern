package test;

import observable.Mailbox;
import observer.Subscriber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class MailboxSubscriberTest {
    @Test
    void should_send_messages_to_all_subscribers_when_set_mailbox_message_given_2_subscriber_and_mailbox() {
        // given
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        Mailbox mailbox = new Mailbox();

        mailbox.register(subscriber1);
        mailbox.register(subscriber2);

        String message = "Thanks for subscribing!";

        // when
        mailbox.setMessage(message);

        // then
        assertEquals(message, subscriber1.getMessage());
        assertEquals(message, subscriber2.getMessage());
    }
}
