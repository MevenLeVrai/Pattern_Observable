package fr.eni.tp;

public class App {

    public static void main(String[] args) {
        // Création de l'observable
        Observable observable = new Observable();

        // Création des observateurs
        Observer observer1 = new EmailObserver();
        Observer observer2 = new ContratObserver("148451841517");
        Observer observer3 = new AccountObserver();

        // Ajout des observateurs
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        // Modification le nombre
        System.out.println("Premier appel des observers dans l'observable...");
        observable.notifyObservers();

        // Suppression d'un observateur
        System.out.println("\nSuppression d'un observateur...");
        observable.removeObserver(observer2);
        observable.notifyObservers();
    }
}