/*
Recitation 12 - Week 7.1 - 7/13:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Palindrome
A Palindrome is defined as a string that is the same both forwards and backwards. For example, "bob" and "otto" are both palindromes, while “hello” is not.
Write a method that takes in a string and returns true if the string is a palindrome, false otherwise.
Modify this method so that the detection is not case sensitive. For example, "Bob" and "OtTo" should now return true.
Modify this method so that the detection ignores spaces. For example "nolemon,no melon" should now return true.
s.length()
s.charAt(i)   
*/

//CODE:     
public class ispalindrome(String str){
  if(str.length()<=1){
    return true;
  }
  if(str.CharAt(0)==str.charAt(str.length()-1){
    return IsPalindrome(str.substring(1,str.length()-1));
  }
     else{
       return false;
     }
     }
     
public class palindrome(String 

                        
                        
public static boolean isPalindrome(String str) {
  String lower = str.toLowerCase().replaceAll("\\s", "");
  for (int i = 0; i < lower.length(); i++) {
    if (lower.charAt(i) != lower.charAt(lower.length() - i - 1)) {
      return false;
    }
  }
  return true;
}
                        



public class Palindrome 
{
    public static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while(i<j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main (String[] args)
    {
        String str = "bob";
        
        if(isPalindrome(str))
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
}



/*
PROBLEM 2 - Recursive Palindrome
Write a recursive method, isPalindrome, which takes a String as a parameter, and returns true if the String is a palindrome.
For the purposes of this method, you may assume Strings with a length of 0 or 1 are palindromes.
s.charAt       				    
s.length()
s.substring(b, e)
*/

  

//CODE:
public static boolean isPalindrome (String word){
  	if ((word.length() == 0) || (word.length() == 1)) return true;
  	else {
    		if(word.charAt(0) == word.charAt(word.length() - 1)){
        	word = word.substring(1,((word.length())-1));
          return isPalindrome(word);
        }
      	else return false;
    }	
}
                        
public static boolean palindrome(String str) {
    if(str.length()<=1){
        return true;
    }

    if(str.charAt(0) == str.charAt(str.length()-1)){
        return palindrome(str.substring(1,str.length()-1));
    }
    return false;

}
                        
public static boolean isPalindrome(String str) {
  if (str.length() <= 1) {
    return true;
  } else {
    if (str.charAt(0) == str.charAt(str.length() - 1)) {
      return isPalindrome(str.substring(1, str.length() - 1));
    }
  }
  return false;
}                 

                      
                        
/*
PROBLEM 3 - Anagrams
An anagram is a rearrangement of the letters of a word to form a new word. For example, an anagram of "listen" is "silent".
Write a method, anagram, that takes a String as input, and returns true if it is an anagram.
*/

//CODE:
                        
public static boolean isAnagram(String str1, String str2) {
  char[] c1 = str1.toCharArray();
  char[] c2 = str2.toCharArray();
  Arrays.sort(c1);
  Arrays.sort(c2);
  return Arrays.equals(c1, c2);
}
     
     
public static boolean ana(String word){



   String base = "listen"; 
   int a =  base.length(); 
   int b =  word.length();

   if(a == b){

     for(int i = 0; i<a; i++) {

      if( word.indexOf(base.charAt(i)) <0) {
        return false;

      }  

      }
   }

    return true;  




 }
