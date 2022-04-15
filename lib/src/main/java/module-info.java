module at.fhv.teame.sharedlib {
    requires java.rmi;
    requires java.naming;

    exports at.fhv.teame.sharedlib.dto;
    exports at.fhv.teame.sharedlib.rmi;
    exports at.fhv.teame.sharedlib.rmi.exceptions;
    exports at.fhv.teame.sharedlib.rmi.factory;
}