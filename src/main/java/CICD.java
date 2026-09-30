public class CICD {

    static void main(String[] args) {
        System.out.println("CI/CD pipeline test started");

        CICD app = new CICD();
        int result = app.add(2, 3);

        if (result == 5) {
            System.out.println("Dummy test passed");
        } else {
            throw new RuntimeException("Dummy test failed");
        }

        System.out.println("CI/CD pipeline test completed successfully");
    }

    public int add(int a, int b) {
        return a + b;
    }
}