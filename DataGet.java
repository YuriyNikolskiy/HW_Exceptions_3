package Exceptions.hw3;

import java.io.IOException;
import java.util.Scanner;

public class DataGet {
    public static void getData() throws EmptyStringException, ArrayCountElementException, IncorrectValueException, IOException {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the data in the order indicated below in Latin:\n" +
               " <Last name> <First name> <Middle name> <Date of birth> <Phone> <Gender>\n " +
               "Example:\n" +
               "Lvova Julia Anatolevna 01.01.1950 916784856 f");
       String inputData;
       inputData = scanner.nextLine();
       if (inputData.isEmpty()){
           throw new EmptyStringException("The string is empty");
       }

       inputData = inputData.replaceAll("\\s+", " ");
       inputData = inputData.trim();
       String[] bufferArray = inputData.split(" ");
       if (bufferArray.length == 6){
           Check.checkDateFormat(bufferArray[3]);
           Check.checkPhoneNumberFormat(bufferArray[4]);
           Check.checkGenderFormat(bufferArray[5]);
           DataWrite.createFile(bufferArray);


       } else {
           throw new ArrayCountElementException("You have not entered all the data or\n" +
                   "You missed a space");
       }




   }
}
