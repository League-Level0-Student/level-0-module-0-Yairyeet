package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;


public class RobotGraffiti {
	public static void main(String[] args) {
		
	
	Robot ya = new Robot();
	
	ya.penDown();
	
	ya.setSpeed(100);
	
	ya.turn(30);
	ya.move(200);
	ya.turn(180);
	ya.move(70);
	ya.turn(100);
	ya.move(70);
	ya.hide();
	
}}
