package fr.eni.tp;

public class EmailObserver extends TypedObserver<String> {

    @Override
    public void onChange(String key, String data) {
        System.out.println(" Appel avec un email envoyé");
        System.out.println(String.format("L'email change : %s", data));
    }
}
