package fr.eni.tp;

public class TPObserverMain {
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

        // Notifier un mail
        System.out.println("Appel avec un email envoyé");
        observable.notifyObservers("email", "titi@gmail.com");

        // Notifier un montant
        System.out.println("Appel avec un montant envoyé");
        observable.notifyObservers("amount", 256L);
    }
}
