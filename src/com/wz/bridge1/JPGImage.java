package com.wz.bridge1;

public class JPGImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + "，格式为JPG。");
	}

}
