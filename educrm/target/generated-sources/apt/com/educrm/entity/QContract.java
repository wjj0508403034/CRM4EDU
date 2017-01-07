package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QContract is a Querydsl query type for Contract
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContract extends EntityPathBase<Contract> {

    private static final long serialVersionUID = -1472627100L;

    public static final QContract contract = new QContract("contract");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath channel = createString("channel");

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

    public final DatePath<org.joda.time.LocalDate> startTime = createDate("startTime", org.joda.time.LocalDate.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QContract(String variable) {
        super(Contract.class, forVariable(variable));
    }

    public QContract(Path<? extends Contract> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContract(PathMetadata<?> metadata) {
        super(Contract.class, metadata);
    }

}

