import java.io.*;
import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {





        BufferedReader bufferedReader;


        String path = "/Users/karol/Desktop/slownik2.csv";
        String separator = ";";
        String operationName = "INSERT INTO ";
        String schemaTableName = "app.db";
        int id = 0;
        Timestamp dataCreate = Timestamp.valueOf("2018-07-13 21:48:33");
        Timestamp dataModificate = Timestamp.valueOf("2018-07-13 21:48:33");
        String line = "";
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
            while((line = bufferedReader.readLine()) != null){
            String[] values = line.split(separator);
                System.out.println(operationName + schemaTableName + " VALUES (" + id +", " + dataCreate +", " + dataModificate + ",'" + values[0] + "', '" + values[1] + "');");
                id++;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
