package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;
import static seedu.address.logic.commands.Command.CLEAR_COMMAND_WORD;
import static seedu.address.logic.commands.Command.EXIT_COMMAND_WORD;
import static seedu.address.logic.commands.Command.HELP_COMMAND_WORD;
import static seedu.address.logic.commands.Command.PREVIOUS_COMMAND_WORD;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.ExitCommand;
import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.PreviousCommand;
import seedu.address.logic.parser.book.BookCommandParser;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.logic.parser.patron.PatronCommandParser;

/**
 * Parses user input.
 */
public class AddressBookParser {

    /**
     * Used for initial separation of command word and args.
     */
    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandWord>\\S+)(?<arguments>.*)");

    /**
     * Used to store the last n commands for easy reference.
     */
    private static LinkedList<String> previousCommands = new LinkedList<>();


    //TODO: Change this to non static methods
    /**
     * Shows the last used commands to the user only if it is not u
     *
     * @return a String of the past commands
     */
    public static String getPreviousCommands() {
        if (previousCommands == null || previousCommands.size() == 0) {
            return "";
        }
        return previousCommands.poll();
    }

    /**
     * Keeps track of Commands inputted.
     */
    public static void addCommand(String command) {
        if (command.equals(PREVIOUS_COMMAND_WORD)) {
            return;
        }
        previousCommands.push(command);
    }

    /**
     * Parses user input into command for execution.
     *
     * @param userInput full user input string
     * @return the command based on the user input
     * @throws ParseException if the user input does not conform the expected format
     */
    public Command parseCommand(String userInput) throws ParseException {
        addCommand(userInput);
        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
        }

        final String commandWord = matcher.group("commandWord");
        final String arguments = matcher.group("arguments");

        switch (commandWord) {

        case Command.PATRON_COMMAND_GROUP:
            return new PatronCommandParser().parse(arguments);

        case Command.BOOK_COMMAND_GROUP:
            return new BookCommandParser().parse(arguments);

        case CLEAR_COMMAND_WORD:
            return new ClearCommand();

        case EXIT_COMMAND_WORD:
            return new ExitCommand();

        case HELP_COMMAND_WORD:
            return new HelpCommand();

        case PREVIOUS_COMMAND_WORD:
            return new PreviousCommand();

        default:
            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
        }
    }

}
