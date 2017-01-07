package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCompetitorProductBundle is a Querydsl query type for CompetitorProductBundle
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCompetitorProductBundle extends EntityPathBase<CompetitorProductBundle> {

    private static final long serialVersionUID = -526554925L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompetitorProductBundle competitorProductBundle = new QCompetitorProductBundle("competitorProductBundle");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QCategory category;

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final DatePath<org.joda.time.LocalDate> endTime = createDate("endTime", org.joda.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final DatePath<org.joda.time.LocalDate> startTime = createDate("startTime", org.joda.time.LocalDate.class);

    public final NumberPath<java.math.BigDecimal> totalTimeInHours = createNumber("totalTimeInHours", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCompetitorProductBundle(String variable) {
        this(CompetitorProductBundle.class, forVariable(variable), INITS);
    }

    public QCompetitorProductBundle(Path<? extends CompetitorProductBundle> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCompetitorProductBundle(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCompetitorProductBundle(PathMetadata<?> metadata, PathInits inits) {
        this(CompetitorProductBundle.class, metadata, inits);
    }

    public QCompetitorProductBundle(Class<? extends CompetitorProductBundle> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
    }

}

