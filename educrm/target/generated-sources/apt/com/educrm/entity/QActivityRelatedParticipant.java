package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QActivityRelatedParticipant is a Querydsl query type for ActivityRelatedParticipant
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QActivityRelatedParticipant extends EntityPathBase<ActivityRelatedParticipant> {

    private static final long serialVersionUID = 162555977L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActivityRelatedParticipant activityRelatedParticipant = new QActivityRelatedParticipant("activityRelatedParticipant");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QActivity activity;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> sourceId = createNumber("sourceId", Long.class);

    public final EnumPath<com.educrm.enumeration.SourceTypeEnum> sourceType = createEnum("sourceType", com.educrm.enumeration.SourceTypeEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QActivityRelatedParticipant(String variable) {
        this(ActivityRelatedParticipant.class, forVariable(variable), INITS);
    }

    public QActivityRelatedParticipant(Path<? extends ActivityRelatedParticipant> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivityRelatedParticipant(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivityRelatedParticipant(PathMetadata<?> metadata, PathInits inits) {
        this(ActivityRelatedParticipant.class, metadata, inits);
    }

    public QActivityRelatedParticipant(Class<? extends ActivityRelatedParticipant> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.activity = inits.isInitialized("activity") ? new QActivity(forProperty("activity"), inits.get("activity")) : null;
    }

}

