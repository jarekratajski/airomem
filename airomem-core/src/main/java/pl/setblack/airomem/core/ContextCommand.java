/* Copyright (c) Jarek Ratajski, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package pl.setblack.airomem.core;

import java.io.Serializable;

/**
 * Command interface for all operations that mutate system.
 *
 * Implement command (classic class or lambda) and pass to persistence
 * Controller.
 *
 * @author jarekr
 */
@FunctionalInterface
public interface ContextCommand<T extends Storable> extends Serializable {

    /**
     *
     * @param system reference to mutable system
     * @param context context info (such as date)
     */
    void execute(T system, PrevalanceContext context);
}
