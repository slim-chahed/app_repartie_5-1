package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {
    // Constructeur par défaut de la classe ConversionImpl
    public ConversionImpl() throws RemoteException {
        // Appelle le constructeur de la classe mère UnicastRemoteObject
        super();
    }

    // Implémentation de la méthode distante convertirMontant
    @Override
    public double convertirMontant(double mt) throws RemoteException {
        // Effectue la conversion du montant en multipliant par le taux de change (ici, 3.3)
        return mt * 3.3;
    }
}
