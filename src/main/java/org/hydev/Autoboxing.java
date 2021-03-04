package org.hydev;

public class Autoboxing {
    public static void main(String[] args) {
        // This is auto-boxing.
        Integer autoBoxing = 0;
        // This is auto-unboxing.
        int autoUnboxing = autoBoxing;

        // How it implement?
        // In fact. auto-boxing will be translated like this:
        autoBoxing = Integer.valueOf(0);
        // Auto-unboxing will be translated like this:
        autoUnboxing = autoBoxing.intValue();

        // Let's take look something confused.
        // First statement will print "true", second statement will print "false".
        System.out.println(Integer.valueOf(0) == Integer.valueOf(0));
        System.out.println(Integer.valueOf(200) == Integer.valueOf(200));

        // Why? If you dig into source code of Integer, you may noticed a class IntegerCache.
        // It will cache all integers in [-128, 127], so it will not create new instances if in range.

        // Boolean are also same situation. It never create an object.
        // @see [Effective Java], Item 1.
    }
}
