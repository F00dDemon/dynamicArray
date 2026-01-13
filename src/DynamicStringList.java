public class DynamicStringList implements StringList {
    private String[] words;
    private int size;

    // Orion
    @Override
    public String get(int index) {
        if(index >= 0 && index <= words.length){
            return words[index];
        }else{
            throw new IndexOutOfBoundsException("Enter valid index");
        }
        
    }
    //Fred
    @Override
    public void set(int index, String value) {
        if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        words[index] = value;
    }

    // Orion
    @Override
    public void add(String value) {
        int i = 0;
        for(i += 0; i < words.length; i++){
            if(words[i].equals("")){
                words[i] = value;
                break;
            }
        }
        if(i == words.length){
            
        }
        
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    //Fred
    @Override
    public int capacity() {
        return words.length;
    }
    
}
