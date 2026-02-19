package abstractfactory;

import factorymethod.ErrorXMLParser;
import factorymethod.FeedbackXMLParser;
import factorymethod.OrderXMLParser;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType) {
            case "ERROR" -> new NYErrorXMLParser();
            case "FEEDBACK" -> new NYFeedbackXMLParser();
            case "ORDER" -> new NYOrderXMLParser();
            default -> throw new IllegalArgumentException("Unknown parser type: " + parserType);
        };
    }
}
