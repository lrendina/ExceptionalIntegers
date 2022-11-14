import java.util.ArrayList;

public class ExceptionalIntegers {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        int index;
        String argsString;
        Integer wrapperValue;

        for (index = 0; index < args.length; ++index) {
            try {
                argsString = args[index];
                wrapperValue = converter(argsString);
                intList.add(wrapperValue);
            }catch(NumberFormatException e){
                System.out.println("Catch block says the argument " + "\"" + args[index] +  "\""+ " is ignored because " + args[index]);
            }
        }

        System.out.println("\nVector contents are:");
        for (index=0; index<intList.size(); ++index) {
            System.out.println("Item " + index + " is " + intList.get(index));
        }

    }

    public static Integer converter(String argsString) throws NumberFormatException {

        Integer wrapperValue;
        int argsValue;

        argsValue = Integer.parseInt(argsString);
        wrapperValue = argsValue;
        System.out.println("Converter method says integer OK - " + argsValue);

        return(wrapperValue);
    }

}