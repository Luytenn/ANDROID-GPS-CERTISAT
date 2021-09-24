
package net.larntech.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAuth {

    @SerializedName("access_token")
    @Expose
    private String access_token;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("photoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("active")
    @Expose
    private Boolean active;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseAuth() {
    }

    /**
     * 
     * @param photoUrl
     * @param created
     * @param active
     * @param email
     * @param access_token
     * @param username
     */
    public ResponseAuth(String access_token, String username, String email, String photoUrl, String created, Boolean active) {
        super();
        this.access_token = access_token;
        this.username = username;
        this.email = email;
        this.photoUrl = photoUrl;
        this.created = created;
        this.active = active;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String token) {
        this.access_token = access_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
