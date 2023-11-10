package rmiClient;

import rmiService.IConversion;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ConversionClient {
    public static void main(String[] args) {
        // Déclarer l'instance de l'interface distante


        // Tenter de réaliser une communication RMI
        try {
            // Rechercher le service RMI avec l'URL spécifiée
            IConversion ic = (IConversion) Naming.lookup("rmi://localhost:1090/ConversionObject");

            // Appeler la méthode distante pour convertir un montant (par exemple, 10)
            double montantConv = ic.convertirMontant(3);

            // Afficher le montant converti0
            System.out.println("Montant converti : " + montantConv);
        }

        catch (NotBoundException | MalformedURLException | RemoteException e) {
            // Gérer les exceptions en les encapsulant dans une RuntimeException et les jeter
            throw new RuntimeException(e);
        }
    }
}
