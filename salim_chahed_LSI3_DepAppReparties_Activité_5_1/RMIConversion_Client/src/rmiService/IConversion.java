package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface définissant les méthodes à rendre disponibles à distance via RMI
public interface IConversion extends Remote {

    // Signature de la méthode distante pour la conversion de montant
    // La méthode peut lancer une RemoteException en cas d'erreur de communication
    double convertirMontant(double mt) throws RemoteException;

}
