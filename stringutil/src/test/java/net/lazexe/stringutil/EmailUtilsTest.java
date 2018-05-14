package net.lazexe.stringutil;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Maksym Lazarenko on 14.05.2018.
 * Skype: lazexe
 */
public class EmailUtilsTest {

    @Test
    public void testCorrectEmail() {
        assertTrue(EmailUtils.isEmailValid("example@google.com"));
    }

    @Test
    public void testWithoutDot() {
        assertFalse(EmailUtils.isEmailValid("example@googlecom"));
    }

    @Test
    public void testWithoutUsername() {
        assertFalse(EmailUtils.isEmailValid("@google.com"));
    }

    @Test
    public void testWithSpaces() {
        assertFalse(EmailUtils.isEmailValid("example@google .com"));
    }

    @Test
    public void testWithDots() {
        assertTrue(EmailUtils.isEmailValid("sample.example@google.com"));
    }
}
