public class Main {

    public static void main(String[] args) {

        Operations operations = new Operations();

        int numInt1 = 10;
        int numInt2 = 15;

        char carattere = 'c';

        //utilizzo i tipi primitivi su i metodi che richiedono le classi Wrapper come parametri
        //facendo così autoboxing
        operations.stampaSommaInteger(numInt1, numInt2);
        operations.stampaCarattereWrapper(carattere);



        Integer integer1 = 5;
        Integer integer2 = 7;

        Character charWrap = 'f';

        //utilizzo i tipi wrapper su i metodi che richiedono primitivi come parametri
        //facendo così unboxing
        operations.stampaSommaInt(integer1, integer2);
        operations.stampaCaratterePrimitive(charWrap);

        //autoboxing tramite assegnazione
        double numDouble1 = 50.0;
        Double numDoubleWrap1 = numDouble1;

        //Unboxing treamite assegnazione
        Double numDoubleWrap2 = 4.2;
        double numDouble2 = numDoubleWrap2;



    }

}
