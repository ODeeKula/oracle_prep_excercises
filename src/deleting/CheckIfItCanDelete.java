package deleting;

import java.io.File;

public class CheckIfItCanDelete {

    public static void deleteTree(File file){
        if(!file.isFile()) {
            for (File entry : file.listFiles()) {
                deleteTree(entry);
            }
        }
        else file.delete();

        System.out.println(file);
    }

}
