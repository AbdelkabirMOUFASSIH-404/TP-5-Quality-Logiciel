package library.util;

import java.util.ArrayList;
import java.util.List;

/** Ancienne Book.complexMethodExample : logique extraite hors du modèle. */
public final class NumberClassifier {
    private NumberClassifier() { }

    /** Un seul nombre : retours anticipés, pas de else (CC = 3). */
    public static String classify(int i) {
        if (i % 2 == 0) {
            return i + " is even";
        }
        if (i % 3 == 0) {
            return i + " divisible by 3";
        }
        return i + " something else";
    }

    public static List<String> classifyUpTo(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(classify(i));
        }
        return result;
    }
}
