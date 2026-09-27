package com.elgindy.sendemailbyjavaemailapi;

public class Utils {
    // Your sender Gmail address and its 16-character App Password are read at build
    // time from email.properties (git-ignored). Copy email.properties.example to
    // email.properties and fill in your own values — see README.

    public static final String EMAIL = BuildConfig.SENDER_EMAIL;
    public static final String PASSWORD = BuildConfig.SENDER_APP_PASSWORD;
}
