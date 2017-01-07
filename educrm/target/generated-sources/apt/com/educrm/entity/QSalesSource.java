package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSalesSource is a Querydsl query type for SalesSource
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSalesSource extends EntityPathBase<SalesSource> {

    private static final long serialVersionUID = 1272274357L;

    public static final QSalesSource salesSource = new QSalesSource("salesSource");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSalesSource(String variable) {
        super(SalesSource.class, forVariable(variable));
    }

    public QSalesSource(Path<? extends SalesSource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalesSource(PathMetadata<?> metadata) {
        super(SalesSource.class, metadata);
    }

}

