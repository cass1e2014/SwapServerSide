package com.swap.common.cache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.swap.common.constants.Constants;

/**
 * Common cache is responsible for caching the every request response Persists
 * it in the in memory cache and then while being evicted, it is sent to Kafka
 * for further processing and persistence in ElasticSearch
 * 
 * @author shanganesh
 *
 */
@Component
public class CommonCache {

	@Inject
	CacheEvictor cacheEvictor;

	private LoadingCache<String, String> cache;

	@PostConstruct
	public void init() {
		try {
			cache = (LoadingCache<String, String>) CacheBuilder.newBuilder().maximumSize(7)
					.expireAfterWrite(10, TimeUnit.SECONDS).removalListener(cacheEvictor)
					.build(new CacheLoader<String, String>() {
						public String load(String key) throws Exception {
							return null;
						}
					});
			startBackgroundThreadForCachePoke();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Starts the background thread for poking cache at regular intervals
	 * When cache eviction kicks in, data is removed from the cache and sent to Kafka/ ES for further processing.
	 */
	public void startBackgroundThreadForCachePoke() {
		ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(2);
		scheduledService.scheduleAtFixedRate(new Runnable() {
			public void run() {
				try {
					cache.get("1");
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, Constants.CACHE_INITIAL_DELAY, Constants.CACHE_FIXED_RATE, TimeUnit.SECONDS);
	}

	public LoadingCache<String, String> getCache() {
		return cache;
	}

	public void setCache(LoadingCache<String, String> cache) {
		this.cache = cache;
	}

}
