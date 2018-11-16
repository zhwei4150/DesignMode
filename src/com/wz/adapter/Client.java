package com.wz.adapter;

import java.io.File;
import java.io.IOException;

public class Client {
	public static void main(String args[]) {
		
//		File directory = new File("conf/adapterconf.xml");//设定为当前文件夹 
//		    try {
//				System.out.println(directory.getCanonicalPath());
//				 System.out.println(directory.getAbsolutePath());//获取绝对路径 
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//获取标准的路径 
//		   

		//ScoreOperation operation;
		ScoreOperation operation=new OperationAdapter(); // 针对抽象目标接口编程
		//operation = (ScoreOperation) XMLUtil.getBean(); // 读取配置文件，反射生成对象
		int scores[] = { 84, 76, 50, 69, 90, 91, 88, 96 }; // 定义成绩数组
		int result[];
		int score;

		System.out.println("成绩排序结果：");
		result = operation.sort(scores);

		// 遍历输出成绩
		for (int i : scores) {
			System.out.print(i + ",");
		}
		System.out.println();

		System.out.println("查找成绩90：");
		score = operation.search(result, 90);
		if (score != -1) {
			System.out.println("找到成绩90。");
		} else {
			System.out.println("没有找到成绩90。");
		}

		System.out.println("查找成绩92：");
		score = operation.search(result, 92);
		if (score != -1) {
			System.out.println("找到成绩92。");
		} else {
			System.out.println("没有找到成绩92。");
		}
	}

}
