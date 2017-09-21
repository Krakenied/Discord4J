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
 * Represents an Audit Log Entity as defined by Discord.
 *
 * @see <a href="https://discordapp.com/developers/docs/resources/audit-log#audit-log-object">Audit Entity</a>
 */
@DiscordEntity
public class AuditLogEntity {

	private WebhookEntity[] webhooks;
	private UserEntity[] users;
	@JsonProperty("audit_log_entries")
	private AuditLogEntryEntity[] auditLogEntries;

	public WebhookEntity[] getWebhooks() {
		return webhooks;
	}

	public void setWebhooks(WebhookEntity[] webhooks) {
		this.webhooks = webhooks;
	}

	public UserEntity[] getUsers() {
		return users;
	}

	public void setUsers(UserEntity[] users) {
		this.users = users;
	}

	public AuditLogEntryEntity[] getAuditLogEntries() {
		return auditLogEntries;
	}

	public void setAuditLogEntries(AuditLogEntryEntity[] auditLogEntries) {
		this.auditLogEntries = auditLogEntries;
	}
}
