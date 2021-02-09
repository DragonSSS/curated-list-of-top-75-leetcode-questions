package leetcode.string;

public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        if(target == null || target.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder();
        int curX = 0, curY = 0;
        char[] chars = target.toCharArray();
        for(char c : chars) {
            int desX = (c - 'a') / 5;
            int desY = (c - 'a') % 5;

            // the trick is to put L U before R D as 'z' is special
            if (desX < curX) {
                for (int i = curX - desX; i > 0; i--)
                    sb.append('U');
            }

            if (desY < curY) {
                for (int i = curY - desY; i > 0; i--)
                    sb.append('L');
            }

            if (desX > curX) {
                for (int i = desX - curX; i > 0; i--)
                    sb.append('D');
            }

            if (desY > curY) {
                for (int i = desY - curY; i > 0; i--)
                    sb.append('R');
            }
            sb.append('!');
            curX = desX;
            curY = desY;
        }
        return sb.toString();
    }
}
