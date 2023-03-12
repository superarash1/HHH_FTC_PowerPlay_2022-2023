
package org.firstinspires.ftc.team8110_Invicta.OpModes.Auton;

import android.text.style.TtsSpan;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder;
import com.acmerobotics.roadrunner.util.NanoClock;
import com.arcrobotics.ftclib.geometry.Rotation2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.team8110_Invicta.Hardware.ElefanteDrugMcNuggets;
import org.firstinspires.ftc.team8110_Invicta.Hardware.Mechanisms.Webcam;
import org.firstinspires.ftc.team8110_Invicta.Hardware.Pipelines.ColorDetector;
import org.firstinspires.ftc.team8110_Invicta.Hardware.States.Colors;
import org.firstinspires.ftc.team8110_Invicta.Resources.RoadRunnerQuickstart.trajectorysequence.TrajectorySequence;
import org.firstinspires.ftc.team8110_Invicta.Resources.RoadRunnerQuickstart.trajectorysequence.TrajectorySequenceBuilder;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;


@Autonomous
public class LeftBlue extends LinearOpMode {

    ElefanteDrugMcNuggets robot;

    Color_Control dog;

    ElefanteDrugMcNuggets.ConeClaw sup;

    ElefanteDrugMcNuggets.ScissorLift yea;

    ColorDetector cat;

    ElapsedTime seconds;

    OpenCvCamera camera;

    TrajectorySequence build;

    Pose2d pos;

    Vector2d vector;
    public double num = 2500.0;



    @Override
    public void runOpMode() {


        robot = new ElefanteDrugMcNuggets(hardwareMap);
        cat = new ColorDetector();
        // pos = new Pose2d(34,60,Math.toRadians(270.0));
        vector = new Vector2d(0, 0);

        camera = new Webcam(hardwareMap).getCamera();

//         ElefanteDrugMcNuggets.ConeClaw sup = robot.getClaw();
//
//        ElefanteDrugMcNuggets.ScissorLift yea = robot.getLift();

        cat.getColor();

        //double num = 2500.0;
        waitForStart();
        //robot.getLift().run(-5000);
        // troubleshooting trunk using forced button press
//        sup.open();
//        sup.close();
        ElapsedTime currentActionTimer = new ElapsedTime();
        currentActionTimer.startTime();
        gamepad1.dpad_down = true;
        while (currentActionTimer.seconds() < 4) {
            robot.teleOpLift(gamepad1);
        }
//        robot.teleOpDrive(gamepad1);
//        while (currentActionTimer.seconds() < 2.5) {
//            if (yea.getPosition() < 5000) {
//                gamepad1.dpad_down = true;
//                gamepad1.dpad_up = false;
//                robot.teleOpLift(gamepad1);
//            }
//            if (yea.getPosition() > 5000) {
//                gamepad1.dpad_down = false;
//                gamepad1.dpad_up = true;
//                robot.teleOpLift(gamepad1);
//            }
//        }

//        gamepad1.dpad_up = true;

                //robot.getLift().power(.75);
//                build = robot.trajectorySequenceBuilder(new Pose2d(0.0, 0.0, Math.toRadians(0.0)))
//                        .forward(4.0)
//                        .build();
                //]'yea.power(-.7);
//        if (opModeIsActive()) {
//            robot.getLift().run(180);
//            build = robot.trajectorySequenceBuilder(
//                    new Pose2d(34.4, 60.0, Math.toRadians(-90.0)))
//                    .forward(4.0)
//                    .build();
//            //sup.open();
//            robot.getLift().run(-5000);
//            telemetry.addData("reached", 0);
//            telemetry.update();
//            robot.getLift().power(-.9);
//            sup.open();
//            //yea.upLevel();
//            robot.getLift().run(-5000);
//            robot.getLift().power(-.9);
//            build = robot.trajectorySequenceBuilder(new Pose2d(34.4, 60, Math.toRadians(-90.0)))
//                    .strafeRight(21.3)
//                    .forward(25.0)
//                    .strafeLeft(10.8)
//                    .build();
//            sup.open();
//            sup.close();
//            yea.downLevel();
//            robot.getLift().power(-500.0);
//            for(int i = 0; i < 6; i++) {
//                build = robot.trajectorySequenceBuilder(new Pose2d(23.6, 33.3, Math.toRadians(-90.0)))
//                        .strafeRight(11.0)
//                        .back(2.0)
//                        .turn(Math.toRadians(180.0))
//                        .forward(24.0)
//                        .turn(Math.toRadians(45.0))
//                        .forward(4.0)
//                        .build();
//                robot.getLift().run(-5000);
//                robot.getLift().power(-.9);
//                sup.open();
//                sup.close();
//                robot.getLift().power(5200.0);
//                yea.upLevel();
//                robot.getLift().run(-5000);
//                robot.getLift().power(-.9);
//                build = robot.trajectorySequenceBuilder(new Pose2d(9.5, 62.0, Math.toRadians(-225.0)))
//                        .back(4.0)
//                        .turn(Math.toRadians(-45.0))
//                        .turn(Math.toRadians(180.0))
//                        .forward(25.0)
//                        .strafeLeft(10.8)
//                        .build();
//                sup.open();
//                sup.close();
//                num = num - 500.0;
////            }
//
//            //last part for the robot
//            if(cat.getColor() == Colors.RED){
//                //RED
//                build = robot.trajectorySequenceBuilder(new Pose2d(34.4, 60.0, Math.toRadians(-90.0)))
//                        .strafeLeft(30.0)
//                        .build();
//            }
//            if(cat.getColor() == Colors.BLUE){
//                //BLUE
//                build = robot.trajectorySequenceBuilder(new Pose2d(34.4, 60.0, Math.toRadians(-90.0)))
//                        .strafeRight(12.0)
//                        .build();
//            }
//            if(cat.getColor() == Colors.GREEN){
//                //GREEN
//                build = robot.trajectorySequenceBuilder(new Pose2d(34.4,60.0, Math.toRadians(-90.0)))
//                        .strafeRight(12.0)
//                        .forward(22.0)
//                        .strafeLeft(24.0)
//                        .build();
//            }
//
//        }
//
//        waitForStart();

//        while (opModeIsActive()) {
//            robot.followTrajectorySequence(build);
//        }

        }}