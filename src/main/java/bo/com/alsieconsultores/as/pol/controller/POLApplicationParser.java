package bo.com.alsieconsultores.as.pol.controller;

import bo.com.alsieconsultores.as.pol.model.POLApplication;
import bo.com.alsieconsultores.as.pol.model.POLApplicationPersonalInfo;
import bo.com.alsieconsultores.as.pol.model.POLApplicationResume;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;

public class POLApplicationParser implements IPOLApplicationParser {
    @Override
    public POLApplicationResume parsePOLApplicationResume(JSONObject polApplicationResumeAsJSONObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        POLApplicationResume polApplicationResume = null;
        try {
            polApplicationResume = objectMapper.readValue(polApplicationResumeAsJSONObject.toString(), POLApplicationResume.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return polApplicationResume;
    }

    @Override
    public POLApplicationPersonalInfo parsePOLApplicationPersonalInfo(JSONObject polApplicationPersonalInfoAsJSONObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        POLApplicationPersonalInfo polApplicationPersonalInfo = null;
        try {
            polApplicationPersonalInfo = objectMapper.readValue(polApplicationPersonalInfoAsJSONObject.toString(), POLApplicationPersonalInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return polApplicationPersonalInfo;
    }

    @Override
    public POLApplication pasrsePOLApplication(JSONObject polApplicationAsJSONObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        POLApplication polApplication = null;
        try {
            polApplication = objectMapper.readValue(polApplicationAsJSONObject.toString(), POLApplication.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return polApplication;
    }
}
