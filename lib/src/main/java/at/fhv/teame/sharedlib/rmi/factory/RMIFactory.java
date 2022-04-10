package at.fhv.teame.sharedlib.rmi.factory;

import at.fhv.teame.sharedlib.rmi.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIFactory extends Remote {
    SearchSoundCarrierService createSearchSoundCarrierServiceImpl() throws RemoteException;

    PurchaseSoundCarrierService createPurchaseSoundCarrierServiceImpl() throws RemoteException;

    SearchCustomerService createSearchCustomerServiceImpl() throws RemoteException;

    SearchInvoiceService createSearchInvoiceServiceImpl() throws RemoteException;

    AuthenticationService createSearchAuthenticationServiceImpl() throws RemoteException;

    ReturnSoundCarrierService createReturnSoundCarrierService() throws RemoteException;
}
