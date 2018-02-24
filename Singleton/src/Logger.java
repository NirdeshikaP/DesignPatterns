import java.io.*;

public class Logger {
    private static String fileName;
    private static int  verbosityLevel;
    public static Logger logger;

    private Logger(String fileName, int verbosityLevel){
        this.fileName = fileName;
        this.verbosityLevel = verbosityLevel;
    }

    public void log(String message){
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            switch (verbosityLevel){
                case 0: bufferedWriter.write("Low\n");
                                         bufferedWriter.write(message);
                                         break;
                case 1: bufferedWriter.write("Medium\n");
                                         bufferedWriter.write(message);
                                         break;
                case 2: bufferedWriter.write("High\n");
                                         bufferedWriter.write(message);
                                         break;

            }
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger(String fileName, int verbosityLevel){
        if(logger == null)
            logger = new Logger(fileName, verbosityLevel);
       return logger;
    }
}
