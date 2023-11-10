package rmiServer;

import rmiService.ConversionImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ConversionServer   {

    public static void main(String[] args) {

        try {
            // Créer un registre RMI sur le port 1090
            LocateRegistry.createRegistry(1090);

            // Instancier l'implémentation de la conversion
            ConversionImpl od = new ConversionImpl();

            // Afficher les informations sur l'objet distant
            System.out.println(od.toString());

            // Publier l'objet distant avec le nom "ConversionObject" à l'URL spécifiée
            Naming.rebind("rmi://localhost:1090/ConversionObject", od);
        } catch (RemoteException | MalformedURLException e) {
            // Gérer les exceptions en les encapsulant dans une RuntimeException et les jeter
            throw new RuntimeException(e);
        }
    }
}
