package day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LoggerExample {
	static Logger logger =
            Logger.getLogger("CSVLogger");

    public static void main(String[] args) {

        try {

            FileHandler fh =
                    new FileHandler("error.log");

            logger.addHandler(fh);

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("data.csv"));

            String line;

            while((line = br.readLine()) != null) {

                String[] values =
                        line.split(",");

                if(values.length < 3) {

                    logger.warning(
                            "Malformed CSV row: " + line);
                }
            }

            br.close();

        } catch(Exception e) {

            logger.severe(
                    "Exception: " + e.getMessage());
        }
    }

}
