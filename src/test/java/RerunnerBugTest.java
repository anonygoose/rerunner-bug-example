import io.github.artsok.RepeatedIfExceptionsTest;

public class RerunnerBugTest {

    @RepeatedIfExceptionsTest(repeats = 3)
    void test1() {
        System.out.println("Running test 1");
    }

    @RepeatedIfExceptionsTest(repeats = 3)
    void test2() throws Exception {
        System.out.println("Running test 2");
        throw new Exception("How does this not error?  It never runs!");
    }

    @RepeatedIfExceptionsTest(repeats = 3)
    void test3() {
        System.out.println("Running test 3");
    }

}
