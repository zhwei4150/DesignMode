package com.wz.facade;

public class FacadeSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEncryptFacade ef; //针对抽象外观类编程  
        //读取配置文件  
        //反射生成对象  
        ef = new NewEncryptFacade();
        ef.fileEncrypt("src.txt", "des.txt");  
	}

}
