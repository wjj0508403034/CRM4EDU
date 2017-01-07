package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProductBundle is a Querydsl query type for ProductBundle
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductBundle extends EntityPathBase<ProductBundle> {

    private static final long serialVersionUID = -2048962497L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductBundle productBundle = new QProductBundle("productBundle");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QCategory category;

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final DatePath<org.joda.time.LocalDate> endTime = createDate("endTime", org.joda.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final DatePath<org.joda.time.LocalDate> startTime = createDate("startTime", org.joda.time.LocalDate.class);

    public final NumberPath<java.math.BigDecimal> totalTimeInHours = createNumber("totalTimeInHours", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QProductBundle(String variable) {
        this(ProductBundle.class, forVariable(variable), INITS);
    }

    public QProductBundle(Path<? extends ProductBundle> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductBundle(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductBundle(PathMetadata<?> metadata, PathInits inits) {
        this(ProductBundle.class, metadata, inits);
    }

    public QProductBundle(Class<? extends ProductBundle> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
    }

}

