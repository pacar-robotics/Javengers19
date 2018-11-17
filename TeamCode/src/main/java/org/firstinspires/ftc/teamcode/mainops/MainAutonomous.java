package org.firstinspires.ftc.teamcode.mainops;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.libraries.AutoLib;

/*
 * Title: MainAutonomous
 * Date Created: 11/3/2018
 * Date Modified: 11/4/2018
 * Author: Rahul, Poorvi, Varnika
 * Type: Main
 * Description: The main autonomous program
 */

@Autonomous(group = "Main")
public class MainAutonomous extends LinearOpMode {
    @SuppressWarnings("RedundantThrows")
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initializing...");
        telemetry.update();

        AutoLib autoLib = new AutoLib(this);

        telemetry.addData("Status", "Ready");
        telemetry.update();
        waitForStart();

        telemetry.addData("Status", "Running");
        telemetry.update();

        //Blue depot base parking near the robot picture

        autoLib.landOnGround();
       autoLib.calcMove(33, .2f );
        Thread.sleep(100);
        autoLib.calcTurn(80,.2f);
        Thread.sleep(100);
        autoLib.calcMove(87,.5f );
        autoLib.calcTurn(40, .5f );
       autoLib.calcMove(68,.5f);
    }
}
