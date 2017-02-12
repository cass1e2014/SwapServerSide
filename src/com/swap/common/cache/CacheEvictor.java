package com.swap.common.cache;

import org.springframework.stereotype.Component;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

@Component
public class CacheEvictor implements RemovalListener<String, String> {

	@Override
	public void onRemoval(RemovalNotification<String, String> evictionElement) {
		System.out.println("Evicting entry from cache -----   ");
		System.out.println(evictionElement.getKey());
		System.out.println(evictionElement.getValue());
		System.out.println("Done -----   ");
	}
}
