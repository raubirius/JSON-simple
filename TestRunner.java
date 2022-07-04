
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.json.simple.JSONArrayTest;
import org.json.simple.JSONValueTest;
import org.json.simple.parser.YylexTest;

public class TestRunner
{
	private static void runTests(Class<?> testClass)
	{
		System.out.println(testClass.getName());

		Result result = JUnitCore.runClasses(testClass);

		for (Failure failure : result.getFailures())
			System.out.println("failure:" + failure.toString());

		System.out.println("success: " + result.wasSuccessful());
	}

	public static void main(String[] args)
	{
		runTests(JSONArrayTest.class);
		runTests(JSONValueTest.class);
		runTests(YylexTest.class);
	}
}
