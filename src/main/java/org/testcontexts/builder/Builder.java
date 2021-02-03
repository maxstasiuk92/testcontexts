package org.testcontexts.builder;

import org.testcontexts.wrapper.Wrapper;

import java.nio.file.Path;


public class Builder {
	private ContextConfiguration contextConfiguration = new ContextConfiguration();
	private ActiveProfiles activeProfiles = new ActiveProfiles();
	private TestPropertySource testPropertySource = new TestPropertySource();

	public Builder(String classPath) {

	}

	public Builder(Path classPath) {

	}

	public ContextConfiguration contextConfiguration() {
		return contextConfiguration;
	}

	public ActiveProfiles activeProfiles() {
		return activeProfiles;
	}

	public TestPropertySource testPropertySource() {
		return testPropertySource;
	}

	public Wrapper build() {
		return null;
	}

}
