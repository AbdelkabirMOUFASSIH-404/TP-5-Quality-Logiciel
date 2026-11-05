package library.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import library.model.Lendable;

public class Library {
    private final List<Lendable> items = new ArrayList<>();

    public void addItem(Lendable item)    { items.add(item); }
    public void removeItem(Lendable item) { items.remove(item); }

    /** Bug corrigé : ne renvoie que les éléments réellement disponibles. */
    public List<Lendable> getAvailableItems() {
        List<Lendable> available = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    /** Plus de instanceof ni de dépendance vers Book : polymorphisme. */
    public List<String> describeAllItems() {
        List<String> lines = new ArrayList<>();
        for (Lendable item : items) {
            lines.add(item.getDescription());
        }
        return Collections.unmodifiableList(lines);
    }
}
