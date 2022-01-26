package Stop_gninnipS_My_sdroW;

public class SpinWords {

    public String spinWords (String sentence) {
        String[] split = sentence.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() >= 5) {
                StringBuilder builder = new StringBuilder(split[i]);
                builder.reverse();
                split[i] = builder.toString();
            }
        }

        return String.join(" ", split);
    }

}
