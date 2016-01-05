/*
 * Copyright 2016 Diennea S.R.L..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blazingcache.jcache;

import blazingcache.jcache.BlazingCacheCache;
import javax.cache.configuration.CompleteConfiguration;
import javax.cache.configuration.Configuration;

import javax.cache.management.CacheMXBean;

/**
 * MXBean for Cache management
 *
 * @author enrico.olivelli
 */
public class BlazingCacheConfigurationMXBean<K, V> implements CacheMXBean {

    private final BlazingCacheCache<K, V> cache;

    public BlazingCacheConfigurationMXBean(BlazingCacheCache<K, V> cache) {
        this.cache = cache;
    }

    @Override
    public String getKeyType() {
        return cache.getConfiguration(CompleteConfiguration.class).getKeyType().getName();
    }

    @Override
    public String getValueType() {
        return cache.getConfiguration(CompleteConfiguration.class).getValueType().getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isReadThrough() {
        return cache.getConfiguration(CompleteConfiguration.class).isReadThrough();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isWriteThrough() {
        return cache.getConfiguration(CompleteConfiguration.class).isWriteThrough();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isStoreByValue() {
        return cache.getConfiguration(Configuration.class).isStoreByValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isStatisticsEnabled() {
        return cache.getConfiguration(CompleteConfiguration.class).isStatisticsEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isManagementEnabled() {
        return cache.getConfiguration(CompleteConfiguration.class).isManagementEnabled();
    }

}
