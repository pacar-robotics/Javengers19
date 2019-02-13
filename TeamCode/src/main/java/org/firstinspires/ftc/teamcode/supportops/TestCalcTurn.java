package org.firstinspires.ftc.teamcode.supportops;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.libraries.AutoLib;
import org.firstinspires.ftc.teamcode.libraries.Constants;

/*
 * Title: CalcTurn Test
 * Date Created: 2/13/2019
 * Date Modified: 2/13/2019
 * Author: Poorvi
 * Type: Support
 * Description: This will test if the robot can actually turn
 */

@Autonomous(group = "Support")
public class TestCalcTurn extends LinearOpMode {
    private AutoLib autoLib;

    @SuppressWarnings("RedundantThrows")
    @Override
    public void runOpMode() throws InterruptedException {
        initialize();
        telemetry.addData("about to turn","initialized");
        telemetry.update();
        autoLib.calcTurn(360,.8f);
        telemetry.addData("Just turned","finished turning");
        telemetry.update();
    }

    private void initialize() {
        telemetry.addData("Status", "Initializing...");
        telemetry.update();

        autoLib = new AutoLib(this);

        telemetry.addData("Status", "Ready");
        telemetry.update();
        waitForStart();

        telemetry.addData("Status", "Running");
        telemetry.update();
    }
}
