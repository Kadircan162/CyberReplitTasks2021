package assignmentOnOOPConcept;

//Question-12
public class Phone {

}

class CameraPhone extends Phone{
    int imageSize;//representing the size in megapixels (for simplicity assume a pixel takes up one byte
    int memorySize;//representing the number of gigabytes in the camera's memory

    CameraPhone(int imageSize, int memorySize){
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}

class Test12{
    public static void main(String[] args) {
        CameraPhone cameraPhone = new CameraPhone(10, 4);
        System.out.println(cameraPhone.numPictures());
    }
}


