package Who_likes_it;

class Solution {

    public static String whoLikesIt(String... names) {
        String result;

        if (names.length == 0) {
            result = "no one likes this";
        } else if (names.length == 1) {
            result = names[0] + " likes this";
        } else if (names.length == 2) {
            result = String.join(" and ", names) + " like this";
        } else if (names.length == 3) {
            result = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        } else {
            result = String.format("%s, %s and %d others like this", names[0], names[1], names.length-2);
        }

        return result;
    }

}
