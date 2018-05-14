package net.lazexe.stringutil;

import android.support.annotation.NonNull;

import java.util.regex.Pattern;

/**
 * Created by Maksym Lazarenko on 14.05.2018.
 * Skype: lazexe
 */
public class EmailUtils {

    private static final Pattern EMAIL_ADDRESS_PATTERN =
            Pattern.compile("[a-zA-Z0-9+._%\\-+]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    public static boolean isEmailValid(@NonNull String email) {
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }
}
