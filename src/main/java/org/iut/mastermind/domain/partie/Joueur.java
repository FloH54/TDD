package org.iut.mastermind.domain.partie;

public record Joueur(String nom) {

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass().equals(Joueur.class)) {
            return ((Joueur) o).getNom().equals(this.getNom());
        } else  {
            return false;
        }
    }

}
