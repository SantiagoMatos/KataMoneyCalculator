package model;

import java.util.HashMap;

public class CurrencySet {

    //ArrayList<> currencySet;
    HashMap<String, Currency> currencySet = new HashMap<>();

    public CurrencySet() {
    }

    public void add(Currency from) {
        currencySet.put(from.getCode(), from);
    }

    public Currency[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
