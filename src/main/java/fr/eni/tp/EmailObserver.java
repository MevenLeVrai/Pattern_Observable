package fr.eni.tp;

public class EmailObserver implements Observer{

    @Override
    public void onChange() {
        System.out.println("L'email change mais on ne connais pas l'email");
    }
}
