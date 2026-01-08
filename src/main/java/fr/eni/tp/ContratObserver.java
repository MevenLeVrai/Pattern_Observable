package fr.eni.tp;

public class ContratObserver extends TypedObserver<String> {

    public String number;

    public ContratObserver(String number) {
        this.number = number;
    }

    @Override
    public void onChange(String key, String data) {

        this.number = data;

    }
}
