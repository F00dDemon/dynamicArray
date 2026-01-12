public class DynamicStringList implements StringList {
    // Orion
    @Override
    public String get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
        
    }
    //Fred
    @Override
    public void set(int index, String value) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'set'");


    }
    // Orion
    @Override
    public void add(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
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
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'capacity'");
       



    }
    
}
