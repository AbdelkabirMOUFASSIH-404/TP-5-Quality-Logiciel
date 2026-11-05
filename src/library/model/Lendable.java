package library.model;

/** Contrat commun à tout objet pouvant être emprunté. */
public interface Lendable {
    /** @return true si l'emprunt a réussi, false si l'objet était déjà emprunté. */
    boolean borrow();

    /** @return true si le retour a réussi, false si l'objet n'était pas emprunté. */
    boolean returnItem();

    boolean isBorrowed();

    /** Description lisible, utilisée par l'affichage (évite instanceof / cast). */
    String getDescription();
}
