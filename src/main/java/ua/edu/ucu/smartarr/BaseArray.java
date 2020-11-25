package ua.edu.ucu.smartarr;

import java.util.Arrays;


public class BaseArray implements SmartArray {

    private final Object[] objs;

    public BaseArray(Object[] objs) {

        this.objs = Arrays.copyOf(objs, objs.length);
    }

    @Override
    public String operationDescription() {

        return "BaseArray";
    }

    @Override
    public Object[] toArray() {

        return Arrays.copyOf(objs, objs.length);
    }

    @Override
    public int size() {

        return objs.length;
    }
}
