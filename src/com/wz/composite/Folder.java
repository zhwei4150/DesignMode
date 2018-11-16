package com.wz.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	private String name;

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return (AbstractFile) fileList.get(i);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("****对文件夹'" + name + "'进行杀毒"); // 模拟杀毒
		for (Object obj : fileList) {
			((AbstractFile) obj).killVirus();
		}
	}

}
