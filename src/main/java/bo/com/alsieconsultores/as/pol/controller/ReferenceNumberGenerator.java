package bo.com.alsieconsultores.as.pol.controller;

import java.util.UUID;

public class ReferenceNumberGenerator implements IReferenceNumberGenerator {
    @Override
    public String getReferenceNumber() {
        // we will mock a database based generated UUID
        // in actual sceneario should a reference number like YEAR-HIRINGNO-UNIQUEIDENTIFIER
        // Where YEAR = the current year 4 digits
        //       HIRINGNO = the number of hiring process, e.g. 01, 02, 03, and so, two digits
        //TODO implement a method that generate the unique identifier for the current applicant, pick above instructions as a guide
        return UUID.randomUUID().toString();
    }
}
