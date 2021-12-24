import com.opencsv.exceptions.CsvValidationException;

import data.Person;
import scv.ReaderCSV;

import java.io.IOException;
import java.util.ArrayList;


public class Main 
{

    public static void main(String[] args) throws IOException, CsvValidationException 
    {
        var readerCSV = new ReaderCSV();
        var resultList = new ArrayList<>();

        String[] dataLine = readerCSV.readNext();

        while (dataLine!= null) 
        {
            var ActualPerson = new Person(dataLine);
            resultList.add(ActualPerson);
            dataLine = readerCSV.readNext();
        }

        System.out.println(resultList);
        readerCSV.close();
    }
}
