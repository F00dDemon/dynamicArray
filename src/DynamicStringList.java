public class DynamicStringList implements StringList {
    private String[] words;
    private int size;

    public DynamicStringList(){
        words = new String[8];
        size = 0;
    }

    // Orion
    @Override
    public String get(int index) {
        if(index >= size && index <= words.length){
            return words[index];
        }else{
            throw new IndexOutOfBoundsException("Enter valid index");
        }
    }
    //Fred
    @Override
    public void set(int index, String value) {
        if (index > 0 || index <= size) {
             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        words[index] = value;
    }

    // Orion
    @Override
    public void add(String value) {
        if(size == words.length-1){
            String[] temporary = new String[words.length];
            for (int i = 0; i < words.length; i++ ) {
                temporary[i] = words[i];
            }
            words = new String[words.length*2];
            for (int i = 0; i < temporary.length; i++ ) {
                words[i] = temporary[i];
            }
        }
        words[size++] = value;
    }
    //Fred
    @Override
    public String remove(int index) {

        // for storing the values
        String removedWords = words[index];
        
        for (int i = index; i < size -1; i++ ) {
           words[i] = words[i + 1];

        }

        words[--size] = null;
         return removedWords;
    }
   

    // Orion
    @Override
    public int size() {
        return size;
    }
    //Fred
    @Override
    public int capacity() {
        return words.length;
    }
    
}
