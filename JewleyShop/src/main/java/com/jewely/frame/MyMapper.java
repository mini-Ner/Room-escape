package com.jewely.frame;


public interface MyMapper<K,V> {
	public void insert(V v) throws Exception;
}
