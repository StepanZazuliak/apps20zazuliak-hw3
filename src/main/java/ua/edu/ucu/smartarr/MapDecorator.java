package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;


public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray sa, MyFunction func) {

        super(sa);

        Object[] ls = sa.toArray();
        Object[] newElements = new Integer[sa.size()];

        for (int i = 0; i < sa.size(); i++) {

            newElements[i] = func.apply(ls[i]);
        }

        this.smartArray = new BaseArray(newElements);
    }

    @Override
    public String operationDescription() {

        return "Map all elements to other object (use MyFunction)";
    }

    @Override
    public Object[] toArray() {

        return smartArray.toArray();
    }

    @Override
    public int size() {

        return smartArray.size();
    }
}
