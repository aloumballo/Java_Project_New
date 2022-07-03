package Service;

import model.Chambre;
import model.Pavillon;
import model.Etudiant;

public class ServiceTableau implements IService {
    public final int NBRE = 10;
    private Pavillon[] pavillons = new Pavillon[NBRE];
    private int indexPavillon;

    @Override
    public void addPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        if (indexPavillon < NBRE) {
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
        } else {
            System.out.println(" tableau bi féss na");
        }

    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addChambre(Chambre Chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deletePavillon(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getPositionPavillon(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void listerChambre() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deletePavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listerPavillon() {
        // TODO Auto-generated method stub
        for (Pavillon p : pavillons) {
            if (p != null) {
                System.out.println(p);
            }
        }

    }

}
