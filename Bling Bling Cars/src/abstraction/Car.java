
package abstraction;

/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */
public abstract class Car {
       private String carCode;
        private String carName;
        private double carCost;
        private int CarModel;
        private int carStack;
        private String carDescription;


   abstract public void printDetails(); 
    
    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

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
     * @return the carCost
     */
    public double getCarCost() {
        return carCost;
    }

    /**
     * @param carCost the carCost to set
     */
    public void setCarCost(double carCost) {
        this.carCost = carCost;
    }

    /**
     * @return the CarModel
     */
    public int getCarModel() {
        return CarModel;
    }

    /**
     * @param CarModel the CarModel to set
     */
    public void setCarModel(int CarModel) {
        this.CarModel = CarModel;
    }

    /**
     * @return the carStack
     */
    public int getCarStack() {
        return carStack;
    }

    /**
     * @param carStack the carStack to set
     */
    public void setCarStack(int carStack) {
        this.carStack = carStack;
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
}
