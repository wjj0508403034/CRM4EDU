package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QActivity is a Querydsl query type for Activity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QActivity extends EntityPathBase<Activity> {

    private static final long serialVersionUID = 1733320801L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActivity activity = new QActivity("activity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath cancelDesc = createString("cancelDesc");

    public final BooleanPath cancelStatus = createBoolean("cancelStatus");

    public final QContactPerson contactPerson;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final QCustomer customer;

    public final BooleanPath deleteStatus = createBoolean("deleteStatus");

    public final StringPath description = createString("description");

    public final DateTimePath<org.joda.time.DateTime> endTime = createDateTime("endTime", org.joda.time.DateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QStaff owner;

    public final EnumPath<com.educrm.enumeration.ActivityPriority> priority = createEnum("priority", com.educrm.enumeration.ActivityPriority.class);

    public final DateTimePath<org.joda.time.DateTime> startTime = createDateTime("startTime", org.joda.time.DateTime.class);

    public final EnumPath<com.educrm.enumeration.ActivityStatusEnum> status = createEnum("status", com.educrm.enumeration.ActivityStatusEnum.class);

    public final StringPath subject = createString("subject");

    public final EnumPath<com.educrm.enumeration.ActivityTypeEnum> type = createEnum("type", com.educrm.enumeration.ActivityTypeEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QActivity(String variable) {
        this(Activity.class, forVariable(variable), INITS);
    }

    public QActivity(Path<? extends Activity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivity(PathMetadata<?> metadata, PathInits inits) {
        this(Activity.class, metadata, inits);
    }

    public QActivity(Class<? extends Activity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contactPerson = inits.isInitialized("contactPerson") ? new QContactPerson(forProperty("contactPerson"), inits.get("contactPerson")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.owner = inits.isInitialized("owner") ? new QStaff(forProperty("owner"), inits.get("owner")) : null;
    }

}

