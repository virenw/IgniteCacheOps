package example;

import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;

/**
 * Starts up an empty node
 */
public class IgniteNodeStartup {

    /**
     * Start up an empty node with example compute configuration.
     * @param args Command line arguments, none required.
     * @throws IgniteException If failed.
     */
    public static void main(String[] args) {
        Ignition.start("config/example-ignite.xml");
    }
}
