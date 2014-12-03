package mockpersistance;

import model.CurrencySet;

public class CurrencySetLoader implements persistance.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        // Aqui vendria la base de datos
        CurrencySet set = new CurrencySet();
        set.add(null);
        return set;
    }

}
