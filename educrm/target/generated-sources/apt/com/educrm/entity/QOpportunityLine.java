package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOpportunityLine is a Querydsl query type for OpportunityLine
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOpportunityLine extends EntityPathBase<OpportunityLine> {

    private static final long serialVersionUID = 714128341L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOpportunityLine opportunityLine = new QOpportunityLine("opportunityLine");

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

    public final QOpportunity opportunity;

    public final QProductBundle productBundle;

    public final NumberPath<java.math.BigDecimal> quantity = createNumber("quantity", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> unitPrice = createNumber("unitPrice", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QOpportunityLine(String variable) {
        this(OpportunityLine.class, forVariable(variable), INITS);
    }

    public QOpportunityLine(Path<? extends OpportunityLine> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpportunityLine(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpportunityLine(PathMetadata<?> metadata, PathInits inits) {
        this(OpportunityLine.class, metadata, inits);
    }

    public QOpportunityLine(Class<? extends OpportunityLine> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.opportunity = inits.isInitialized("opportunity") ? new QOpportunity(forProperty("opportunity"), inits.get("opportunity")) : null;
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
    }

}

