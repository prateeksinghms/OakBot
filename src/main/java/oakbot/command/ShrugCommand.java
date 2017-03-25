package oakbot.command;

import oakbot.bot.Bot;
import oakbot.bot.ChatResponse;
import oakbot.chat.ChatCommand;
import oakbot.util.ChatBuilder;

/**
 * Displays a "shrug" emoticon.
 * @author Michael Angstadt
 */
public class ShrugCommand implements Command {
	@Override
	public String name() {
		return "shrug";
	}

	@Override
	public String description() {
		return "Meh.";
	}

	@Override
	public String helpText(String trigger) {
		return description();
	}

	@Override
	public ChatResponse onMessage(ChatCommand chatCommand, boolean isAdmin, Bot bot) {
		//@formatter:off
		return new ChatResponse(new ChatBuilder()
			.append("¯\\\\_(\u30C4)_/¯")
		);
		//@formatter:on
	}
}