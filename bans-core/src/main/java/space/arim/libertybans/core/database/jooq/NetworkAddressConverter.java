/*
 * LibertyBans
 * Copyright © 2025 Anand Beh
 *
 * LibertyBans is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * LibertyBans is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with LibertyBans. If not, see <https://www.gnu.org/licenses/>
 * and navigate to version 3 of the GNU Affero General Public License.
 */

package space.arim.libertybans.core.database.jooq;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.jooq.Converter;
import space.arim.libertybans.api.NetworkAddress;

public final class NetworkAddressConverter implements Converter<byte[], NetworkAddress> {

	@Override
	public NetworkAddress from(byte[] databaseObject) {
		return (databaseObject == null) ? null : NetworkAddress.of(databaseObject);
	}

	@Override
	public byte[] to(NetworkAddress userObject) {
		return (userObject == null) ? null : userObject.getRawAddress();
	}

	@Override
	public @NonNull Class<byte[]> fromType() {
		return byte[].class;
	}

	@Override
	public @NonNull Class<NetworkAddress> toType() {
		return NetworkAddress.class;
	}
}
