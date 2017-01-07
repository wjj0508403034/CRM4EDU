package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLead is a Querydsl query type for Lead
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLead extends EntityPathBase<Lead> {

    private static final long serialVersionUID = -971602514L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLead lead = new QLead("lead");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.educrm.enumeration.LeadLevelEnum> level = createEnum("level", com.educrm.enumeration.LeadLevelEnum.class);

    public final StringPath mobile = createString("mobile");

    public final QStaff owner;

    public final StringPath phone = createString("phone");

    public final QSalesReason salesReason;

    public final QSalesSource salesSource;

    public final NumberPath<Long> sourceId = createNumber("sourceId", Long.class);

    public final EnumPath<com.educrm.enumeration.SourceTypeEnum> sourceType = createEnum("sourceType", com.educrm.enumeration.SourceTypeEnum.class);

    public final EnumPath<com.educrm.enumeration.LeadStatusEnum> status = createEnum("status", com.educrm.enumeration.LeadStatusEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QLead(String variable) {
        this(Lead.class, forVariable(variable), INITS);
    }

    public QLead(Path<? extends Lead> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLead(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLead(PathMetadata<?> metadata, PathInits inits) {
        this(Lead.class, metadata, inits);
    }

    public QLead(Class<? extends Lead> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.owner = inits.isInitialized("owner") ? new QStaff(forProperty("owner"), inits.get("owner")) : null;
        this.salesReason = inits.isInitialized("salesReason") ? new QSalesReason(forProperty("salesReason")) : null;
        this.salesSource = inits.isInitialized("salesSource") ? new QSalesSource(forProperty("salesSource")) : null;
    }

}

