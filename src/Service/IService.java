package Service;

import model.Chambre;
import model.Etudiant;
import model.Pavillon;

public interface IService {
    public void addPavillon(Pavillon pavillon);

    public void deletePavillon(Pavillon pavillon);

    public void listerPavillon();

    public void addEtudiant(Etudiant etudiant);

    public void addChambre(Chambre Chambre);

    public void listerChambre();

    public void deletePavillon(int id);

    public int getPositionPavillon(int id);

}
