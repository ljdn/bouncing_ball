package ball.model;

import ball.Ball;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, Bouncing.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, Elastic.SHRINK),
                // bouncingElasticBall() --> Let's make a new ball!
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        return new BallImpl(centerX, centerY, Ball.DEFAULT_RADIUS, new Bouncing(direction)) {
        };
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int growthDirection) {
        return new BallImpl(new Elastic(centerX, centerY, radius, growthDirection)) {
        };
    }

//    public static Ball bouncingElasticBall(int centerX, int centerY, int direction) {
//        return new BouncingElasticBall(centerX, centerY, direction);
//    }
}
