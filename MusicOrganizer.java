import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    public boolean checkIndex(int index){
        boolean isValid = false;
        int highestIndex = files.size()-1;
        if (index >= 0 && index <= highestIndex){
            isValid = true;
        } else {
            System.out.println("Error: invalud index. The valid index range is 0 to " + highestIndex);
        }
        return isValid;
    }
    public boolean validIndex(int index){
        boolean isValid = false;
        int highestIndex = files.size()-1;
        if (index >= 0 && index <= highestIndex && highestIndex != -1) {
            isValid = true;
        } else if (highestIndex == -1) {
            System.out.println("Error: Invalid index. The collection is empty.");
        } else {
            System.out.println("Error: invalid index. The valid index range is 0 to " + highestIndex);
        }
        return isValid;
    }
}
