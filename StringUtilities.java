
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded ;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String rev = "";
        for(int i = (valueToBeReversed.length()) - 1 ; i >= 0 ; i--){
        rev = rev + i ;
    }
        
        return rev ;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int n = word.length() ;
        
        String res;
        char res1;
        char res2;
        int p1;
        int p2;
        
        
          
        
            
            if(n%2==0){
             p1=(n/2)-1;
             p2= (n/2) ;
          res1=word.charAt(p1);
          res2=word.charAt(p2);
          return res1;
           
        
    }
    else{
    return word.charAt(n/2);
}
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
