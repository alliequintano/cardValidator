


public class CardValidator {


    public boolean validateLength(String inputCardNumber) {

        if (inputCardNumber.length() >= 14 && inputCardNumber.length() <= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean stringContainsOnlyNumbers(String inputCardNumber) {

        for(int i = 0;i < inputCardNumber.length();i++) {

            if (!Character.isDigit(inputCardNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean cardValidator(String inputCardNumber) {

        if (validateLength(inputCardNumber) && stringContainsOnlyNumbers(inputCardNumber)){
            return true;
        }
        return false;
    }
}
