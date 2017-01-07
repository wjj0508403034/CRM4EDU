package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QQuotation is a Querydsl query type for Quotation
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QQuotation extends EntityPathBase<Quotation> {

    private static final long serialVersionUID = 502977146L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuotation quotation = new QQuotation("quotation");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final NumberPath<java.math.BigDecimal> discountPercent = createNumber("discountPercent", java.math.BigDecimal.class);

    public final DateTimePath<org.joda.time.DateTime> expireDate = createDateTime("expireDate", org.joda.time.DateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QStaff owner;

    public final DateTimePath<org.joda.time.DateTime> quotationDate = createDateTime("quotationDate", org.joda.time.DateTime.class);

    public final StringPath remark = createString("remark");

    public final NumberPath<Long> sourceId = createNumber("sourceId", Long.class);

    public final EnumPath<com.educrm.enumeration.SourceTypeEnum> sourceType = createEnum("sourceType", com.educrm.enumeration.SourceTypeEnum.class);

    public final NumberPath<java.math.BigDecimal> totalAmount = createNumber("totalAmount", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QQuotation(String variable) {
        this(Quotation.class, forVariable(variable), INITS);
    }

    public QQuotation(Path<? extends Quotation> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuotation(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QQuotation(PathMetadata<?> metadata, PathInits inits) {
        this(Quotation.class, metadata, inits);
    }

    public QQuotation(Class<? extends Quotation> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.owner = inits.isInitialized("owner") ? new QStaff(forProperty("owner"), inits.get("owner")) : null;
    }

}

