package bo.com.alsieconsultores.as.pol.controller;

import bo.com.alsieconsultores.as.pol.model.POLApplication;
import bo.com.alsieconsultores.as.pol.model.POLApplicationPersonalInfo;
import bo.com.alsieconsultores.as.pol.model.POLApplicationResume;

public class POLApplicationController {
    private POLApplication polApplication;
    private String referenceNumber;
    private ReferenceNumberGeneratorImpl referenceNumberGenerator = new ReferenceNumberGeneratorImpl();

    public POLApplicationController(POLApplication polApplication) {
        this.referenceNumber = referenceNumberGenerator.getReferenceNumber();
        this.polApplication = polApplication;
        setReferenceNumber(this.polApplication.getPolApplicationPersonalInfo(), this.polApplication.getPolApplicationResume(), this.referenceNumber);
    }

    public void setReferenceNumber(POLApplicationPersonalInfo polApplicationPersonalInfo, POLApplicationResume polApplicationResume, String referenceNumber) {
        polApplicationPersonalInfo.setReferenceNumber(referenceNumber);
        polApplicationResume.setReferenceNumber(referenceNumber);
    }

    public void savePOLApplication() {
        //TODO call to the polApplicationProducer instance with the polApplication instance loaded and ready to be saved

    }
}
