public class ArrayAlgorithms {
    
    public ArrayAlgorithms() {

    }

    public static double average(int[] numList) {
        double average = 0;
        for (int i = 0; i < numList.length; i++) {
            average += numList[i];
        }
        average = average / numList.length;
        return average;
    }

    public static int minimum(int[] numList){
        int min = numList[1];
        int current = 0;
        for(int i = 0; i < numList.length; i++){
            current = numList[i];
            if (current < min){
                min = current;
            }
        } 
        return min;
    }

    public static int howManyContain(String [] strList, String target){
        int counts = 0;
        for (int i = 0; i < strList.length; i++){
            if (strList[i].indexOf(target) != -1){
                counts++;
            }
        }
        return counts;
    }

    public static String[] stringToArray(String myStr) {
        String [] strArray = new String[myStr.length()];
        for (int i = 0; i < myStr.length(); i++){
            String character = myStr.substring(i, i + 1);
            strArray[i] = character;
        }
        return strArray;
    }

    public static void introduceAdults(Person[] people){
        int age = 18;
        for (int i = 0; i < people.length; i++){
            if (age == people[i].getAge()){
                people[i].introduce();
            }
        }
    }
    
}
