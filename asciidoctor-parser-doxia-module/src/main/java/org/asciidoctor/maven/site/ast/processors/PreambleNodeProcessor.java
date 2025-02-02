package org.asciidoctor.maven.site.ast.processors;

import org.apache.maven.doxia.sink.Sink;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.maven.site.ast.NodeProcessor;

/**
 * Document preamble processor.
 *
 * @author abelsromero
 * @since 3.0.0
 */
public class PreambleNodeProcessor extends AbstractSinkNodeProcessor implements NodeProcessor {

    /**
     * Constructor.
     *
     * @param sink Doxia {@link Sink}
     */
    public PreambleNodeProcessor(Sink sink) {
        super(sink);
    }

    @Override
    public boolean applies(StructuralNode node) {
        return "preamble".equals(node.getNodeName());
    }

    /**
     * Do nothing, preamble only aggregates other blocks.
     **/
    @Override
    public void process(StructuralNode node) {
    }
}
