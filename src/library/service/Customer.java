package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Customer {
    private final String name;
    private final List<Lendable> checkedOutItems = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    /** L'élément n'est enregistré que si l'emprunt a réellement réussi. */
    public boolean checkOutItem(Lendable item) {
        if (item.borrow()) {
            checkedOutItems.add(item);
            return true;
        }
        return false;
    }

    public boolean returnItem(Lendable item) {
        return checkedOutItems.remove(item) && item.returnItem();
    }
}
