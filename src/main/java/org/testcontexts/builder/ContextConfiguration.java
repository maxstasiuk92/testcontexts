package org.testcontexts.builder;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.test.context.ContextLoader;

import static java.util.Objects.requireNonNull;

/**
 * Missing parameters: inheritLocations, inheritInitializers, loader
 */
//todo: spring's ApplicationContextInitializer
public class ContextConfiguration {
	private String[] locations = new String[]{};
	private Class<?>[] classes = new Class[]{};
	private Class<? extends ApplicationContextInitializer<?>>[] initializers = new Class[]{};
	private String name = "";

	public ContextConfiguration value(String... values) {
		return locations(values);
	}

	public ContextConfiguration locations(String... locations) {
		this.locations = requireNonNull(locations);
		return this;
	}

	public ContextConfiguration classes(Class<?>... classes) {
		this.classes = requireNonNull(classes);
		return this;
	}

	public ContextConfiguration initializers(Class<? extends ApplicationContextInitializer<?>>... initializers) {
		this.initializers = requireNonNull(initializers);
		return this;
	}

	public ContextConfiguration name(String name) {
		this.name = requireNonNull(name);
		return this;
	}

}
