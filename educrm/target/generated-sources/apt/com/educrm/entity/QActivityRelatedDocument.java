package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QActivityRelatedDocument is a Querydsl query type for ActivityRelatedDocument
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QActivityRelatedDocument extends EntityPathBase<ActivityRelatedDocument> {

    private static final long serialVersionUID = -1558913083L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActivityRelatedDocument activityRelatedDocument = new QActivityRelatedDocument("activityRelatedDocument");

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

    public QActivityRelatedDocument(String variable) {
        this(ActivityRelatedDocument.class, forVariable(variable), INITS);
    }

    public QActivityRelatedDocument(Path<? extends ActivityRelatedDocument> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivityRelatedDocument(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QActivityRelatedDocument(PathMetadata<?> metadata, PathInits inits) {
        this(ActivityRelatedDocument.class, metadata, inits);
    }

    public QActivityRelatedDocument(Class<? extends ActivityRelatedDocument> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.activity = inits.isInitialized("activity") ? new QActivity(forProperty("activity"), inits.get("activity")) : null;
    }

}

