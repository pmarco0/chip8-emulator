package vm;

import vm.exceptions.DisplayException;

public class Display {
    private byte[] pixelArray;


    public Display(int size) {
        pixelArray = new byte[size];
    }

    public void setPixelValue(int position, int value) throws DisplayException {
        if (position < 0 || position >= pixelArray.length) {
            throw new DisplayException("Attempt to write pixel value to the wrong position.");
        }

        pixelArray[position] = (byte) value;
    }

    public byte getPixelValue(int position) throws DisplayException {
        if (position < 0 || position >= pixelArray.length) {
            throw new DisplayException("Attempt to read pixel value from the wrong position.");
        }

        return pixelArray[position];
    }

    public void clear() {
        for (int i = 0; i < pixelArray.length; i++) {
            pixelArray[i] = 0;
        }
    }

    public byte[] getPixelArray() {
        return pixelArray;
    }
}
