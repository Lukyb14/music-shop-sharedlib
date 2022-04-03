package at.fhv.teame.sharedlib.rmi.factory;

import at.fhv.teame.sharedlib.rmi.PurchaseSoundCarrierService;
import at.fhv.teame.sharedlib.rmi.SearchCustomerService;
import at.fhv.teame.sharedlib.rmi.SearchSoundCarrierService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIFactory extends Remote {
    SearchSoundCarrierService createSearchSoundCarrierService() throws RemoteException;

    PurchaseSoundCarrierService createPurchaseSoundCarrierService() throws RemoteException;

    SearchCustomerService createSearchCustomerServiceImpl() throws RemoteException;
}
