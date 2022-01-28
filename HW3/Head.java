public class Head{

    private Eye leftEye, rightEye;

    public Eye getLeftEye(){
        return leftEye;
    }

    public Eye getRightEye(){
        return rightEye;
    }

    public Head(Eye leftEye,Eye rightEye){
        this.leftEye=leftEye;
        this.rightEye=rightEye;
    }
}
