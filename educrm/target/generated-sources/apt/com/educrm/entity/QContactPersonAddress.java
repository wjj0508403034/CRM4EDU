package com.educrm.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QContactPersonAddress is a Querydsl query type for ContactPersonAddress
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContactPersonAddress extends EntityPathBase<ContactPersonAddress> {

    private static final long serialVersionUID = 278454513L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactPersonAddress contactPersonAddress = new QContactPersonAddress("contactPersonAddress");

    public final QBaseAddress _super;

    // inherited
    public final QCity city;

    // inherited
    public final QCountry country;

    //inherited
    public final NumberPath<Long> createdBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final NumberPath<Long> lastModifiedBy;

    //inherited
    public final DateTimePath<org.joda.time.DateTime> lastModifiedDate;

    // inherited
    public final QState state;

    //inherited
    public final StringPath street1;

    //inherited
    public final StringPath street2;

    //inherited
    public final NumberPath<Long> version;

    //inherited
    public final StringPath zipCode;

    public QContactPersonAddress(String variable) {
        this(ContactPersonAddress.class, forVariable(variable), INITS);
    }

    public QContactPersonAddress(Path<? extends ContactPersonAddress> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactPersonAddress(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactPersonAddress(PathMetadata<?> metadata, PathInits inits) {
        this(ContactPersonAddress.class, metadata, inits);
    }

    public QContactPersonAddress(Class<? extends ContactPersonAddress> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseAddress(type, metadata, inits);
        this.city = _super.city;
        this.country = _super.country;
        this.createdBy = _super.createdBy;
        this.createdDate = _super.createdDate;
        this.lastModifiedBy = _super.lastModifiedBy;
        this.lastModifiedDate = _super.lastModifiedDate;
        this.state = _super.state;
        this.street1 = _super.street1;
        this.street2 = _super.street2;
        this.version = _super.version;
        this.zipCode = _super.zipCode;
    }

}

