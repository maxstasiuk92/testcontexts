package org.testcontexts.builder;

import static java.util.Objects.requireNonNull;

/**
 * Missing parameters: inheritLocations, inheritProperties
 */
public class TestPropertySource {
	private String[] locations = new String[]{};
	private String[] properties = new String[]{};

	public TestPropertySource value(String... values) {
		return this;
	}

	public TestPropertySource locations(String... locations) {
		this.locations = requireNonNull(locations);
		return this;
	}

	public TestPropertySource properties(String... properties) {
		this.properties = requireNonNull(properties);
		return this;
	}
}
