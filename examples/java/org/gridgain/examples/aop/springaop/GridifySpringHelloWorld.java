// @java.file.header

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.examples.aop.springaop;

import org.gridgain.grid.gridify.*;

/**
 * This interface is required because Spring AOP is proxy-based and works only
 * with interfaces. The implementation of grid-enabled {@link #sayIt()} method
 * will simply print out the state set on this instance.
 *
 * @author @java.author
 * @version @java.version
 */
public interface GridifySpringHelloWorld {
    /**
     * Gets example state.
     *
     * @return Example state.
     */
    public String getState();

    /**
     * Method grid-enabled with {@link Gridify} annotation
     * (will be executed on the grid).
     *
     * @return Number of characters in the phrase.
     */
    @Gridify(taskClass = GridifySpringHelloWorldTask.class, timeout = 3000)
    public int sayIt();
}
