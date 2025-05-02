public class WordPair {
    private String first;
    private String second;

    /** Constructs a WordPair object. */
    public WordPair(String first, String second) 
    {
        this.first = first; 
        this.second = second;
    }

    public String getFirst() 
    {
        return first;
    }

   public String getSecond() 
   {
    return second;
   }

    public String toString()
    {
        return "(\"" + first + "\", \"" + second + "\")";
    }
}