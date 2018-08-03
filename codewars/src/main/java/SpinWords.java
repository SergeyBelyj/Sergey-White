public class SpinWords {


    public String spinWords(String sentence) {
        String[] subStr = sentence.split(" ");
        for (int i = 0; i < subStr.length; i++){
            if (subStr[i].length() > 5) {
                char[] chSubStr = new char[subStr[i].length() - 1];
                chSubStr = subStr[i].toCharArray();
                String temp = String.valueOf(chSubStr[subStr[i].length() - 1]);
                for (int j = subStr[i].length() - 2; j >= 0; j--) {
                    temp = temp + String.valueOf(chSubStr[j]);
                }

                subStr[i] = temp;
            }
        }
        String result = subStr[0];
        for (int index = 1; index < subStr.length; index++) {
            result = result + " " + subStr[index];
        }
        return result;

    }
}
