import java.util.ArrayList;
import java.*;

/**
 * Created by jhascall19 on 10/27/17.
 */
public class Lab1 {
    //task one
    public String disemvowler(String orig) {
        String newString = "";
        if (orig.charAt(1) == ' '){
            newString += orig.charAt(0);
        }
        for (int i = 0; i < orig.length() ; i++) {
            if (orig.charAt(i) != 'a' && orig.charAt(i) != 'e' && orig.charAt(i) != 'i' && orig.charAt(i) != 'o' && orig.charAt(i) != 'u'){
                newString += orig.charAt(i);
            }else {
                int secondIndex = i-1;
                if (secondIndex < 0) {
                    secondIndex = 0;
                }

                    if (orig.charAt(i + 1) == ' ' && orig.charAt(secondIndex) == ' ') {
                        newString += orig.charAt(i);
                    }



            }
        }


        return newString;
    }

public String simpleCompression(String orig) {
    String newString = "";
    int length = orig.length();
    int counter = 0;
    char at = orig.charAt(0);
    System.out.println(length);

    for (int i = 0; i < length ; i++) { //done with some help from Quinn and the Web. This took me about two hours of work!
        if (i == length-1){
            counter++;
            newString += Character.toString(at) + (Integer.toString(counter));
            counter = 1;
            at = orig.charAt(i);

    }
    if (Character.toString(orig.charAt(i)).compareTo(Character.toString(at)) == 0){
        counter++;
    }
    else{
        newString += (Character.toString(at) + Integer.toString(counter));
        counter = 1;
        at = orig.charAt(i);
        }










//    for (int i = 0; i < orig.length(); i++) {
//int letterValue = orig.charAt(i);
//        char letter = orig.charAt(i);
//        int counter = 1;
//        int letterValue2;
//        if (i+1 < orig.length()) {
//            letterValue2 = orig.charAt(i + 1);
//        }else {
//            letterValue2 = 1234567890;
//        }
//
//        if (letterValue == letterValue2){
//            counter++;
//        }
//    }
//    int[] charcount = new int[orig.length()];
//    for (int i = 0; i < orig.length(); i++) {
//        charcount[i] += orig.charAt(i);
//
//
//
//
//        int q = 0;
//        int amt1 = charcount[q];
//        int counter = 2;
//
//            while (charcount[q] == amt1){
//                counter++;
//                if (q >= charcount.length){
//                    amt1 = 123454321;
//                }else {
//                    q++;
//                }
//            }
//            System.out.println(counter);
//
//
//
//    return "hi";
    }


//    int p = 0;
//    while (p < orig.length()){
//        int counter = 1;
//        if (p+1 < orig.length()) {
//            if (orig.charAt(p) == orig.charAt(p+1)){
//                counter++;
//
//            }else {
//
//            }
//            newString += counter;
//
//    }
//    return newString;
//}
    return newString;
}

public String dictionary(String phrase){
    String newString = "";
    ArrayList<String> wordHolder = new ArrayList<>();
    int sub = 0;
    for (int i = 0; i < phrase.length() ; i++) {

        if (phrase.charAt(i) == ' '){
            wordHolder.add(phrase.substring(sub, i));
            sub = i;

        }


    }

    for (int q = 0; q < wordHolder.size(); q++) {


    newString += q;
        System.out.println("word: " + wordHolder.get(q) + " Key: " + q);
    }
    System.out.println("compression rate: " + ((double)(phrase.length() - newString.length() + wordHolder.size())/phrase.length() ));

    return newString;
}





    public static void main(String[] args) {
        Lab1 baby = new Lab1();
        String wqeewn = "aeiou and sometimes y";
        String newboy = baby.disemvowler(wqeewn);
        System.out.println(newboy);

        String compressor = "aaaeeeiiiooouuu";
        System.out.println(baby.simpleCompression(compressor));
        System.out.println();
        System.out.println();

        String words = "aeat cat dog faf sjsh hssh";
        System.out.println(baby.dictionary(words));
    }
}
