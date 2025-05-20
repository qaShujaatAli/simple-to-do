package core.utils.APICore;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredRunner {

    //REQUEST Object
    public static RequestSpecification requestSpecObject=null;

    public static void initializeAPIRequestObject()
    {
        if (requestSpecObject == null)
            requestSpecObject = RestAssured.given().log().all();
    }

    public static RequestSpecification getRequestObject()
    {
        if (requestSpecObject != null)
            return requestSpecObject;
        else
            System.out.println("API Request Object not Initialized!");
        return null;
    }

    public static void setRequestObjectNull()
    {
        if (requestSpecObject != null)
        {
            System.out.println("In setRequestObjectNull ... ");
            requestSpecObject = null;
        }
    }

}
