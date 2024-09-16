package objectData;

public class AddCustomerObject extends GeneralObject {


    public AddCustomerObject(String filePath) {
        fromJsontoObject(filePath);
    }

    private String firstNameValue;
    private String lastNameValue;

    public String getPostCodeValue() {
        return postCodeValue;
    }

    public void setPostCodeValue(String postCodeValue) {
        this.postCodeValue = postCodeValue;
    }

    private String postCodeValue;

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }






}
