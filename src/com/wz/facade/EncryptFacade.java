package com.wz.facade;

public class EncryptFacade extends AbstractEncryptFacade{
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;

	public EncryptFacade(){
		reader=new FileReader();
		cipher=new CipherMachine();
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
