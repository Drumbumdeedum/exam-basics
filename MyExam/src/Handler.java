public class Handler {
  ReadAndWrite copyMechanism;


  public Handler() {
     copyMechanism = new ReadAndWrite();
  }

  public void handleCommands(String[] args) {
    try {
      if (args.length == 0) {
        printUsage();
      } else if (args.length == 1) {
        noDestination();
      } else if (args.length > 2) {
        tooManyArguments();
        printUsage();
      } else if (args.length == 2) {
        copyMechanism.readWrite(args[0], args[1]);
      }
    } catch(Exception e) {
      System.out.println("Woops, and error has occurred: " + e.getClass());
    }
  }

  public void printUsage() {
    System.out.println("copy [source] [destination]");
  }

  public void noDestination() {
    System.out.println("No destination provided");
  }

  public void tooManyArguments() {
    System.out.println("Too many arguments provided, follow usage guidelines:");
  }
}
