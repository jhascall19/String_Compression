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
    int[] charcount = new int[orig.length()];
    for (int i = 0; i < orig.length(); i++) {
        charcount[i] += orig.charAt(i);




        int q = 0;
        int amt1 = charcount[q];
        int counter = 2;

            while (charcount[q] == amt1){
                counter++;
                if (q >= charcount.length){
                    amt1 = 123454321;
                }else {
                    q++;
                }
            }
            System.out.println(counter);



    return "hi";
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
    ArrayList<String> wordHolder = new ArrayList<>();
    int sub = 0;
    for (int i = 0; i < phrase.length() ; i++) {

        if (phrase.charAt(i) == ' '){
            wordHolder.add(phrase.substring(sub, i));
            sub = i;

        }


    }
    int counter = 0;
    for (int q = 0; q < wordHolder.size() ; q++) {


    }

    System.out.println(wordHolder.size());
    return "s";
}





    public static void main(String[] args) {
        Lab1 baby = new Lab1();
        String wqeewn = "aeiou and sometimes y";
        String newboy = baby.disemvowler(wqeewn);
        System.out.println(newboy);

        String compressor = "aaaeeeiiiooouuu";
        System.out.println(baby.simpleCompression(compressor));

        String words = "a eat cat";
        System.out.println(baby.dictionary(words));
    }
}
