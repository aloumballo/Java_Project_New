import model.Chambre;
import model.Pavillon;
import Service.IService;
import Service.ServiceTableau;
public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // IService Service = new ServiceTableau();

        IService service = new ServiceTableau();
        Pavillon pavillon = new Pavillon();
        pavillon.setId(1);
        pavillon.setNumero(1);
        pavillon.setNbreEtage(4);
        service.addPavillon(pavillon);
        service.listerPavillon();
    }
}
