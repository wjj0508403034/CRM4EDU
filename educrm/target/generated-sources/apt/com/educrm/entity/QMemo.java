package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMemo is a Querydsl query type for Memo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMemo extends EntityPathBase<Memo> {

    private static final long serialVersionUID = -971572340L;

    public static final QMemo memo = new QMemo("memo");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

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

    public final StringPath title = createString("title");

    public final EnumPath<com.educrm.enumeration.MemoTypeEnum> type = createEnum("type", com.educrm.enumeration.MemoTypeEnum.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QMemo(String variable) {
        super(Memo.class, forVariable(variable));
    }

    public QMemo(Path<? extends Memo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemo(PathMetadata<?> metadata) {
        super(Memo.class, metadata);
    }

}

