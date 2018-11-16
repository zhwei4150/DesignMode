package com.wz.adapter;

public class OperationAdapter implements ScoreOperation {

	private QuickSort sortObj;
	private BinarySearch searchObj;

	public OperationAdapter() {
		sortObj = new QuickSort();
		searchObj = new BinarySearch();
	}

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return sortObj.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		// TODO Auto-generated method stub
		return searchObj.binarySearch(array, key);
	}

}
