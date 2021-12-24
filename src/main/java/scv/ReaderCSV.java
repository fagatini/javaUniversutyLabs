package scv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReaderCSV 
{
    private static final String FILE_NAME = "foreign_names.csv";
    CSVReader reader = new CSVReader(new FileReader(FILE_NAME));

    public ReaderCSV() throws IOException, CsvValidationException 
    {
        reader.readNext();
    }

    /** 
     * @return String[] get string line of data from scv
     */
    public String[] readNext() throws CsvValidationException, IOException 
    {
        return reader.readNext();
    }

    public void close() throws IOException 
    {
        reader.close();
    }
}
