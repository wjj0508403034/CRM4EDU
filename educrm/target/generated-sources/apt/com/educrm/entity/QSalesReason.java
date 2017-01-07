package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSalesReason is a Querydsl query type for SalesReason
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSalesReason extends EntityPathBase<SalesReason> {

    private static final long serialVersionUID = 1233815518L;

    public static final QSalesReason salesReason = new QSalesReason("salesReason");

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

    public QSalesReason(String variable) {
        super(SalesReason.class, forVariable(variable));
    }

    public QSalesReason(Path<? extends SalesReason> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalesReason(PathMetadata<?> metadata) {
        super(SalesReason.class, metadata);
    }

}

