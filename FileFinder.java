import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


public class FileFinder {

public File fileFinder(File[] files,String name,int index){

    if (index>=files.length) return null;

    if (files[index].getName().equals(name)){

        return files[index];
    }

    else return fileFinder(files,name,index+1);

}


    /**
     * TO-DO: Change this method to be recursive.
     \*
     * This method searches for a file with a specific name within a directory
     * and its subdirectories. The current implementation uses a Queue for an
     * iterative, breadth-first search.
     \*
     * @param rootDir The directory to start the search from.
     * @param fileName The name of the file to find.
     * @return The File object if found, otherwise null.
     */

//    public File findFileByName(File rootDir, String fileName) {
//        if (!rootDir.isDirectory()) {
//            return null;
//        }
//        Queue<File> queue = new LinkedList<>();
//        queue.offer(rootDir);
//        while (!queue.isEmpty()) {
//            File current = queue.poll();
//            File[] files = current.listFiles();
//            if (files != null) {
//                for (File file : files) {
//                    if (file.isDirectory()) {
//                        queue.offer(file);
//                    } else if (file.getName().equals(fileName)) {
//                        return file;
//                    }
//                }
//            }
//        }
//        return null;
//    }
}


