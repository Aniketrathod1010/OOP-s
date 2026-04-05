class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");

        sb.reverse();

        System.out.println("Final String: " + sb);
    }
}
