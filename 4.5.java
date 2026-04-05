class BankApplication {

    static void processTransaction() throws Exception {
        boolean success = true;

        if (!success) {
            throw new Exception("Transaction failed");
        }

        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
