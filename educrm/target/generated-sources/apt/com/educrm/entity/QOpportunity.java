package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOpportunity is a Querydsl query type for Opportunity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOpportunity extends EntityPathBase<Opportunity> {

    private static final long serialVersionUID = -1406623679L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOpportunity opportunity = new QOpportunity("opportunity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DatePath<org.joda.time.LocalDate> closingDate = createDate("closingDate", org.joda.time.LocalDate.class);

    public final NumberPath<java.math.BigDecimal> closingPercentage = createNumber("closingPercentage", java.math.BigDecimal.class);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final StringPath description = createString("description");

    public final NumberPath<java.math.BigDecimal> discountAmount = createNumber("discountAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> discountPercent = createNumber("discountPercent", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final QStaff owner;

    public final NumberPath<java.math.BigDecimal> potentialAmount = createNumber("potentialAmount", java.math.BigDecimal.class);

    public final DatePath<org.joda.time.LocalDate> predictedClosingDate = createDate("predictedClosingDate", org.joda.time.LocalDate.class);

    public final StringPath remarks = createString("remarks");

    public final QSalesReason salesReason;

    public final QSalesSource salesSource;

    public final NumberPath<Long> sourceId = createNumber("sourceId", Long.class);

    public final EnumPath<com.educrm.enumeration.SourceTypeEnum> sourceType = createEnum("sourceType", com.educrm.enumeration.SourceTypeEnum.class);

    public final QStage stage;

    public final DatePath<org.joda.time.LocalDate> stageStartDate = createDate("stageStartDate", org.joda.time.LocalDate.class);

    public final DatePath<org.joda.time.LocalDate> startDate = createDate("startDate", org.joda.time.LocalDate.class);

    public final EnumPath<com.educrm.enumeration.OpportunityStatusEnum> status = createEnum("status", com.educrm.enumeration.OpportunityStatusEnum.class);

    public final NumberPath<java.math.BigDecimal> totalAmount = createNumber("totalAmount", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final NumberPath<java.math.BigDecimal> weightedAmount = createNumber("weightedAmount", java.math.BigDecimal.class);

    public QOpportunity(String variable) {
        this(Opportunity.class, forVariable(variable), INITS);
    }

    public QOpportunity(Path<? extends Opportunity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpportunity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpportunity(PathMetadata<?> metadata, PathInits inits) {
        this(Opportunity.class, metadata, inits);
    }

    public QOpportunity(Class<? extends Opportunity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.owner = inits.isInitialized("owner") ? new QStaff(forProperty("owner"), inits.get("owner")) : null;
        this.salesReason = inits.isInitialized("salesReason") ? new QSalesReason(forProperty("salesReason")) : null;
        this.salesSource = inits.isInitialized("salesSource") ? new QSalesSource(forProperty("salesSource")) : null;
        this.stage = inits.isInitialized("stage") ? new QStage(forProperty("stage")) : null;
    }

}

