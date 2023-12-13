public class Main {

    public static void main(String[] args) {

        Operations operations = new Operations();

        int numInt1 = 10;
        int numInt2 = 15;

        double numDouble1 = 50.0;
        double numDouble2 = 15.5;

        char carattere = 'c';

        //utilizzo i tipi primitivi su i metodi che richiedono le classi Wrapper come parametri
        operations.stampaSommaInteger(numInt1, numInt2);
        operations.stampaSommaDoubleWrapper(numDouble1, numDouble2);
        operations.stampaCarattereWrapper(carattere);



        Integer integer1 = 5;
        Integer integer2 = 7;

        Double numDoubleWrap1 = 5.5;
        Double numDoubleWrap2 = 4.2;

        Character charWrap = 'f';

        //utilizzo i tipi wrapper su i metodi che richiedono primitivi come parametri
        operations.stampaSommaInt(integer1, integer2);
        operations.stampaSommaDouble(numDoubleWrap1, numDoubleWrap2);
        operations.stampaCaratterePrimitive(charWrap);



    }

}
