/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.epsevg.prop;

import java.awt.Color;
import java.awt.Graphics2D;
import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.Rules;
import robocode.ScannedRobotEvent;

/**
 *
 * @author e7988457
 */
public class Robocode extends Robot {

    public void run() {
        turnLeft(getHeading());
        while(true) {
            ahead(1000);
            turnRight(90);
        }
    }

    @Override
    public void onPaint(Graphics2D g) {
        int r = 60;
        g.setColor(Color.yellow);
        g.drawOval((int)getX()-r, (int)getY()-r, 2*r, 2*r);
    }

    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(Rules.MAX_BULLET_POWER);
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        turnRight(180);
    }
    
    
}
