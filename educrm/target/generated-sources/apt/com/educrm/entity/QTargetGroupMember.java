package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTargetGroupMember is a Querydsl query type for TargetGroupMember
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTargetGroupMember extends EntityPathBase<TargetGroupMember> {

    private static final long serialVersionUID = -1004207466L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTargetGroupMember targetGroupMember = new QTargetGroupMember("targetGroupMember");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QTargetGroup targetGroup;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QTargetGroupMember(String variable) {
        this(TargetGroupMember.class, forVariable(variable), INITS);
    }

    public QTargetGroupMember(Path<? extends TargetGroupMember> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTargetGroupMember(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTargetGroupMember(PathMetadata<?> metadata, PathInits inits) {
        this(TargetGroupMember.class, metadata, inits);
    }

    public QTargetGroupMember(Class<? extends TargetGroupMember> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.targetGroup = inits.isInitialized("targetGroup") ? new QTargetGroup(forProperty("targetGroup")) : null;
    }

}

