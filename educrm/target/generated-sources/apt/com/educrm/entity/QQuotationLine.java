package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QQuotationLine is a Querydsl query type for QuotationLine
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QQuotationLine extends EntityPathBase<QuotationLine> {

    private static final long serialVersionUID = 656222606L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuotationLine quotationLine = new QQuotationLine("quotationLine");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<java.math.BigDecimal> discountPercentage = createNumber("discountPercentage", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> lineNumber = createNumber("lineNumber", Integer.class);

    public final NumberPath<java.math.BigDecimal> lineTotal = createNumber("lineTotal", java.math.BigDecimal.class);

    public final QProductBundle productBundle;

    public final NumberPath<java.math.BigDecimal> quantity = createNumber("quantity", java.math.BigDecimal.class);

    public final QQuotation quotation;

    public final NumberPath<java.math.BigDecimal> unitPrice = createNumber("unitPrice", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QQuotationLine(String variable) {
        this(QuotationLine.class, forVariable(variable), INITS);
    }

    public QQuotationLine(Path<? extends QuotationLine> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuotationLine(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuotationLine(PathMetadata<?> metadata, PathInits inits) {
        this(QuotationLine.class, metadata, inits);
    }

    public QQuotationLine(Class<? extends QuotationLine> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
        this.quotation = inits.isInitialized("quotation") ? new QQuotation(forProperty("quotation"), inits.get("quotation")) : null;
    }

}

