package org.testcontexts.builder;

import org.springframework.test.context.ActiveProfilesResolver;
import static java.util.Objects.requireNonNull;

/**
 * Missing parameters: inheritProfiles
 */
//todo: do something with spring's ActiveProfileResolver
public class ActiveProfiles {
	private String[] profiles = new String[]{};
	private Class<? extends ActiveProfilesResolver> resolver = ActiveProfilesResolver.class;

	public ActiveProfiles value(String... values) {
		return profiles(values);
	}

	public ActiveProfiles profiles(String... profiles) {
		this.profiles = requireNonNull(profiles);
		return this;
	}

	public ActiveProfiles resolver(Class<? extends ActiveProfilesResolver> resolver) {
		this.resolver = requireNonNull(resolver);
		return this;
	}

}
