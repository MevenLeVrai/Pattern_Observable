package fr.eni.tp;

public class AccountObserver extends TypedObserver<Long> {

    @Override
    public void onChange(String key, Long data) {

        System.out.println("Appel avec un montant envoyé");
        System.out.println(String.format("L'état du compte a changé : %d",  data));
    }
}
