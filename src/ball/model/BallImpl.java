package ball.model;

import ball.Ball;

import java.awt.*;

public class BallImpl implements Ball {
    protected int x;
    protected int y;
    protected int radius;

    protected Behavior behavior;

    private BallImpl(int x, int y, int radius, Behavior behavior) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.behavior = behavior;
    }

    // DO NOT CHANGE
    @Override
    public int radius() {
        return radius;
    }

    // DO NOT CHANGE
    @Override
    public Point center() {
        return new Point(x, y);
    }

    public void update() {
        behavior.update(x, y, radius);
    }
}
