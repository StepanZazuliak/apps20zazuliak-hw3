package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray sa, MyComparator cmp) {

        super(sa);
        this.smartArray = new BaseArray(insertionSort(sa.toArray(), cmp));
    }

    private Object[] insertionSort(Object[] arr, MyComparator cmp) {

        Object[] newArray = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < newArray.length; i++) {

            Object tmp = newArray[i];
            int j;

            for (j = i; j > 0 && cmp.compare(newArray[j], newArray[j - 1]) < 1; j--) {

                newArray[j] = newArray[j - 1];
            }

            newArray[j] = tmp;
        }

        return newArray;
    }

    @Override
    public String operationDescription() {

        return "Sort elements to compare them (use MyComparator)";
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
