package io.codelex.knowledgecheck.exercise3;

public class Joiner<T> {
    private final String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String join(T... elements) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i].toString());
            if (i < elements.length - 1) {
                sb.append(seperator);
            }
        }
        return sb.toString();
    }
}
