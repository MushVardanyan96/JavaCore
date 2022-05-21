package homework.arrayutil;

import javax.swing.*;

public class CharArrayExample {
    public static void main(String[] args) {

        //1-Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա
        // c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը

        char c = 'o';
        int count = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("c-popoxakanic mer masivi mej ka ===>> " + count);

        //2-Պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        System.out.print("mejtexi simvolnern en ===>> ");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int x = chars2.length / 2;
        System.out.print(chars[x] + " | " + chars2[x - 1]);

        //3-Պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false:

        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = false;
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            b = true;
            System.out.println("===>> " + b);

            //4-Տպում ենք true եթե տեքստը պարունակում է bob բառը,
            // բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
            System.out.println();
            char h = 'b';
            char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
            boolean a = false;
            for (int i = 0; i < bobArray.length; i++) {
                if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                    a = true;
                    break;
                }
            }
            System.out.print("===>> " + a);
            System.out.println();

            //5-Պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն:

            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
            for (int i = 0; i < text.length; i++) {
                if (text[i] != ' ') {
                    System.out.print(text[i]);
                }

            }
        }
    }
}

