package task1;

import task1.document.*;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;
    private DokuWikiVisitor dokuWikiVisitor;
    private MarkdownVisitor markdownVisitor;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
        dokuWikiVisitor = new DokuWikiVisitor();
        markdownVisitor = new MarkdownVisitor();
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments
        for (TextSegment textSegment : textSegments) {
            textSegment.accept(dokuWikiVisitor);
        }
        return dokuWikiVisitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        for (TextSegment textSegment : textSegments) {
            textSegment.accept(markdownVisitor);
        }
        return markdownVisitor.getDocument();
    }
}
