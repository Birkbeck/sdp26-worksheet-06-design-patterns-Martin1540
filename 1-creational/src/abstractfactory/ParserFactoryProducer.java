package abstractfactory;

import factorymethod.XMLParserFactory;

public final class ParserFactoryProducer {

    private ParserFactoryProducer() { }

    public static AbstractParserFactory getFactory(String factoryType) {
        return switch (factoryType) {
            case "Cl" -> new CLParserFactory();
            case "NY" -> new NYParserFactory();
            default -> throw new IllegalArgumentException("Unknown factory type: " + factoryType);
        };
    }
}