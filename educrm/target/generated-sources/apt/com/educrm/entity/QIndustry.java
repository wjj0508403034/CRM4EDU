package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QIndustry is a Querydsl query type for Industry
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QIndustry extends EntityPathBase<Industry> {

    private static final long serialVersionUID = -778522832L;

    public static final QIndustry industry = new QIndustry("industry");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QIndustry(String variable) {
        super(Industry.class, forVariable(variable));
    }

    public QIndustry(Path<? extends Industry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIndustry(PathMetadata<?> metadata) {
        super(Industry.class, metadata);
    }

}

