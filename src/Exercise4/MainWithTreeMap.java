package Exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainWithTreeMap {
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("test5.cvs"));
        String line;
        Scanner scanner = null;
        int index = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        TreeMap<Integer, MyData> dataSet = new TreeMap<Integer, MyData>();
  //      SortedMap<Integer,MyData4> dataSet = new TreeMap<Integer,MyData4>();
  //      HashMap<Integer,MyData4> dataSet = new HashMap<Integer,MyData4>();


        while ((line= bufferedReader.readLine()) != null) {
            MyData container = new MyData();

            Integer key=0;
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {

                String string = scanner.next();


                if(index==0)
                    key=Integer.parseInt(string);
                else  if(index==1)
                    container.setSerialNum(Integer.parseInt(string));
                else  if(index==2)
                    container.setMEMBER_CODE(string);
                else  if(index==3)
                    container.setACCT_TYPE(Integer.parseInt(string));
                else  if(index==4)
                    container.setOPENED_DT(LocalDate.parse(string,formatter));
                else  if(index==5)
                    container.setACCT_RTE_CDE(Integer.parseInt(string));
                else  if(index==6)
                    container.setREPORTING_DT(LocalDate.parse(string,formatter));
                else  if(index==7)
                    container.setCREDIT_LIMIT(Integer.parseInt(string));
                else
                    System.out.println("Errror");
                index++;
                dataSet.put(key,container);

            }
            index = 0;
//            dataSet.add(container);

        }
        bufferedReader.close();
        for (Map.Entry e:dataSet.entrySet()
        ) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
