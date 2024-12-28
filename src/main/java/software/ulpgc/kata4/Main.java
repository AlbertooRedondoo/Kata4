package software.ulpgc.kata4;

import software.ulpgc.kata4.control.ImportCommand;

public class Main {
    public static void main(String[] args) throws Exception{
        ImportCommand importCommand = new ImportCommand();
        importCommand.execute();
    }
}