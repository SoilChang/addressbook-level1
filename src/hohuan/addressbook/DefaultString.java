package hohuan.addressbook;

/*
* NOTE : ==================================================================
* These messages shown to the user are defined in one place for convenient
* editing and proof reading. Such messages are considered part of the UI
* and may be subjected to review by UI experts or technical writers. Note
* that Some of the strings below include '%1$s' etc to mark the locations
* at which java String.format(...) method can insert values.
* =========================================================================
*/
public class DefaultString {
    /**
     * Default file path used if the user doesn't provide the file name.
     */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";

    /**
     * Version info of the program.
     */
    public static final String VERSION = "AddessBook Level 1 - Version 2.0";

    /**
    * A decorative prefix added to the beginning of lines printed by AddressBook
    */
    public static final String LINE_PREFIX = "|| ";

    /**
     * A platform independent line separator.
     */
    public static final String LS = System.lineSeparator() + DefaultString.LINE_PREFIX;

    /*
     * NOTE : ==================================================================
     * These messages shown to the user are defined in one place for convenient
     * editing and proof reading. Such messages are considered part of the UI
     * and may be subjected to review by UI experts or technical writers. Note
     * that Some of the strings below include '%1$s' etc to mark the locations
     * at which java String.format(...) method can insert values.
     * =========================================================================
     */

    public static final String MESSAGE_ADDED = "New person added: %1$s, Phone: %2$s, Email: %3$s";
    public static final String MESSAGE_ADDRESSBOOK_CLEARED = "Address book has been cleared!";
    public static final String MESSAGE_COMMAND_HELP = "%1$s: %2$s";
    public static final String MESSAGE_COMMAND_HELP_PARAMETERS = "\tParameters: %1$s";
    public static final String MESSAGE_COMMAND_HELP_EXAMPLE = "\tExample: %1$s";
    public static final String MESSAGE_DELETE_PERSON_SUCCESS = "Deleted Person: %1$s";
    public static final String MESSAGE_DISPLAY_PERSON_DATA = "%1$s  Phone Number: %2$s  Email: %3$s";
    public static final String MESSAGE_DISPLAY_LIST_ELEMENT_INDEX = "%1$d. ";
    public static final String MESSAGE_GOODBYE = "Exiting Address Book... Good bye!";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format: %1$s " + DefaultString.LS
            + "%2$s";
    public static final String MESSAGE_INVALID_FILE = "The given file name [%1$s] is not a valid file name!";
    public static final String MESSAGE_INVALID_PROGRAM_ARGS = "Too many parameters! Correct program argument format:"
            + DefaultString.LS + "\tjava AddressBook" + DefaultString.LS
            + "\tjava AddressBook [custom storage file path]";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_INDEX = "The person index provided is invalid";
    public static final String MESSAGE_INVALID_STORAGE_FILE_CONTENT = "Storage file has invalid content";
    public static final String MESSAGE_PERSON_NOT_IN_ADDRESSBOOK = "Person could not be found in address book";
    public static final String MESSAGE_ERROR_CREATING_STORAGE_FILE = "Error: unable to create file: %1$s";
    public static final String MESSAGE_ERROR_MISSING_STORAGE_FILE = "Storage file missing: %1$s";
    public static final String MESSAGE_ERROR_READING_FROM_FILE = "Unexpected error: unable to read from file: %1$s";
    public static final String MESSAGE_ERROR_WRITING_TO_FILE = "Unexpected error: unable to write to file: %1$s";
    public static final String MESSAGE_PERSONS_FOUND_OVERVIEW = "%1$d persons found!";
    public static final String MESSAGE_STORAGE_FILE_CREATED = "Created new empty storage file: %1$s";
    public static final String MESSAGE_WELCOME = "Welcome to the Address Book!";
    public static final String MESSAGE_USING_DEFAULT_FILE = "Using default storage file : "
            + DefaultString.DEFAULT_STORAGE_FILEPATH;

    // These are the prefix strings to define the data type of a command parameter
    public static final String PERSON_DATA_PREFIX_PHONE = "p/";
    public static final String PERSON_DATA_PREFIX_EMAIL = "e/";

    public static final String PERSON_STRING_REPRESENTATION = "%1$s " // name
            + DefaultString.PERSON_DATA_PREFIX_PHONE + "%2$s " // phone
            + DefaultString.PERSON_DATA_PREFIX_EMAIL + "%3$s"; // email
    public static final String COMMAND_ADD_WORD = "add";
    public static final String COMMAND_ADD_DESC = "Adds a person to the address book.";
    public static final String COMMAND_ADD_PARAMETERS = "NAME " + DefaultString.PERSON_DATA_PREFIX_PHONE
            + "PHONE_NUMBER " + DefaultString.PERSON_DATA_PREFIX_EMAIL + "EMAIL";

    public static final String COMMAND_ADD_EXAMPLE = DefaultString.COMMAND_ADD_WORD
            + " John Doe p/98765432 e/johnd@gmail.com";

    public static final String COMMAND_FIND_WORD = "find";
    public static final String COMMAND_FIND_DESC = "Finds all persons whose names contain any of the specified "
            + "keywords (case-sensitive) and displays them as a list with index numbers.";
    public static final String COMMAND_FIND_PARAMETERS = "KEYWORD [MORE_KEYWORDS]";
    public static final String COMMAND_FIND_EXAMPLE = DefaultString.COMMAND_FIND_WORD + " alice bob charlie";

    public static final String COMMAND_LIST_WORD = "list";
    public static final String COMMAND_LIST_DESC = "Displays all persons as a list with index numbers.";
    public static final String COMMAND_LIST_EXAMPLE = DefaultString.COMMAND_LIST_WORD;

    public static final String COMMAND_SORT_WORD = "sort";
    public static final String COMMAND_SORT_DESC = "Displays all persons as a list with index numbers, sorted according to name.";
    public static final String COMMAND_SORT_EXAMPLE = DefaultString.COMMAND_SORT_WORD;

    public static final String COMMAND_DELETE_WORD = "delete";
    public static final String COMMAND_DELETE_DESC = "Deletes a person identified by the index number used in "
            + "the last find/list call.";
    public static final String COMMAND_DELETE_PARAMETER = "INDEX";

    public static final String COMMAND_DELETE_EXAMPLE = DefaultString.COMMAND_DELETE_WORD + " 1";

    public static final String COMMAND_CLEAR_WORD = "clear";
    public static final String COMMAND_CLEAR_DESC = "Clears address book permanently.";
    public static final String COMMAND_CLEAR_EXAMPLE = DefaultString.COMMAND_CLEAR_WORD;

    public static final String COMMAND_HELP_WORD = "help";
    public static final String COMMAND_HELP_DESC = "Shows program usage instructions.";
    public static final String COMMAND_HELP_EXAMPLE = DefaultString.COMMAND_HELP_WORD;

    public static final String COMMAND_EXIT_WORD = "exit";
    public static final String COMMAND_EXIT_DESC = "Exits the program.";
    public static final String COMMAND_EXIT_EXAMPLE = DefaultString.COMMAND_EXIT_WORD;

    public static final String DIVIDER = "===================================================";

}