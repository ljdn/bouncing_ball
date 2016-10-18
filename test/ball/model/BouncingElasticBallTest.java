package ball.model;

import ball.Ball;
import ball.ui.BallWorld;
import org.junit.Test;

import static ball.BallTestHarness.assertCenterYCoordinateIs;
import static ball.BallTestHarness.oneStepDownFrom;
import static ball.BallTestHarness.oneStepUpFrom;

/**
 * Created by lduan on 10/18/16.
 */
public class BouncingElasticBallTest {
    @Test
    public void shouldGoDown() throws Exception {
        Ball bouncingElasticBall = BallFactory.bouncingElasticBall(0, 100, BouncingBall.DOWN);

        bouncingElasticBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(100), bouncingElasticBall);
    }
}