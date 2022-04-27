module at.fhv.teame.sharedlib {
    requires java.rmi;
    requires java.naming;
    requires javax.ejb.api;

    exports at.fhv.teame.sharedlib.dto;
    exports at.fhv.teame.sharedlib.rmi;
    exports at.fhv.teame.sharedlib.exceptions;
    exports at.fhv.teame.sharedlib.rmi.factory;
}