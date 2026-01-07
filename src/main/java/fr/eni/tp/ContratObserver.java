package fr.eni.tp;

public class ContratObserver implements Observer{

    public String id;

    public ContratObserver(String _Id){
        this.id = _Id;
    }

    @Override
    public void onChange() {
        System.out.println("Le compte numéro : " + id + " à changé");
    }
}
