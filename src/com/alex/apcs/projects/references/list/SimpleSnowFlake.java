package com.alex.apcs.projects.references.list;

import java.awt.Graphics;

import com.alex.apcs.enums.Color;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class SimpleSnowFlake extends AbstractShape {
	
	public SimpleSnowFlake(int x, int y, int w, int h) {
		super(x, y, w, h, Color.BLUE, 0, 2);
	}

	@Override
	public void draw(Graphics window) {
		window.setColor(getColor());
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		window.drawLine(x, y, x + w, y + h);
		window.drawLine(x, y + h, x + w, y);
		window.drawLine(x, y + h / 2, x + w, y + h / 2);
		window.drawLine(x + w / 2, y, x + w / 2, y + h);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// draw(window,Color.BLUE);
		int offset = (int) (Math.random() * 4);
		int rnd = (int) (Math.random() * 2);
		if (rnd == 1)
			offset = offset * -1;
		setXPos(getXPos() + offset);
		setYPos(getYPos() + getYSpeed());
		draw(window);
	}
}