package utility;

import java.io.Serializable;

/**
 *
 * @author Gary Roberts
 */
public class DatabaseSettings implements Serializable {

    private String username;
    private String password;
    private String databaseURL;

    public DatabaseSettings() {
        this.databaseURL = "";
        this.password = "";
        this.username = "";
    }

    public DatabaseSettings(String databaseUrl, String user, String password) {
        this.databaseURL = databaseUrl;
        this.username = user;
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the databaseURL
     */
    public String getDatabaseURL() {
        return databaseURL;
    }

    /**
     * @param databaseURL the databaseURL to set
     */
    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }

}
