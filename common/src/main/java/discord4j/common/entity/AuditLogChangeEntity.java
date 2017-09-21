/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.common.jackson.DiscordEntity;

/**
 * Represents an Audit Log Change Entity as defined by Discord.
 *
 * @see <a href="https://discordapp.com/developers/docs/resources/audit-log#audit-log-change-object">Audit Log Change
 * Entity</a>
 */
@DiscordEntity
public class AuditLogChangeEntity {

	@JsonProperty("new_value")
	private Object newValue;
	@JsonProperty("old_value")
	private Object oldValue;
	private String key;

	public Object getNewValue() {
		return newValue;
	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
