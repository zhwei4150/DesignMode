package com.wz.composite;

public class ImageFile extends AbstractFile {
	private String name;

	public ImageFile(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法！");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法！");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该方法！");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----对图像文件'" + name + "'进行杀毒");

	}

}
