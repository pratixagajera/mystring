
//classname = String original
public class StringOriginal {
    static StringOriginal stringOriginal = new StringOriginal();

    public static void main(String[] args) {
        stringOriginal.concatenate("red color ", "blue color ", "and purple colors are my favourite");
        stringOriginal.concatenate("Rajesh Patel ", "shivani shah ", "and vikram rana are friends");
        stringOriginal.total(76, 86, 95);
        stringOriginal.charValue("Mohil or Mihir was first", "was");
        stringOriginal.charValue("Mohil or Mihir was first", "and");
        specialSymbol("Payal have $20,000");
        stringOriginal.verify("normal behaviour", "abnormal behaviour");
        caseConsideration("red is bright color", "white is cool color", "RED is bright color");
        stringOriginal.extractNumber("prayer2376498 pooja3761209r light54");
        totalLength("I like many fruits and vegetables");
        stringOriginal.specificPosition("My name is Amrita Patel");
        replaceCharacter("Rajveer singh Verma");
        add(87, 95);
        stringOriginal.subtract(65, 74);
        characterPosition("Tutor Joes");
        stringOriginal.multi(65, 83);
        div(80,4);
        stringOriginal.modulus(34, 86);
        increment(45);
        stringOriginal.decrement(76);
        equalTo(76, 67);
        equalTo(95, 95);
        stringOriginal.notEqualTo(34,76,98);
        greaterThan(98, 54);
        stringOriginal.logicalAnd(65, 43);
    }

    //    nonstatic - concatenate stings
    void concatenate(String one, String two, String three) {
        System.out.println(one + two);
        System.out.println(two + three);
        System.out.println(one + three);
    }

    //    nonstatic - total marks
    void total(int maths, int eng, int history) {
        System.out.println("total marks " + " = " + (+maths + +eng + +history));
    }

// nonstatic - string contains specified char value

    void charValue(String one, String two) {
        System.out.println(one.contains(two));
    }

//static - remove special symbol

    static void specialSymbol(String one) {
        System.out.println(one.replace("$", " "));
    }

    /*nonstatic - check whether a given string ends with another string*/
    void verify(String first, String second) {
        System.out.println(first.endsWith("ur"));
        System.out.println(second.startsWith("ab"));
    }

    /*static - case consideration, compare two strings*/
    static void caseConsideration(String first, String second, String third) {
        System.out.println(first.equalsIgnoreCase(third));
        System.out.println(second.equalsIgnoreCase(third));
    }

    /*non-static - extract number from string*/
    void extractNumber(String value) {
        System.out.println(value.replaceAll("[^0-9]", ""));
    }

    /*static - length of a string*/
    static void totalLength(String name) {
        System.out.println("total length = " + name.length());
    }

    /*non-static - get substring of given string at two specified positions*/
    void specificPosition(String sentence) {
        System.out.println(sentence.substring(3, 14));
    }

    /*static - replace specified characters*/
    static void replaceCharacter(String fullname) {
        System.out.println(fullname.replaceAll("V", "L"));
    }

    /*static - addition of marks*/
    static void add(Integer valueA, Integer valueB){
        System.out.println("Total Marks = " +(valueA+valueB));
    }

    /*non-static - subtraction of value*/
    void subtract(Integer value01, Integer value02){
        System.out.println("The rest of the amount = " +(value02-value01));
    }

    /*static - to get the character at given position*/
    static void characterPosition(String data){
        System.out.println("The Character at Position 0 is " +(data.charAt(0)));
        System.out.println("The Character at Position 6 is "+(data.charAt(6)));
    }

    /*non-static - multiplication of amount*/
    void multi(Integer amountFirst, Integer amountSecond){
        System.out.println("The multiplication of these value = "+(amountFirst*amountSecond));
    }

    /*static - division of two value*/
    static void div(Integer first, Integer second){
        System.out.println("The multiplication of these value = " +(first/second));
    }

    /*non-static - modulus of two value*/
    void modulus(Integer one, Integer two){
        System.out.println("The modulus of these value = " +(two % one));
    }

    /*static - increment of value*/
    static void increment(Integer A){
        System.out.println("The increment of value A = " +(++A));
        System.out.println("The increment of value A = " +(A++));
        System.out.println("The increment of value A = " +(A));


    }

    /*non-static - decrement of value*/
    void  decrement(Integer C){
        System.out.println("The decrement of value C = " +(--C));
        System.out.println("The decrement of value C = " +(C--));
        System.out.println("The decrement of value C = " +(C));
    }

    /*static - check value of two operands are equal or not*/
    static void equalTo(Integer first, Integer second){
        System.out.println(first == second);
    }

    /*non-static - check value of two operands are not equal to*/
    void  notEqualTo(Integer one, Integer two, Integer three){
        System.out.println(two != one);
    }

    /*static = check value for greater than*/
    static void greaterThan(Integer one, Integer two){
        System.out.println(two>one);
        System.out.println(one>two);
    }

   /*non-static - logical && */
    void logicalAnd(Integer st01, Integer st02){
        System.out.println((st02>st01)&&(st02<st01));
    }




}

