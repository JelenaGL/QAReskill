
package data.models;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PatchPrivateCrocodileResponse implements Serializable
{

    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    private final static long serialVersionUID = -3867743391612149589L;


    public PatchPrivateCrocodileResponse() {
    }


    public PatchPrivateCrocodileResponse(String dateOfBirth) {
        super();
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}