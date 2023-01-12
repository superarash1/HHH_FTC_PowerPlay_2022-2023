package org.firstinspires.ftc.team8110_Invicta.Hardware.Mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;

public class Webcam {
    private OpenCvCamera camera;
    private HardwareMap hardwareMap;

    public Webcam() {
        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        WebcamName webcam = hardwareMap.get(WebcamName.class, "webcam");

        camera = OpenCvCameraFactory.getInstance().createWebcam(webcam, cameraMonitorViewId);
    }

    public OpenCvCamera getCamera() {
        return camera;
    }

}
