package fr.eni.tp;

public class AccountObserver implements Observer{

    @Override
    public void onChange() {
        System.out.println("L'état du compte a changée / Aucune info pour l'instant");
    }
}
