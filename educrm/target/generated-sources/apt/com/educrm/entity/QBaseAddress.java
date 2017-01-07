package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBaseAddress is a Querydsl query type for BaseAddress
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBaseAddress extends EntityPathBase<BaseAddress> {

    private static final long serialVersionUID = 1039321425L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBaseAddress baseAddress = new QBaseAddress("baseAddress");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QCity city;

    public final QCountry country;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QState state;

    public final StringPath street1 = createString("street1");

    public final StringPath street2 = createString("street2");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath zipCode = createString("zipCode");

    public QBaseAddress(String variable) {
        this(BaseAddress.class, forVariable(variable), INITS);
    }

    public QBaseAddress(Path<? extends BaseAddress> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBaseAddress(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBaseAddress(PathMetadata<?> metadata, PathInits inits) {
        this(BaseAddress.class, metadata, inits);
    }

    public QBaseAddress(Class<? extends BaseAddress> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city"), inits.get("city")) : null;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country")) : null;
        this.state = inits.isInitialized("state") ? new QState(forProperty("state")) : null;
    }

}

