//Test to be generated using Keploy
package dev.akshat.Movies_Recommender;

import io.keploy.regression.Mode;
import io.keploy.utils.AssertKTests;
import io.keploy.utils.HaltThread;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;

import static dev.akshat.Movies_Recommender.MoviesRecommenderApplication.main;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MoviesRecommenderApplicationTests {

	@Test
	public void TestKeploy() throws InterruptedException {

		CountDownLatch countDownLatch = HaltThread.getInstance().getCountDownLatch();
		Mode.setTestMode();

		new Thread(() -> {
           MoviesRecommenderApplication.main(new String[]{""});
		   countDownLatch.countDown();
		}).start();

		countDownLatch.await();
		assertTrue(AssertKTests.result(), "Keploy Test Result");
	}

}
