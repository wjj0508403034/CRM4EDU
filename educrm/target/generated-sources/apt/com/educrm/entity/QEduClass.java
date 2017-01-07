package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEduClass is a Querydsl query type for EduClass
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEduClass extends EntityPathBase<EduClass> {

    private static final long serialVersionUID = 995360948L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEduClass eduClass = new QEduClass("eduClass");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final EnumPath<com.educrm.enumeration.ClassTypeEnum> classType = createEnum("classType", com.educrm.enumeration.ClassTypeEnum.class);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> maxQty = createNumber("maxQty", Integer.class);

    public final NumberPath<Integer> minQty = createNumber("minQty", Integer.class);

    public final StringPath name = createString("name");

    public final QProductBundle productBundle;

    public final ListPath<Schedule, QSchedule> schedules = this.<Schedule, QSchedule>createList("schedules", Schedule.class, QSchedule.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QEduClass(String variable) {
        this(EduClass.class, forVariable(variable), INITS);
    }

    public QEduClass(Path<? extends EduClass> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEduClass(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEduClass(PathMetadata<?> metadata, PathInits inits) {
        this(EduClass.class, metadata, inits);
    }

    public QEduClass(Class<? extends EduClass> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productBundle = inits.isInitialized("productBundle") ? new QProductBundle(forProperty("productBundle"), inits.get("productBundle")) : null;
    }

}

