
package klauer.extformsjersey;

import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A resource for testing ExtJS form submittal in Jersey.
 * <p>
 * Resource to be located at '/xml/form'
 * @author Nick Klauer (a03182) <nicholasklauer@alliantenergy.com>
 */
@Path("/xml/form")
public class ExtFormSubmitResource {


    @POST
    @Consumes("application/x-www-form-urlencoded")
    public void postForm(
            @FormParam("date_field") String date_field,
            @FormParam("slider_field") String slider_val,
            @FormParam("a_text_field") String text
            ) {
        System.out.println("Got the form, here are the values:" +
                "\n\tDate:\t" + date_field +
                "\n\tSlider:\t" + slider_val +
                "\n\tText:\t" + text);
    }
}
