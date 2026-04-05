class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" StringBuilder Example");

        System.out.println("Modified String: " + sb);

        System.out.println("StringBuilder is faster but not synchronized, StringBuffer is synchronized and thread-safe.");
    }
}
