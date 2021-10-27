package Exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainWithArray {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("test3.cvs"));
        String line;
        Scanner scanner = null;
        int index = 0;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        List<DataForArray> dataSet = new ArrayList<>();


        while ((line = bufferedReader.readLine()) != null) {
            DataForArray container = new DataForArray();

            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {

                String string = scanner.next();


                if (index == 0)
                    container.setFid(Integer.parseInt(string));
                else if (index == 1)
                    container.setSerialNum(Integer.parseInt(string));
                else if (index == 2)
                    container.setMEMBER_CODE(string);
                else if (index == 3)
                    container.setACCT_TYPE(Integer.parseInt(string));
                else if (index == 4)
                    container.setOPENED_DT(formatter.parse(string));
                else if (index == 5)
                    container.setACCT_RTE_CDE(Integer.parseInt(string));
                else if (index == 6)
                    container.setREPORTING_DT(formatter.parse(string));
                else if (index == 7)
                    container.setCREDIT_LIMIT(Integer.parseInt(string));
                else
                    System.out.println("Errror");
                index++;

            }
            index = 0;
            dataSet.add(container);

        }
        bufferedReader.close();
        dataSet.sort(DataForArray::compareTo);
        for (DataForArray d : dataSet
        ) {
            System.out.println(d);
        }

    }
}
