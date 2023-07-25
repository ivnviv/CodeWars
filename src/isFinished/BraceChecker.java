package isFinished;

public class BraceChecker {
    int countRound = 0;
    int countFigure = 0;
    int countRectan = 0;

    public boolean isValid(String braces) {
        char[] parts = braces.toCharArray();
        for (int i = 0; i < parts.length; i++) {
            switch (parts[i]) {
                case ('('):
                    countRound++;
                    break;

                case (')'):
                    countRound++;
                    break;

                case ('{'):
                    countFigure++;
                    break;

                case ('}'):
                    countFigure++;
                    break;

                case ('['):
                    countRectan++;
                    break;
                case (']'):
                    countRectan++;
                    break;
            }

        }
        if (countRound % 2 == 0 && countFigure % 2 == 0 && countRectan % 2 == 0) {
            return true;
        }
        return false;
    }

}
