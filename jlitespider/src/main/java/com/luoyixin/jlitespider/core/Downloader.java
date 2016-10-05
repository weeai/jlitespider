package com.luoyixin.jlitespider.core;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.luoyixin.jlitespider.mq.MQItem;

/**
 * author: Yixin Luo
 * 2016/3/4
 * 
 * 下载器的接口
 * **/
public interface Downloader {
	/**
	 * 这个函数将url中对应的网页下载
	 * **/
	public void download(Object url, Map<String, MessageQueue> mQueue) throws IOException;
}