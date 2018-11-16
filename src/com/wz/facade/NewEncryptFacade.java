package com.wz.facade;

public class NewEncryptFacade extends AbstractEncryptFacade{
	private FileReader reader;
	private NewCipherMachine cipher;
	private FileWriter writer;

	public NewEncryptFacade(){
		reader=new FileReader();
		cipher=new NewCipherMachine();
		writer=new FileWriter();
	}
	@Override
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		// TODO Auto-generated method stub
		reader.read(fileNameSrc);
		cipher.encrypt("111");
		writer.write("1111", fileNameDes);
	}

}
