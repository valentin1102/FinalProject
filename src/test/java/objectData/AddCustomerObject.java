package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCustomerObject extends GeneralObject {


    public AddCustomerObject(String filePath) {
        fromJsontoObject(filePath);
    }

    private String firstNameValue;
    private String lastNameValue;
    private String postCodeValue;
}
