package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;


public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray sa, MyPredicate pr) {

        super(sa);

        ArrayList<Object> ls = new ArrayList<>();

        for (Object elem : sa.toArray()) {

            if (pr.test(elem)) {

                ls.add(elem);
            }
        }

        this.smartArray = new BaseArray(ls.toArray());
    }

    @Override
    public String operationDescription() {

        return null;
    }

    @Override
    public Object[] toArray() {

        return smartArray.toArray();
    }

    @Override
    public int size() {

        return 0;
    }
}
