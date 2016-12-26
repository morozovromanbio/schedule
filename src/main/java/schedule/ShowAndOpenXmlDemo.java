package schedule;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by Роман on 26.12.2016.
 */
public class ShowAndOpenXmlDemo{
    public static void Show(String args)

    {
        int i;
        FileInputStream fin;

        if (args.length() != 1){
            System.out.print("File use");
        }

            try {
            (fin = new FileInputStream(args[0]));
            } catch (FileAlreadyExistsException e){
            System.out.print("File don't open");
            }


            try {
                do {
                    i = fin.read();
                    if(i != -1) System.out.print((char) i);

                }while(i != -1);
            }catch (IOException e){
                System.out.print("Error read");
            }

            try {
                fin.close();
            } catch (IOException e){
                System.out.print("Error have closeing file");
            }
    }
}
