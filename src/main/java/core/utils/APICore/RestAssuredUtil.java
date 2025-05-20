package core.utils.APICore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredUtil {

    public static String getResponseNode(Response response, String node)
    {
        JsonPath responsePath = response.jsonPath();
        if (responsePath.get(node)!=null)
            return responsePath.get(node).toString();
        return null;
    }

}
