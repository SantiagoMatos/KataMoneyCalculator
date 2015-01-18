package model;

import java.util.ArrayList;

public class CurrencySet {

    private final ArrayList<Currency> currencyList = new ArrayList<>();

    public CurrencySet() {
    }

    public boolean add(Currency currency) {
        return currencyList.add(currency);
    }
    
    public Currency get (int index){
        return currencyList.get(index);
    }

    public Currency[] toArray() {
        return currencyList.toArray(new Currency[currencyList.size()]);
    }

}
