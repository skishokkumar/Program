import java.lang.String;
import java.util.Scanner;
import java.util.regex.*;// (API->application program interface) API is nothing but is a class eg string class etc;
import java.util.Arrays;
public class string {
    public static void main(String args[]) {
        String s = "kahoot";
        System.out.println("String concation:" + s.concat(" "+"is an play store app"));
        System.out.println(s);
        String k = "kahoot";
        String j = new String("kahoot");
        //-> if we check string with == then it will results in false
        //->if we check with using the equals operator
        if(s.equals(j)){
            System.out.println("true");
        }
        if (s == k) {
            System.out.println("It checks the value and type ");
            System.out.println("Address of the s:" + System.identityHashCode(s));// identityhascode is a address
            System.out.println("Address of the k:" + System.identityHashCode(k));
            System.out.println("The type of s:" + s.getClass().getSimpleName());  /*
            *to find a type of object only s.getClass().getSimpleName()
            if you want to find the type for primitive  u want to use this method
            int n=10;
             System.out.println("The type of n:" + ((object)x).getClass().getSimpleName());
            */
            System.out.println("The type of k:" + k.getClass().getSimpleName());
            System.out.println("The type of j:" + j.getClass().getSimpleName());
        }
        if (s != j) {
            System.out.println("Address of the k:" + System.identityHashCode(j));
        }
        if (true) {
            System.out.println("It checks the value only if they are true returns 0");
            System.out.println("String compare between s and j:" + s.compareTo(j));
            System.out.println("String compare between s and k:" + s.compareTo(k));
        }
        char ch[]={'s','u','n','d','a','r','p','i','c','h','a','i','g','o','o','g','l','e','c','e','o'};
        String skk= new String(ch);
        System.out.println("new string(ch) is same as ch[]:"+skk);
        System.out.println("equals operator:"+s.equals(j));
        /*Difference between compareTo and equals
         compareTo returns 0 if they are equal || equals returns true if they are equal
         compareTo returns "positive" [if they str1 is greater than str2] else "negative" [if the str2 greater than str1]||
         equals always returns false if they are not equal
         Equality between this equals and compareTo is check only the values
         But the operator [==] checks both the values and the Datatype
         */
        // /**********charAt***********/
        System.out.print("To print the string characters using charAt:");
        for(int i=0;i<s.length();i++){
            char hs=s.charAt(i);
            System.out.print(hs);
        }
        System.out.println();
        System.out.print("To print the string character by toCharArray:");
        char []chs=s.toCharArray();
        for(char i:chs){
            System.out.print(i);
        }
        System.out.println();
        String l="  kishokkishok123  ";
        String h="hello";
        System.out.println("To print the specified position of character:"+s.substring(0,s.length()));
        System.out.println("The replace method which is used to replace the string:"+s.replace("kishok","sundarpichai ceo of google"));
        System.out.println("The replace method which is used to replace the specified character:"+l.replace('k','t'));
        System.out.println("The replaceFirst method which is used to replace the first find:"+l.replaceFirst("\\d","t"));
        System.out.println("The replaceALL method which is used to replace all :"+l.replaceAll("\\d","t"));
        String or=s.indent(10);
        System.out.println("Indent method :"+or+"kishok");// this method suffix with the \n[newline]
        System.out.println("The length of the string after trimming:"+l.trim().length());// trim in java is like strip in python
        //**********************************codePointAt********************************************/
        System.out.println("Returns the unicode value of the character:"+s.codePointAt(4));
        //**********************************codePointCount***************************************/
        System.out.println("Returns the count:"+s.codePointCount(0,5));
        //*********************************codePointBefore**************************************/
        System.out.println("Returns the unicode value of the character before character:" + s.codePointBefore(3));
        //********************************String contains()method*******************************/
        System.out.println("If the string contains specified character returns true:"+l.contains("123"));
        System.out.println("If the string not contains specified character returns false:"+l.contains("321"));
        System.out.println(71*Math.pow(31,2)+70*Math.pow(31,1)+71);
        System.out.println("GFG".hashCode());// Formula[s[0]*31*(n-1)+s[1]*31*(n-2)+..............+s[n-1]]
        /*
        try->which is used to check the condition for example:
        int n=10;
        System.out.println(n/0);->gives an error called arthimetic exception
        float f=10.0;
         System.out.println(f/0);-> it does not give error because the float value gives output as infinity(if it is positive value(+infinity)if it is negative value(-infinity))
        */
        try {
            String[] i = l.split("\\d");                           
        }
        catch (Exception e){
            System.out.println("The error for regex mismatch:"+e);
        }
        // without limit,with limit 0,with negative limit,with positive limit
        String vowels="a::bc::de::fg";
        String []q_0=vowels.split("::");// if no limit it will change all the regex match
        System.out.println(Arrays.toString(q_0));
        String []q_1=vowels.split("::",0);// it returns array contains all substring if the limit is zero
        System.out.println(Arrays.toString(q_1));
        String []q_2=vowels.split("::",-1);// it returns array contains all substring if limit is negative
        System.out.println(Arrays.toString(q_2));
        String []q_4=vowels.split("::",3);
        System.out.println(Arrays.toString(q_4));
        String S=1+"a+b"+1;
        System.out.println(S);
        System.out.println("Type of the string:"+vowels.getClass().arrayType());// type of a string
        System.out.println("Type of the string in  normal words:"+vowels.getClass().toString());// type of a string
        /*
         * System.out.println(vowels.getClass().getAnnotatedInterfaces());
        System.out.println(vowels.getClass().cast((String)vowels));
        System.out.println(vowels.getClass().getFields());
        */
        Scanner in = new Scanner(System.in);
        String[] q_21 = new String[]{"sundarpichai ceo of google","elon musk is a richest enterprenur","raina and dhoni are best friends","school and college friendship is the best","friendhip is best relationship when we havegood friends"};
        String kk;
        System.out.println(Arrays.deepToString(q_21));
        String[] q_7=new String[]{"1","2","3","4","5"};// initialize an array
        String[] q_9={"1","2","3","4","5"};// initialize an array
        Arrays.sort(q_2);
        String []q_5=new String[5];
        /*
Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array. A subsequence of array components are copied from the source array referenced by src to the destination array referenced by dest. The number of components copied is equal to the length argument. The components at positions srcPos through srcPos+length-1 in the source array are copied into positions destPos through destPos+length-1, respectively, of the destination array.
If the src and dest arguments refer to the same array object, then the copying is performed as if the components at positions srcPos through srcPos+length-1 were first copied to a temporary array with length components and then the contents of the temporary array were copied into positions destPos through destPos+length-1 of the destination array.
If dest is null, then a NullPointerException is thrown.
If src is null, then a NullPointerException is thrown and the destination array is not modified.
Otherwise, if any of the following is true, an ArrayStoreException is thrown and the destination is not modified:
The src argument refers to an object t
         */
        System.arraycopy(q_21,0,q_5,0,q_21.length);
        System.out.println(Arrays.toString(q_5));
        System.out.println(q_21[0]);
        String L="k";
        System.out.println(L.length());
        System.out.println(L.stripLeading().stripTrailing().length());
        System.out.println(L.length());
        System.out.println(L.strip());
        System.out.println(L);
        System.out.println(L.hashCode());
        System.out.printf("%d\n",L.length());
        /*
        widening type casting :
        one datatype to other
        eg : int num=10 double n=num implicit type conversion
        narrowing type casting :
        convert using  parenthesis int n=10 double
        num=double(n) explicit type conversion
        meaning of widening is lower widening(lower to higher datatype)
        narrowing(higher to lower datatype) meaning of narrow is high
         */
        /*
         * unboxing:wrapper to primitive
         * autoboxing:primitive to wrapper
         * wrapper class:int->Integer float->Float double->Double byte->Byte boolean->Boolean char->Character
         */
        //****************************Wrapper Classes***************************************************
        /*
         important about wrapper class
         1.wrapper clas is nothing but converting the primitive to object
         int->Integer      float->Float    short->Short
         boolean->Boolean  double->Double
         char->Character   long->Long
         2.when you are working with the collection you will know the advantages of this wrapper class
         */
        //***********************what is implicit and explicit calling****************************************
        /*
        1.implicit calling example recursion
        2.explicit calling is we want to call for example calling method with parameter
        3. explicit declaration is int n=10(like java,c,c++)
        4.implicit declaration is n=10(like python declaration)
         */
        //*******************************Split method************************************************
        /*
        output ->[, sundarpichai, ceo@google@america]{
         if it is positive then limit-1 limit is 3-1=>2
         }
         output->[, sundarpichai, ceo, google, america]{
         if it is negative or positive then it split all the @
         }
         */
        String R="@sundarpichai@ceo@google@america";
        String []arr=R.split("@",3);
        String []split2=R.split("@",-3);
        String []split3=R.split("@",0);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(split2));
        System.out.println(Arrays.toString(split3));
        /*
        Arrays.toString() which is used to print whole array
        System.out.printf is also in java this is like the c,c++
         */
    }
}
