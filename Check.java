package Exceptions.hw3;

public class Check {
   
public static void checkDateFormat(String date) throws IncorrectValueException{

    char[] checkData = date.toCharArray();
    if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')){

    } else {
        throw new IncorrectValueException("The date format is entered incorrectly. Correct data entry format dd.mm.yyyy");
    }
}

    
    public static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException{
        try {
            long check = Long.parseLong(phoneNumber); // ошибка приведения вида
        } catch (IncorrectValueException e){
            throw new IncorrectValueException("The user's phone format is entered incorrectly. " +
                    "Correct data entry format 111222334455");
        }
    }

   
    public static void checkGenderFormat(String gender) throws IncorrectValueException{
        if (gender.length() == 1){
            gender = gender.toLowerCase();
            if (gender.equals("m") || gender.equals("f")) {
                char[] charArray = gender.toCharArray();
                char convertedGender = charArray[0];
            } else {
                throw new IncorrectValueException("You entered the gender incorrectly !\n" +
                        "Correct data entry format: m or f.");
            }
        } else {
            throw new IncorrectValueException("You entered the gender incorrectly!\n" +
                    "Gender is indicated by one character, if male is 'm', if female - 'f'.\n" +
                    "The correct data entry format, if you are a man is 'm', if a woman - 'f'.");
        }
    }
}