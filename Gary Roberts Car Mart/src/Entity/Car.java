
package entity;

/**
 *
 * @author user
 */
public class Car {
    private String carName;
    private double carPrice;
    private String carDescription;
    private String photoPath;

    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName the carName to set
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return the carPrice
     */
    public double getCarPrice() {
        return carPrice;
    }

    /**
     * @param carPrice the carPrice to set
     */
    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    /**
     * @return the carDescription
     */
    public String getCarDescription() {
        return carDescription;
    }

    /**
     * @param carDescription the carDescription to set
     */
    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    /**
     * @return the photoPath
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * @param photoPath the photoPath to set
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
   
}
