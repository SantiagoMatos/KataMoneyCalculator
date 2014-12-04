package model;

import java.util.ArrayList;

public class CurrencySet {

    //ArrayList<> currencySet;
    ArrayList<Currency> currencyList = new ArrayList<>();

    public CurrencySet() {
    }

    public void add(Currency from) {
       // currencyList.put(from.getCode(), from);
        currencyList.add(from);
    }
    
    public Currency get (int index){
        return this.currencyList.get(index);
    }

    public Currency[] toArray() {
        return this.currencyList.toArray(new Currency[currencyList.size()]);
    }

}
