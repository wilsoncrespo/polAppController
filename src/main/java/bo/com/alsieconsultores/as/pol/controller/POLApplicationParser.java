package bo.com.alsieconsultores.as.pol.controller;

import bo.com.alsieconsultores.as.pol.model.POLApplication;
import bo.com.alsieconsultores.as.pol.model.POLApplicationPersonalInfo;
import bo.com.alsieconsultores.as.pol.model.POLApplicationResume;
import org.json.JSONObject;

public interface POLApplicationParser {
    POLApplicationResume parsePOLApplicationResume(JSONObject polApplicationResumeAsJSONObject);
    POLApplicationPersonalInfo parsePOLApplicationPersonalInfo(JSONObject polApplicationPersonalInfoAsJSONObject);
    POLApplication pasrsePOLApplication(JSONObject polApplicationAsJSONObject);
}
