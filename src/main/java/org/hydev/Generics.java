package org.hydev;

import lombok.Setter;
import lombok.val;

import java.util.Date;

// Section 3 - 3 of https://www.cnblogs.com/wuqinglong/p/9456193.html.
class Pair<T> {
    @Setter
    private T value;
}

// We override getter & setter in subclass.
class DateInter extends Pair<Date> {
    @Override
    public void setValue(Date value) {
        super.setValue(value);
    }
}

public class Generics {
    public static void main(String[] args) {
        // We have a dataInter object, we can invoke setValue with a new Date().
        val dataInter = new DateInter();
        dataInter.setValue(new Date());

        // But Java's generic implementation is wipe.
        // So actually, super class has function "void setValue(Object o)", subclass has "void setValue(Date value)".
        // This is not override, this is overload, right? If it is overload, the function invocation below is ok.
        // But It can't, what happens? Well, JVM auto generates a "bridge" function to avoid this.
        // dataInter.setValue(new Object());
    }
}
