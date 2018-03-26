/*
 * User: viren
 * Copyright (c) 2018.
 */

package example;

import example.model.Account;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.configuration.CacheConfiguration;

public class CacheOpsExample {

    public static void main(String[] arg) throws IgniteException {
        Ignition.setClientMode(true);
        try(Ignite ignite = Ignition.start("config/example-ignite.xml")) {
            CacheConfiguration<Integer, Account> cfg = new CacheConfiguration<>();
            cfg.setName("demoCache");
            cfg.setAtomicityMode(CacheAtomicityMode.TRANSACTIONAL);

            //store keys in distributed cache
            IgniteCache<Integer, Account> cache = ignite.getOrCreateCache(cfg);
            cache.put(1, new Account(1, 100));
            cache.put(2, new Account(1, 200));
            cache.put(3, new Account(1, 300));

            //Retrieve values from distributed cache
            System.out.println(cache.get(1));
            System.out.println(cache.get(2));
            System.out.println(cache.get(3));

        }
    }
}
